package br.edu.ifgoiano;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agora")
public class AgoraServerlet extends HttpServlet {

		private static final long serialVersionUID = 7769396913830609225L;

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// processamento de back end
			String data = new Date().toString();
			
			// armazenar valores necessarios para a JSP
			req.setAttribute("dataHora", data)
			;
			// retorna para a pagina dataHoraCerta.jsp
			req.getRequestDispatcher("dataHoraCerta.jsp")
				.forward(req, resp);
			
			// retornava a pagina completa para a requisicao
			//String html = "<html><body><h1>" + data + "</h1></body></html>";
			//resp.setContentType("text/html;charset=UTF-8");
			//resp.getWriter().print(html); 
		}
	
}
