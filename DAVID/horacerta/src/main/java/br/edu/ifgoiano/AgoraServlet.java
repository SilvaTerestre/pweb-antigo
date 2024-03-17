package br.edu.ifgoiano;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/agora")
public class AgoraServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Funfou");
		
		String data = new Date().toString();
		
		String html = "<html> <body><h1>" + data + "</h1> </body></html>";
		
		resp.setContentType("text/html;charset=UTF=8");
		resp.getWriter().print(html);
		
		//testando  commit
	}
}
