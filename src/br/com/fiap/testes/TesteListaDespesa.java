package br.com.fiap.am.ltp.testes;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.am.ltp.beans.Despesa;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;
import br.com.fiap.am.ltp.dao.LancaDespesaDAO;

public class TesteListaDespesa {

	public static void main(String[] args) throws Exception{
		Connection c = null;
		try{
			c = ConexaoFactory.controlarInstancia().getConnection("MORAES", "123456");
			
			int numeroProcesso = Integer.parseInt(JOptionPane.showInputDialog("Deseja ver as despesas de qual proceso?"));
			LancaDespesaDAO dao = new LancaDespesaDAO();
			List<Despesa>lstDespesa = dao.listarDespesa(c, numeroProcesso);
			
			for(Despesa d : lstDespesa){
				System.out.println("Data:" + d.getDtDespesa() + "\nTipo :" + d.getTipoDespesa().getDespesa() +
						"\nValor :" +d.getValor() + "\nObservação :" + d.getObservacao());
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
