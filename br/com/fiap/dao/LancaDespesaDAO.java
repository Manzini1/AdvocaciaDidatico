package br.com.fiap.am.ltp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.fiap.am.ltp.beans.Despesa;
import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.beans.TipoDepesas;

/**
 * @see LancaDespesaDAO
 * @author Victor Luiz
 * @category Java Class
 * @version Java 8 - 20/10/2015
 */
public class LancaDespesaDAO {
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// Select responsavel por alimentar o campo select no formulário lancar
	// despesa
	/**
	 * @author Manzini
	 * @param c
	 * @param usuario
	 * @param senha
	 * @return lista de despesas
	 * @throws Exception
	 */
	public List<TipoDepesas> listarTipoDespesa(Connection c) throws Exception {
		List<TipoDepesas> lista = new ArrayList<TipoDepesas>();
		stmt = c.prepareStatement("select * from T_AM_ERR_TIPO_DESPESA");
		rs = stmt.executeQuery();

		while (rs.next()) {
			TipoDepesas td = new TipoDepesas();
			td.setCodigoDespesa(rs.getInt("cd_tipo_despesa"));
			td.setDespesa(rs.getString("ds_tipo_despesa"));

			lista.add(td);

		}
		rs.close();
		stmt.close();
		return lista;

	}

	// Método responsavel por alimentar o camo selec no formulario lancar
	// despesas
	/**
	 * @author Filipe
	 * @param c
	 * @param usuario
	 * @param senha
	 * @return lista de processos
	 * @throws Exception
	 */
	public List<Processo> listaProcesso(Connection c) throws Exception {
		List<Processo> lista = new ArrayList<Processo>();
		stmt = c.prepareStatement("select nr_processo from T_AM_ERR_PROCESSO");
		rs = stmt.executeQuery();
		while (rs.next()) {
			Processo p = new Processo();
			p.setNumProcesso(rs.getInt("nr_processo"));

			lista.add(p);
		}
		rs.close();
		stmt.close();

		return lista;

	}
	
	/*public void cadastrarDespesa(Despesa d ,Connection c,int numProcesso)throws Exception{
		stmt = c.prepareStatement("insert into T_AM_ERR_LANCA_DESPESA (cd_lancamento,cd_tipo_despesa,nr_processo,dt_despesa,vl_despesa"
				+ "ds_observacao) values(SQ_AM_LANCA_DESPESA.nextval,?,?,?,?,?)");
			
		stmt.setInt(1, d.getTipoDespesa().getCodigoDespesa());
		stmt.setInt(2, numProcesso);
		stmt.setDate(3,new Date(d.getDtDespesa().getTimeInMillis()));
		stmt.setFloat(4, d.getValor());
		stmt.setString(5, d.getObservacao());
		
		stmt.execute();
		
	}*/
	public void cadastrarDespesa(Despesa d ,Connection c)throws Exception{
		stmt = c.prepareStatement("insert into T_AM_ERR_LANCA_DESPESA (cd_lancamento,cd_tipo_despesa,nr_processo,dt_despesa,vl_despesa,ds_observacao)"
				+ " values(SQ_AM_LANCA_DESPESA.nextval,?,?,TO_DATE(?, 'YYYY-MM-DD'),?,?)");
			
		stmt.setInt(1, d.getTipoDespesa().getCodigoDespesa());
		stmt.setInt(2,d.getNrProcesso().getNumProcesso());
		stmt.setString(3, d.getDtDespesa());
		stmt.setFloat(4, d.getValor());
		stmt.setString(5, d.getObservacao());
		
		stmt.execute();
		
	}
	public List<Despesa>listarDespesa(Connection c,int numeroProcesso)throws Exception{
		List<Despesa>lstDespesa = new ArrayList<>();
		String sql = "select T_AM_ERR_LANCA_DESPESA.cd_lancamento, TO_CHAR(T_AM_ERR_LANCA_DESPESA.dt_despesa, 'DD/MM/YYYY') \"DT_DESPESA\" ,T_AM_ERR_TIPO_DESPESA.ds_tipo_despesa,T_AM_ERR_LANCA_DESPESA.vl_despesa,"
				+ "T_AM_ERR_LANCA_DESPESA.ds_observacao "
				+ "from T_AM_ERR_TIPO_DESPESA INNER JOIN T_AM_ERR_LANCA_DESPESA "
				+ "ON (T_AM_ERR_TIPO_DESPESA.CD_TIPO_DESPESA = T_AM_ERR_LANCA_DESPESA.CD_TIPO_DESPESA )"
				+ "where nr_processo = " + numeroProcesso;
		stmt = c.prepareStatement(sql);
		rs = stmt.executeQuery();
		while(rs.next()){
			TipoDepesas td = new TipoDepesas();
			Despesa d = new Despesa();
			td.setDespesa(rs.getString("ds_tipo_despesa"));
			
			d.setCodigoLancamento(rs.getInt("cd_lancamento"));
			d.setDtDespesa(rs.getString("dt_despesa"));
			d.setTipoDespesa(td);
			d.setValor(rs.getFloat("vl_despesa"));
			d.setObservacao(rs.getString("ds_observacao"));
			
			lstDespesa.add(d);
			
		}
		rs.close();
		stmt.close();
		return lstDespesa;
	}
	
	public String getMes(Connection c )throws Exception{

		 Date data = new Date();

		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		  String mes = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);  

		  return mes;
		
	}
	
	public void deletarDespesa(Connection c, int cdLancamento)throws Exception{
		String sql="delete from T_AM_ERR_LANCA_DESPESA where cd_lancamento = " + cdLancamento;
		stmt = c.prepareStatement(sql);
		stmt.execute();
		stmt.close();
	}
	

		public int atualizar(Connection c,float valor,String dtDespesa,String dsOBS,int cdLancamento)throws Exception{
				String sql = "update T_AM_ERR_LANCA_DESPESA SET DT_DESPESA = ?,VL_DESPESA = ?,DS_OBSERVACAO = ? "
						+ " where cd_lancamento = ?";
				stmt = c.prepareStatement(sql);
				stmt.setString(1,dtDespesa);
				stmt.setFloat(2, valor);
				stmt.setString(3, dsOBS);
				stmt.setInt(4, cdLancamento);
				
				int saida = stmt.executeUpdate();
				stmt.close();
				
				return saida;
				
			}

	

}
