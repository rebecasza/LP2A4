package br.com.ifsp;
	

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditaLivro
 */
@WebServlet("/livro/editar")
public class EditaLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		Banco banco = new Banco();
		
		Livro livro = banco.getLivrobyId(Integer.valueOf(id));
		request.setAttribute("id", livro.getId());
		request.setAttribute("titulo", livro.getTitulo());
		request.setAttribute("autor", livro.getAutor());
		request.setAttribute("preco", livro.getPreco());
		request.setAttribute("isbn", livro.getIsbn());

		RequestDispatcher rd = request.getRequestDispatcher("/livro-novo.jsp");
		rd.forward(request, response);
	}		
}
