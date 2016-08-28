package br.com.fiap.am.ltp.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.ltp.beans.Despesa;
import br.com.fiap.am.ltp.beans.Honorario;
import br.com.fiap.am.ltp.dao.LancaHonorarioDAO;
import br.com.fiap.am.ltp.excecoes.Excecao;

public abstract class LancaHonorarioBO {
	static LancaHonorarioDAO dao = new LancaHonorarioDAO();
	
	public static void cadastrarHonorario(Connection c, Honorario h,String validaData) throws Exception{
		if(validaData.equals(dao.getMes(c).trim())){
			dao.cadastrarHononario(c,  h);
		}else{
			
			throw new Excecao("Data deve ser do mês atual");
		}
			
	}
	public static List<Honorario> listarHonorario(Connection c, int numProceso) throws Exception{
		return dao.listarHonorario(c, numProceso);
	}
	
	public static List<Honorario> listarHonorarioCodigo(Connection c, int cdLancamento) throws Exception{
		return dao.listarHonorarioPorCodigo(c, cdLancamento);
	}
	
	public static void atualiza(Connection c, Honorario h, String validaData) throws Exception{
		if(!validaData.equals(dao.getMes(c).trim())){
			throw new Excecao("Data deve ser do mês atual");
		}
		
		if(h.getCodLancamento() == 0 ){
			throw new Excecao("codigo inválido!");
		}
		dao.atualizar(c, h);
	}
	
	public static void deletarHonorarios(Connection c, int cdLancamento)throws Exception{
		 dao.deletarHonorario(c, cdLancamento);
	}
	

}
