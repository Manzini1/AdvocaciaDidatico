package br.com.fiap.am.ltp.testes;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.ltp.beans.Advogado;
import br.com.fiap.am.ltp.bo.AdvogadoBO;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;

public class TesteAdvogado {
	public static void main(String args[]){
		Connection c=  null;
		
		try{
			String usuario = "OPS$RM74645";
			String senha = "130697";
			c = ConexaoFactory.controlarInstancia().getConnection(usuario, senha);
			List<Advogado> lstAdvogado = new ArrayList<Advogado>();
			lstAdvogado = AdvogadoBO.listaAdvogado(c, 12345);
			for (Advogado a : lstAdvogado){
				System.out.println("Código do advogado: " + a.getCodigoPessoa());
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
