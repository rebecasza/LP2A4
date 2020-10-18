

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/livro/novo")
public class NovoLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/livro-novo.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		if (id.isEmpty())
			id = "0";
		
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String isbn = request.getParameter("isbn");
		String preco = request.getParameter("preco");
		
		List<String> mensagens = new ArrayList<String>();
		
		if(titulo.isEmpty())
			mensagens.add("Titulo é obrigatório");
		if (autor.isEmpty())
			mensagens.add("Campo autor é obrigatorio");
		if (isbn.isEmpty())
			mensagens.add("ISBN é obrigatório");
		if (preco == null || preco.isEmpty())
			mensagens.add("Preco é obrigatorio");
		if (mensagens.size() > 0 ) {
			request.setAttribute("mensagens", mensagens);
			request.setAttribute("id", id);
			request.setAttribute("titulo", titulo);
			request.setAttribute("autor", autor);
			request.setAttribute("isbn", isbn);
			request.setAttribute("preco", preco);
		}
		else {
			Livro livro = new Livro();
			livro.setId(Integer.valueOf(id));
			livro.setTitulo(titulo);
			livro.setAutor(autor);
			livro.setIsbn(isbn);
			livro.setPreco(preco);
	
			Banco banco = new Banco();
			banco.salvaLivro(livro);
			System.out.println("Cliente cadastrado com sucesso!");
			request.setAttribute("sucess", "Livro cadastrado com sucesso!");
		}	
		doGet(request, response);
	}

}
