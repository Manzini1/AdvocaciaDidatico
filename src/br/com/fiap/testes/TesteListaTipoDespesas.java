//package br.com.fiap.am.ltp.testes;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//import java.util.List;
//
//import br.com.fiap.am.ltp.beans.TipoDepesas;
//import br.com.fiap.am.ltp.bo.LancaDespesaBO;
//import br.com.fiap.am.ltp.conexao.ConexaoFactory;
//import br.com.fiap.am.ltp.excecoes.Excecao;
//
//public class TesteListaTipoDespesas {
//
//	public static void main(String[] args) throws Excecao {
//		Connection c = null;
//		try {
//			String usuario = "";
//			String senha = "";
//			c = ConexaoFactory.controlarInstancia().getConnection(usuario, senha);
//
//			// LancaDespesaDAO dao = new LancaDespesaDAO();
//			List<TipoDepesas> lista = new ArrayList<TipoDepesas>();
//			lista = LancaDespesaBO.listarTipoDespesas(c);
//
//			for (TipoDepesas a : lista) {
//				System.out.println(a.getCodigoDespesa() + a.getDespesa());
//			}
//
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
//
//}
