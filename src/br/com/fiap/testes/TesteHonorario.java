package br.com.fiap.am.ltp.testes;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.ltp.beans.Honorario;
import br.com.fiap.am.ltp.bo.LancaDespesaBO;
import br.com.fiap.am.ltp.bo.LancaHonorarioBO;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;

public class TesteHonorario {
	public static void main(String args[]){
		List<Honorario> lsthonorario = new ArrayList<Honorario>();
		
		
		
		
		try {
			int numProcesso = 9;
			Connection c = ConexaoFactory.controlarInstancia().getConnection(null, null);
			lsthonorario = LancaHonorarioBO.listarHonorario(c, numProcesso);
			for (Honorario obj : lsthonorario){
				System.out.println("Tarefa: "+ obj.getTarefa().getTarefa());
				System.out.println("Data: "+ obj.getDataHonorario());
				System.out.println("Horas: "+ obj.getQtdeHoras());
				System.out.println("Obs: " + obj.getObservacao());
				System.out.println("Total: " + obj.getTotal());
			}
		} catch (Exception e) {
			// 
			System.out.println(e.getMessage());
		}
	}
}
