package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.pojo.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa {

    public void executar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        System.out.println("Mostrando empresa...");


        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();
        Empresa empresa = banco.buscarEmpresaPorId(id);

        request.setAttribute("empresa", empresa);
        RequestDispatcher rd = request.getRequestDispatcher("/formEditEmpresa.jsp");
        rd.forward(request, response);
    }

}
