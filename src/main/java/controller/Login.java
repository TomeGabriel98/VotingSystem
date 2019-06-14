package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		ServletContext sc = req.getServletContext();
		
		try {
			sc.getRequestDispatcher("/index.jsp").forward(req, res);
		} catch(Exception e) {}
	}
}
