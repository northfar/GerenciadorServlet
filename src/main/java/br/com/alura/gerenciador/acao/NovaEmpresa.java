package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.pojo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NovaEmpresa {

    public void executar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        System.out.println("Criando empresa...");

        PrintWriter out = response.getWriter();
        String novaEmpresa = request.getParameter("nome");
        String paramData = request.getParameter("data");
        Date dataAbertura = null;

        System.out.println("Cadastrando nova empresa.");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataAbertura = sdf.parse(paramData);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNome(novaEmpresa);
        empresa.setDataAbertura(dataAbertura);
        Banco banco = new Banco();
        banco.adicionar(empresa);

        request.setAttribute("empresa", novaEmpresa);
        request.setAttribute("dataAbertura", dataAbertura);

        response.sendRedirect("entrada?acao=ListaEmpresa");

        //  RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
        //  rd.forward(request, response);

    }

}
