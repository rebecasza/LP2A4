package br.com.ifsp;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/livro/lista")
public class ListaLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ListaLivro() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Livro> lista = banco.getListaLivro();
		
		for (Livro livro : lista) {
		}
		
		request.setAttribute("livro", lista);

		RequestDispatcher rd = request.getRequestDispatcher("/livro-lista.jsp");
		rd.forward(request, response);
		
	}

}
