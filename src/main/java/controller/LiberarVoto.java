package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Eleitor;
import model.EleitorDAOImpl;

@WebServlet(name="LiberaVotacao", urlPatterns= {"/LiberaVotacao"})
public class LiberarVoto extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		String titulo = (String) req.getSession().getAttribute("titulo");
		EleitorDAOImpl eleitor = new EleitorDAOImpl();
		ServletContext sc = req.getServletContext();
        
		try{
			Eleitor uBD = eleitor.findByTitle(titulo);
			req.getSession().setAttribute("eleitor", uBD);
			
        	sc.getRequestDispatcher("/liberar.jsp").forward(req, res);            
        } catch (Exception e){
        	e.printStackTrace();
        }
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		String validou = null;
		String nulo = null;
		
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		String titulo = req.getParameter("titulo");
		EleitorDAOImpl eleitor = new EleitorDAOImpl();
		ServletContext sc = req.getServletContext();
		
		try {
			eleitor.liberaVoto(titulo);
			Eleitor uBD = eleitor.findByTitle(titulo);
			if(uBD != null)	req.getSession().setAttribute("eleitor", uBD);
			else nulo = "true";
			req.getSession().setAttribute("nulo", nulo);
			//System.out.println(req.getAttribute("eleitor"));
			
			validou = "true";
			req.getSession().setAttribute("validou", validou);
			sc.getRequestDispatcher("/liberar.jsp").forward(req, res);
		} catch(Exception e) {
			
		}
	}
	
}
