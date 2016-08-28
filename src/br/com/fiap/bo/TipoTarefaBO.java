package br.com.fiap.am.ltp.bo;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.am.ltp.beans.TipoTarefa;
import br.com.fiap.am.ltp.dao.TipoTarefaDAO;

public abstract class TipoTarefaBO {
	
	
	
	public static List<TipoTarefa> listar(Connection con) throws Exception{		
		return new TipoTarefaDAO().listarTarefa(con);  
	}
}
