package br.com.fiap.am.ltp.testes;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.am.ltp.beans.Honorario;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;
import br.com.fiap.am.ltp.dao.LancaHonorarioDAO;

public class TesteListarHonorario {

	static JOptionPane jop = null;
	public static void main(String[] args)throws Exception {
		Connection c = null;
		
		try{
			c = ConexaoFactory.controlarInstancia().getConnection("OPS$RM74645", "130697");
			 
			int numeroProcesso = Integer.parseInt(jop.showInputDialog("Informe o numero do processo para listar os honorarios"));
			 LancaHonorarioDAO dao = new LancaHonorarioDAO();
			 List<Honorario> lstHonorario = dao.listarHonorario(c, numeroProcesso);
			
			 
			 for(Honorario h : lstHonorario){
				 System.out.println("Nome do honorário :" + h.getTarefa().getTarefa() + "\nData :" + h.getDataHonorario()
						 + "\nQuantidade de horas :" + h.getQtdeHoras() + "\nObservação : " + h.getObservacao());
				 
				 
			 }
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
