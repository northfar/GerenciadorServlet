package br.com.alura.gerenciador.servlet;

import br.com.alura.gerenciador.acao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String paramAcao = request.getParameter("acao");
        switch(paramAcao){
            case "ListaEmpresa":
                 ListaEmpresas lista = new ListaEmpresas();
                 lista.executar(request, response);
                break;
            case "NovaEmpresa":
                NovaEmpresa novaEmp = new NovaEmpresa();
                novaEmp.executar(request,response);
                break;
            case "MostraEmpresa":
                MostraEmpresa show = new MostraEmpresa();
                show.executar(request,response);
                break;
            case "AlteraEmpresa":
                AlteraEmpresa edit = new AlteraEmpresa();
                edit.executar(request,response);
                break;
            case "RemoveEmpresa":
                RemoveEmpresa delete = new RemoveEmpresa();
                delete.executar(request,response);
                break;
            default: System.out.println("Ação desconhecida!"); break;
        }

    }

}
