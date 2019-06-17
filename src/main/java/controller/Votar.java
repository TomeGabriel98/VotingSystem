package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Candidato;
import model.CandidatoDAOImpl;
import model.Eleitor;

@WebServlet(name = "Votar", urlPatterns = {"/Votar"})
public class Votar extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ServletContext sc = req.getServletContext();
		
		try {
			Eleitor eleitor = (Eleitor)req.getSession().getAttribute("eleitorLogado");
			if(eleitor.isLibera()) {
				sc.getRequestDispatcher("/votacao.jsp").forward(req, res);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		CandidatoDAOImpl candidato = new CandidatoDAOImpl();
		int numero = Integer.parseInt(req.getParameter("candidato"));
		Candidato uBD = candidato.findCandidato(numero);
		
		req.getSession().setAttribute("candidato", uBD);
		
		ServletContext sc = req.getServletContext();
		
		if(uBD != null)
			try {
				sc.getRequestDispatcher("/concluido.jsp").forward(req, res);
			} catch(Exception e) {
				e.printStackTrace();
			}
		else {
			try {
				sc.getRequestDispatcher("/votacao.jsp").forward(req, res);
			}catch(Exception e) {}
		}
	}
}
