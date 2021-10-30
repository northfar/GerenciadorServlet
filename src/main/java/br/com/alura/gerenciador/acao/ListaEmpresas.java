package br.com.alura.gerenciador.acao;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.pojo.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListaEmpresas {

    public void executar(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        System.out.println("Listando empresas...");

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        req.setAttribute("empresas", lista);
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        rd.forward(req, res);
    }

}
