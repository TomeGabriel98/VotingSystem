package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Candidato;
import model.CandidatoDAOImpl;
import model.Eleitor;
import model.EleitorDAOImpl;
import model.VotoDAOImpl;

@WebServlet(name = "Votar", urlPatterns = {"/Votar"})
public class Votar extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String verify = null;
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ServletContext sc = req.getServletContext();
		
		try {
			sc.getRequestDispatcher("/votacao.jsp").forward(req, res);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String verify = null;
		
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		CandidatoDAOImpl candidato = new CandidatoDAOImpl();
		int numero = Integer.parseInt(req.getParameter("candidato"));
		Candidato uBD = candidato.findCandidato(numero);
		VotoDAOImpl voto = new VotoDAOImpl();
		
		req.getSession().setAttribute("candidato", uBD);
		
		ServletContext sc = req.getServletContext();
		
		if(uBD != null)
			try {
				voto.vota(numero);
				
				EleitorDAOImpl eleitor = new EleitorDAOImpl();
				Eleitor e = (Eleitor)req.getSession().getAttribute("eleitorLogado");
				String titulo = e.getTitulo();
				
				eleitor.bloqueiaVoto(titulo);
				
				sc.getRequestDispatcher("/concluido.jsp").forward(req, res);
			} catch(Exception e) {
				e.printStackTrace();
			}
		else {
			try {
				verify = "true";
				req.getSession().setAttribute("verify", verify);
				sc.getRequestDispatcher("/votacao.jsp").forward(req, res);
			}catch(Exception e) {}
		}
	}
}
