package br.com.fiap.am.ltp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.ltp.beans.TipoTarefa;


public class TipoTarefaDAO {
	
	
	List<TipoTarefa> lstTarefa = new ArrayList<TipoTarefa>();
	

	
	public List<TipoTarefa> listarTarefa(Connection con) throws SQLException{
		
		String sql = "select * from T_AM_ERR_TIPO_TAREFA";
		PreparedStatement estrutura = con.prepareStatement(sql);
		ResultSet resultaDados = estrutura.executeQuery();
		while (resultaDados.next()){
			TipoTarefa ta = new TipoTarefa();
			ta.setTarefa(resultaDados.getString("DS_TIPO_TAREFA"));
			ta.setCodigoTipoTarefa(resultaDados.getInt("CD_TIPO_TAREFA"));
			lstTarefa.add(ta);
		}
		
		resultaDados.close();
		estrutura.close();
		return  lstTarefa;
	}
}
