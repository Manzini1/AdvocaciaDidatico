package br.com.fiap.am.ltp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.am.ltp.beans.Honorario;
import br.com.fiap.am.ltp.beans.Processo;
import br.com.fiap.am.ltp.beans.TipoTarefa;
import br.com.fiap.am.ltp.bo.LancaHonorarioBO;
import br.com.fiap.am.ltp.bo.TipoTarefaBO;
import br.com.fiap.am.ltp.conexao.ConexaoFactory;
@WebServlet("/LancaHonorario")
public class HonorarioServlet extends HttpServlet{
	static Connection c = null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			
			c = ConexaoFactory.controlarInstancia().getConnection(null,null);
			
			String acao = req.getParameter("acao");
			
			String retorno ="";
			listarTipoTarefa(req);
			switch (acao) {
			case "alterar":
				
				listarHonorarios(req);
				listarHonorarioCodigo(req);
				retorno="Honorario.jsp";
				
				break;
			case "Atualizar":
				
				atualizarHonorario(req);
				listarHonorarios(req);
				retorno="Honorario.jsp";
				
				break;
			case "Cadastrar":
				cadastrarHonorario(req);
				listarHonorarios(req);
				retorno="Honorario.jsp";
				break;
			case "deletar":
				deletar(req);
				listarHonorarios(req);
				retorno="Honorario.jsp";
				break;
			}
			

			req.getRequestDispatcher(retorno).forward(req, resp);
		}catch(Exception e){
			req.setAttribute("error",e.getMessage());
			e.printStackTrace();
		}finally{
			try{
				c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try{
			
			c = ConexaoFactory.controlarInstancia().getConnection(null,null);
			String acao = req.getParameter("acao");
			String retorno ="";
			listarTipoTarefa(req);
			switch (acao) {
			case "listar":
				listarHonorarios(req);
				retorno="Honorario.jsp";
				break;
			case "alterar":
				listarHonorarios(req);
				listarHonorarioCodigo(req);
				retorno="Honorario.jsp";
			
			}
			req.getRequestDispatcher(retorno).forward(req, resp);
		}catch(Exception e){
			req.setAttribute("error",e.getMessage());
			e.printStackTrace();
		}finally{
			try{
				c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	public void listarHonorarios(HttpServletRequest req)throws Exception{
		try{
			int numProcesso =Integer.parseInt(req.getParameter("num"));
			
			int numOAB = Integer.parseInt(req.getParameter("numOAB"));
			
			
			
			req.setAttribute("numOAB", numOAB);
			List<Honorario>lstHonorarios = new ArrayList<Honorario>();
			lstHonorarios = LancaHonorarioBO.listarHonorario(c, numProcesso);
			
			req.setAttribute("lancaHonorarios", lstHonorarios);
			
			//Passando numero do processo para o jsp
			req.setAttribute("numProcesso", numProcesso);
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Erro"); 
			
		}
		
		
		
		
	}
	public void listarHonorarioCodigo(HttpServletRequest req)throws Exception{
		try{
			int cdLancamento =Integer.parseInt(req.getParameter("cdLancamento"));
			int numProcesso = Integer.parseInt(req.getParameter("num"));
			int numOAB = Integer.parseInt(req.getParameter("numOAB"));
			req.setAttribute("numOAB", numOAB);
			List<Honorario>lstHonorarios = new ArrayList<Honorario>();
			lstHonorarios = LancaHonorarioBO.listarHonorarioCodigo(c, cdLancamento);
			//recupera parametros
			int codigo = lstHonorarios.get(0).getCodLancamento();
			
			int codTarefa = lstHonorarios.get(0).getTarefa().getCodigoTipoTarefa();
			String dt_ocorrencia = lstHonorarios.get(0).getDataHonorario();
			double qtdeHoras = lstHonorarios.get(0).getQtdeHoras();
			String ds_observacao = lstHonorarios.get(0).getObservacao();
			//Passando numero do processo para o jsp
			req.setAttribute("numProcesso", numProcesso);
			req.setAttribute("codigoTarefa", codTarefa);
			req.setAttribute("data", dt_ocorrencia);
			req.setAttribute("qtdeHoras", qtdeHoras);
			req.setAttribute("obs", ds_observacao);
			req.setAttribute("codLancamento", codigo);
			req.setAttribute("regra", "disabled");
			req.setAttribute("tipo", "Atualizar");
			
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Erro"); 
	
		}
		
	
	}
	public void atualizarHonorario(HttpServletRequest req)throws Exception{
		try{
			
			int numOAB = Integer.parseInt(req.getParameter("numOAB"));
			int numProcesso = Integer.parseInt(req.getParameter("num"));
			
			int cdLancamento =Integer.parseInt(req.getParameter("codLancamento"));
			

			
			String dataOcorrencia = req.getParameter("dtOcorreHonorario");
			String dataValidada = dataOcorrencia.substring(5,7);
			
			
			double horas = Double.parseDouble(req.getParameter("txtHoras"));
			
			
			
			String obs = req.getParameter("txtHObs");
			TipoTarefa t = new TipoTarefa();
			
			Processo p = new Processo();
			p.setNumProcesso(numProcesso);
			
			Honorario h = new Honorario(cdLancamento, t, p, dataOcorrencia, horas, obs);
			
			
			LancaHonorarioBO.atualiza(c, h, dataValidada);
			req.setAttribute("numOAB", numOAB);
			req.setAttribute("numProcesso", numProcesso);
		
		}catch(Exception e){
			req.setAttribute("error",e.getMessage());
		}
	}
	public void listarTipoTarefa(HttpServletRequest req)throws Exception{
		try{
			List<TipoTarefa> lstTarefa = new ArrayList<TipoTarefa>();
			lstTarefa = TipoTarefaBO.listar(c);
			req.setAttribute("TipoTarefas", lstTarefa);
		}catch (Exception e){
			req.setAttribute("error",e.getMessage());
		}
	}
	
	
	public void  cadastrarHonorario(HttpServletRequest req)throws Exception{
		try{
		
			int numOAB = Integer.parseInt(req.getParameter("numOAB"));
			int numProcesso = Integer.parseInt(req.getParameter("num"));
			
			String dataOcorrencia = req.getParameter("dtOcorreHonorario");
			
			
	
			
			
			if (dataOcorrencia.indexOf('/') >= 0){
				String dia = dataOcorrencia.substring(0,2);
				String mes = dataOcorrencia.substring(3,5);
				String ano = dataOcorrencia.substring(6,10);
				dataOcorrencia = ano + "-" + mes + "-" + dia;
			}
			
			
			String dataValidada = dataOcorrencia.substring(5,7);
			
			
			double horas = Double.parseDouble(req.getParameter("txtHoras"));
			int codigoTarefa = Integer.parseInt(req.getParameter("slcTarefa"));
			String obs = req.getParameter("txtHObs");
			TipoTarefa t = new TipoTarefa();
			t.setCodigoTipoTarefa(codigoTarefa);
			Processo p = new Processo();
			p.setNumProcesso(numProcesso);
			
			Honorario h = new Honorario();
			
			h.setDataHonorario(dataOcorrencia);
			h.setNrProcesso(p);
			h.setObservacao(obs);
			h.setTarefa(t);
			h.setQtdeHoras(horas);
			
			LancaHonorarioBO.cadastrarHonorario(c, h, dataValidada);
			
			req.setAttribute("msg", "Honorário cadastrado com sucesso!");
		}catch (Exception e){
			
			req.setAttribute("error", "Só é possível lançar honorário do mês atual!");
			e.printStackTrace();
		}
	}
	
	public void deletar(HttpServletRequest req){
		try{
			int codLancamento = Integer.parseInt(req.getParameter("cdLancamento"));
			LancaHonorarioBO.deletarHonorarios(c, codLancamento);
			
			req.setAttribute("msg", "Honorario deletado com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
			req.setAttribute("error", e.getMessage());
		}
		
		
	}
	
	
}
