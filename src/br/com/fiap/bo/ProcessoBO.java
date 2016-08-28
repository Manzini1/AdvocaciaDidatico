package br.com.fiap.am.ltp.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.dao.ProcessoDAO;

public abstract class ProcessoBO {
	static ProcessoDAO dao = new ProcessoDAO();
	
	public static List<Processo> listarProcessoAberto(Connection c,int numOAB) throws Exception {
		return dao.listaProcessoAberto(c,numOAB);

	}
	public static List<Processo> listarProcessoFechado(Connection c,int numOAB) throws Exception {
		return dao.listaProcessoFechado(c,numOAB);

	}
}
