package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Votar", urlPatterns = {"/Votar"})
public class Votar extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch(Exception e) {}
		
		
	}
}
