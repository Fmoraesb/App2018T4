package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Autor;
import negocio.Livro;

public class LivroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LivroController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("livroCadastro.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Livro livro = new Livro(request.getParameter("titulo"));
		
		livro.setAno(Integer.valueOf(request.getParameter("ano")));
		livro.setEditora(request.getParameter("editora"));
		
		livro.adicionarAutor(new Autor(request.getParameter("nome1"), request.getParameter("sobrenome1")));
		livro.adicionarAutor(new Autor(request.getParameter("nome2"), request.getParameter("sobrenome2")));
		livro.adicionarAutor(new Autor(request.getParameter("nome3"), request.getParameter("sobrenome3")));

		livro.imprimirFichaCatalografica();
		
		request.getRequestDispatcher("finaliza.html").forward(request, response);
	}
}