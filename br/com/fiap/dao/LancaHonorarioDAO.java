package br.com.fiap.am.ltp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.fiap.am.ltp.beans.Honorario;
import br.com.fiap.am.ltp.beans.TipoTarefa;

public class LancaHonorarioDAO {
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	
	
	public void cadastrarHononario(Connection c, Honorario h)throws Exception{
		String sql="insert into T_AM_ERR_LANCA_HONORARIO (CD_LANCAMENTO,CD_TIPO_TAREFA,NR_PROCESSO,DT_HONORARIO,QT_HORA,DS_OBSERVACAO)"
				+ " values(SQ_AM_LANCA_HONORARIO.nextval,?,?,TO_DATE(? , 'YYYY-MM-DD'),?,?) ";
		stmt = c.prepareStatement(sql);
		stmt.setInt(1, h.getTarefa().getCodigoTipoTarefa());
		stmt.setInt(2, h.getNrProcesso().getNumProcesso());
		stmt.setString(3, h.getDataHonorario());
		stmt.setDouble(4, h.getQtdeHoras());
		stmt.setString(5, h.getObservacao());
		
		stmt.execute();
		
				
		
	}
	
	public List<Honorario> listarHonorario(Connection c,int numeroProcesso)throws Exception{
		
		List<Honorario>lstHonorario  = new ArrayList<Honorario>();
		String sql = " select CD_LANCAMENTO, DS_TIPO_TAREFA, TO_CHAR(DT_HONORARIO, 'DD/MM/YYYY') \"DT_HONORARIO\", QT_HORA, DS_OBSERVACAO, TOTAL from LANCAHONORARIO" +
					" where NR_PROCESSO = ?";
		stmt = c.prepareStatement(sql);
		stmt.setInt(1, numeroProcesso);
		rs = stmt.executeQuery();
		while(rs.next()){
			TipoTarefa tt = new TipoTarefa();
			tt.setTarefa(rs.getString("DS_TIPO_TAREFA"));
			
			Honorario h = new Honorario();
			h.setCodLancamento(rs.getInt("CD_LANCAMENTO"));
			h.setDataHonorario(rs.getString("DT_HONORARIO"));
			h.setQtdeHoras(rs.getDouble("QT_HORA"));
			h.setObservacao(rs.getString("DS_OBSERVACAO"));
			h.setTotal(rs.getDouble("Total"));
			
			h.setTarefa(tt);
			
			lstHonorario.add(h);
			
		}
		rs.close();
		stmt.close();
		
		
		
		
		return lstHonorario;

	}
public List<Honorario> listarHonorarioPorCodigo(Connection c,int cdLancamento)throws Exception{
		
		List<Honorario>lstHonorario  = new ArrayList<Honorario>();
		String sql = " select CD_TIPO_TAREFA, CD_LANCAMENTO, TO_CHAR(DT_HONORARIO, 'YYYY-MM-DD') \"DT_HONORARIO\", QT_HORA, DS_OBSERVACAO, TOTAL from LANCAHONORARIO" +
					" where CD_LANCAMENTO = ?";
		stmt = c.prepareStatement(sql);
		stmt.setInt(1, cdLancamento);
		rs = stmt.executeQuery();
		while(rs.next()){
			TipoTarefa tt = new TipoTarefa();
			
			tt.setCodigoTipoTarefa(rs.getInt("CD_TIPO_TAREFA"));
			
			Honorario h = new Honorario();
			h.setCodLancamento(rs.getInt("CD_LANCAMENTO"));
			h.setDataHonorario(rs.getString("DT_HONORARIO"));
			h.setQtdeHoras(rs.getDouble("QT_HORA"));
			h.setObservacao(rs.getString("DS_OBSERVACAO"));
			h.setTotal(rs.getDouble("Total"));
			
			h.setTarefa(tt);
			
			lstHonorario.add(h);
			
		}
		rs.close();
		stmt.close();
		
		
		
		
		return lstHonorario;

	}
	
	
	
	public void deletarHonorario(Connection c , int cdLancamento)throws Exception{
		String sql="delete T_AM_ERR_LANCA_HONORARIO WHERE CD_LANCAMENTO = " + cdLancamento;
		
		stmt = c.prepareStatement(sql);
		stmt.execute();
		stmt.close();
	}
	public String getMes(Connection c )throws Exception{

		 Date data = new Date();

		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		  String mes = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);  

		  return mes;
		
	}

	public int atualizar(Connection c, Honorario h)throws Exception{
			String sql = "update T_AM_ERR_LANCA_HONORARIO SET DT_HONORARIO = TO_DATE(? , 'YYYY-MM-DD'),QT_HORA = ? ,DS_OBSERVACAO = ? "
					+ " where cd_lancamento = ?";
			stmt = c.prepareStatement(sql);
			stmt.setString(1,h.getDataHonorario());
			stmt.setDouble(2, h.getQtdeHoras());
			stmt.setString(3, h.getObservacao());
			stmt.setInt(4, h.getCodLancamento());
			
			int saida = stmt.executeUpdate();
			stmt.close();
			
			return saida;
			
		}
	
	

}
