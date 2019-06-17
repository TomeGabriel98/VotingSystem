package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Candidato;
import model.CandidatoDAOImpl;
import model.VotoDAOImpl;

@WebServlet(name="Relatorio", urlPatterns= {"/Relatorio"})
public class Relatorio extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		Map<String, Integer> relatorio = new HashMap<String, Integer>();
		
		CandidatoDAOImpl candidato = new CandidatoDAOImpl();
		VotoDAOImpl voto = new VotoDAOImpl();
		List<Candidato> candidatos = candidato.listar();
		
		for (Candidato cand : candidatos) {
			int votos = voto.contaVoto(cand.getNumero());
			
			relatorio.put(cand.getNome(), votos);
		}
		
		req.getSession().setAttribute("candidatos", relatorio);
		ServletContext sc = req.getServletContext();
		
		try {
			sc.getRequestDispatcher("/relatorio.jsp").forward(req, res);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
