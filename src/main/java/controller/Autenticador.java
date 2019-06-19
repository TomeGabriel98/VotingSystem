package controller;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Eleitor;
import model.EleitorDAOImpl;

@WebServlet(name="Autentica", urlPatterns= {"/Autentica"})
public class Autenticador extends HttpServlet {	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String mensagem = null;
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {}
		
		String titulo = req.getParameter("id");
		String senha = req.getParameter("senha");
		ServletContext sc = req.getServletContext();
		
		EleitorDAOImpl eleitor = new EleitorDAOImpl();
		Eleitor uBD = eleitor.findByTitle(titulo);
		
		if(uBD != null && uBD.getSenha().equals(senha)) {
			try {
				req.getSession().setAttribute("titulo", titulo);
				req.getSession().setAttribute("senha", senha);
				req.getSession().setAttribute("eleitorLogado", uBD);
				
				sc.getRequestDispatcher("/menu.jsp").forward(req, res);
			} catch(Exception e) {}
		}
		else {
			try {
				//req.setAttribute("Falha na autenticação", true);
				
				mensagem = "Usuário Inválido";
				req.getSession().setAttribute("mensagem", mensagem);
				sc.getRequestDispatcher("/index.jsp").forward(req, res);
			} catch(Exception e) {}
		}
		
	}
}
