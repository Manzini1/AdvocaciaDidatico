package br.com.fiap.am.ltp.testes;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fiap.am.ltp.conexao.ConexaoFactory;
import br.com.fiap.am.ltp.dao.LancaDespesaDAO;

public class TesteDeletaDespesa {

	static JOptionPane jop;
	public static void main(String[] args)throws Exception {
		Connection c = null;
		try{
			String usuario = "OPS$RM74645";
			String senha = "130697";
			
			c = ConexaoFactory.controlarInstancia().getConnection(usuario, senha);
			int cdLancamento = Integer.parseInt(jop.showInputDialog("Digite o codigo de lancamento para deletar uma despesa"));
			LancaDespesaDAO dao = new LancaDespesaDAO();
			dao.deletarDespesa(c, cdLancamento);
			
			System.out.println("Despesa deletada com sucesso !");
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
		

	}

}
