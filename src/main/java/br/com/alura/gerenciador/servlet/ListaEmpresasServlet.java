package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.pojo.Empresa;

@WebServlet(urlPatterns="/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3788255134023988891L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		
		req.setAttribute("empresas", lista);
		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(req, resp);
		
	}

}
