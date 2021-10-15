package br.com.alura.gerenciador.servlet;

import java.io.PrintWriter;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class OiMundo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res){
		// TODO Auto-generated method stub
		try {
			PrintWriter out = res.getWriter();
			out.print("<html>\n<body>\n Parabens, voce criou seu primeiro servlet! \n</body>\n</html>");
		}
		catch(Exception ex) {
			System.out.println("Erro ao executar.");
			ex.printStackTrace();			
		}
	}
	
}
