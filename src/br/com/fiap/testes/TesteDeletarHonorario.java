package br.com.fiap.am.ltp.testes;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fiap.am.ltp.conexao.ConexaoFactory;
import br.com.fiap.am.ltp.dao.LancaHonorarioDAO;

public class TesteDeletarHonorario {

	static JOptionPane jop = null;
	public static void main(String[] args) throws Exception{
		Connection c = null;
		try{
			c = ConexaoFactory.controlarInstancia().getConnection("OPS$RM74645", "130697");
			 int cdLancamento = Integer.parseInt(jop.showInputDialog("Digite o codigo de lancamento para excluir um honorario"));
			 
			 LancaHonorarioDAO dao = new LancaHonorarioDAO();
			 dao.deletarHonorario(c, cdLancamento);
			 
			 System.out.println("Honorario excluido com sucesso !");
			
		}catch(Exception e){
			e.printStackTrace();
			System.err.println(e);
		}
		

	}

}
