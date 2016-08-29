package br.com.fiap.am.ltp.testes;

import java.sql.Connection;

import br.com.fiap.am.ltp.beans.Despesa;
import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.beans.TipoDepesas;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;
import br.com.fiap.am.ltp.dao.LancaDespesaDAO;

public class TesteCadastrarDespesa {

	public static void main(String[] args) throws Exception{
		
		Connection c = null;
		try{
			String usuario = "OPS$RM74645";
			String senha = "130697";
			c = ConexaoFactory.controlarInstancia().getConnection(usuario, senha);
			
			//Preenchendo atributos de referencia da tabela Despesas 
			Processo p = new Processo();
			p.setNumProcesso(5);
			 TipoDepesas td = new TipoDepesas();
			 td.setCodigoDespesa(1);
			//Preencher tabela Despesas
			Despesa d = new Despesa();
			
			d.setTipoDespesa(td);
			d.setNrProcesso(p);
			d.setDtDespesa("29/10/2013");
			d.setValor(200);
			d.setObservacao("CHURROS");
			
			
			LancaDespesaDAO dap = new LancaDespesaDAO();
			dap.cadastrarDespesa(d, c);
			
			
			System.out.println("Despesa cadastrada com sucesso !");
			
			
			
		}catch(Exception e ){
			e.printStackTrace();
			System.out.println(e);
		}
		

	}

}
