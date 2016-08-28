package br.com.fiap.am.ltp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.am.ltp.beans.Advogado;
import br.com.fiap.am.ltp.beans.Cliente;
import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.beans.TipoCausa;

public class ProcessoDAO {
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	
	/**
	 * @author Filipe
	 * @param c
	 * @param usuario
	 * @param senha
	 * @return lista de processos
	 * @throws Exception
	 */
	public List<Processo> listaProcessoFechado(Connection c,int numOAB) throws Exception {
		List<Processo> lista = new ArrayList<Processo>();
		String sql = "SELECT NR_PROCESSO, DS_OBSERVACAO, DS_PROCESSO, TO_CHAR(DT_ABERTURA, 'DD/MM/YYYY') \"DT_ABERTURA\", DS_CAUSA, DS_RAZAO_SOCIAL FROM PROCESSOSFECHADOS WHERE NR_OAB = ?";
		
		stmt = c.prepareStatement(sql);
		stmt.setInt(1, numOAB);
		rs = stmt.executeQuery()	;
		while (rs.next()) {
			Processo p = new Processo();
			p.setNumProcesso(rs.getInt("NR_PROCESSO"));
			p.setObservacao(rs.getString("DS_OBSERVACAO"));
			p.setDescricao(rs.getString("DS_PROCESSO"));
			p.setDtAbertura(rs.getString("DT_ABERTURA"));
			
			Cliente cli = new Cliente();
			cli.setRazaoSocial(rs.getString("DS_RAZAO_SOCIAL"));
			
			TipoCausa cau = new TipoCausa();
			cau.setCausa(rs.getString("DS_CAUSA"));
			
			
			p.setCliente(cli); 
			p.setCausa(cau);

			lista.add(p);
		}
		rs.close();
		stmt.close();

		return lista;

	}
	public List<Processo> listaProcessoAberto(Connection c,int numOAB) throws Exception {
		List<Processo> lista = new ArrayList<Processo>();
		String sql = "SELECT  NR_PROCESSO, DS_OBSERVACAO, DS_PROCESSO, TO_CHAR(DT_ABERTURA, 'DD/MM/YYYY') \"DT_ABERTURA\", DS_CAUSA, DS_RAZAO_SOCIAL  FROM PROCESSOS WHERE NR_OAB = ?";
		
		stmt = c.prepareStatement(sql);
		stmt.setInt(1, numOAB);
		
		
		rs = stmt.executeQuery();
		while (rs.next()) {
			Processo p = new Processo();
			p.setNumProcesso(rs.getInt("NR_PROCESSO"));
			p.setObservacao(rs.getString("DS_OBSERVACAO"));
			p.setDescricao(rs.getString("DS_PROCESSO"));
			p.setDtAbertura(rs.getString("DT_ABERTURA"));
			
			Cliente cli = new Cliente();
			cli.setRazaoSocial(rs.getString("DS_RAZAO_SOCIAL"));
			
			TipoCausa cau = new TipoCausa();
			cau.setCausa(rs.getString("DS_CAUSA"));
			
			
			p.setCliente(cli); 
			p.setCausa(cau);

			lista.add(p);
		}
		
		rs.close();
		stmt.close();

		return lista;

	}
}
