package br.com.fiap.am.ltp.testes;

import java.sql.Connection;

import br.com.fiap.am.ltp.beans.Honorario;
import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.beans.TipoTarefa;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;
import br.com.fiap.am.ltp.dao.LancaHonorarioDAO;

public class TesteCadastraHonorario {

	public static void main(String[] args) throws Exception{
		Connection c = null;
		try{
			c = ConexaoFactory.controlarInstancia().getConnection("OPS$RM74645", "130697");
			
			TipoTarefa tp = new TipoTarefa();
			tp.setCodigoTipoTarefa(2);
			
			Processo p = new Processo();
			p.setNumProcesso(25);
			
			Honorario ho = new Honorario();
			ho.setNrProcesso(p);
			ho.setTarefa(tp);
			ho.setDataHonorario("13/03/2013");
			ho.setQtdeHoras(10);
			ho.setObservacao("TESTE TESTE");
			
			LancaHonorarioDAO dao = new LancaHonorarioDAO();
			dao.cadastrarHononario(c, ho);
			
			System.out.println("Honorario cadastrado com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
		

	}

}
