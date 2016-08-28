package br.com.fiap.am.ltp.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.ltp.beans.Despesa;
import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.beans.TipoDepesas;
import br.com.fiap.am.ltp.dao.LancaDespesaDAO;
import br.com.fiap.am.ltp.excecoes.Excecao;

/**
 * @see LancaDespesaBO
 * @author Victor
 * @category Java Class
 * @version Java 8 - 20/10/2015
 */

public abstract class LancaDespesaBO {
	static LancaDespesaDAO dao = new LancaDespesaDAO();

	/**
	 * 
	 * @param c
	 * @return Listar Despesa
	 * @throws Exception
	 */
	public static List<TipoDepesas> listarTipoDespesas(Connection c) throws Exception {
		return dao.listarTipoDespesa(c);

	}

	/**
	 * 
	 * @param c
	 * @return Lista Processos
	 * @throws Exception
	 */

	public static void deletarDespesa(Connection c,int cdLancamento)throws Exception{
		dao.deletarDespesa(c, cdLancamento);
	}
	
	public static void cadastrarDespesa(Connection c, Despesa d,String validaData) throws Exception{
		if(validaData.equals(dao.getMes(c))){
			dao.cadastrarDespesa(d,c);
		}else{
			throw new Excecao("Data deve ser do mês atual");
		}
			
	}
	public static List<Despesa> listarDespesas(Connection c,int numeroProcesso) throws Exception{
		return dao.listarDespesa(c, numeroProcesso);
	}

}
