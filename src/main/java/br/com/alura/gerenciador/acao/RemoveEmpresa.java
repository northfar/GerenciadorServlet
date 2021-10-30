package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.dao.Banco;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa {

    public void executar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        System.out.println("Removendo empresa...");


        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        Banco banco = new Banco();
        banco.remover(id);

        response.sendRedirect("entrada?acao=ListaEmpresa");

    }

}
