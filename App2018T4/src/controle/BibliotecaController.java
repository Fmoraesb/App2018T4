package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Biblioteca;
import negocio.Contato;
import negocio.Endereco;

public class BibliotecaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BibliotecaController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("bibliotecaCadastro.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contato c = new Contato();
		c.setEmail(request.getParameter("email"));
		c.setTelefone(request.getParameter("telefone"));
		
		Endereco e = new Endereco();
		e.setBairro(request.getParameter("bairro"));
		e.setCidade(request.getParameter("cidade"));
		e.setUf(request.getParameter("uf"));
		
		Biblioteca b = new Biblioteca();
		b.setAssuntos(request.getParameterValues("assuntos"));
		b.setContato(c);
		b.setEndereco(e);
		b.setNome(request.getParameter("nome"));		

		PrintWriter out = response.getWriter();
		//out.println(b.toString());
		
		out.println(
				"<!DOCTYPE html>" + 
				"<html>" + 
				"<head>" + 
				"<meta charset='ISO-8859-1'>" + 
				"<title>Insert title here</title>" + 
				"</head>" + 
				"<body>" + 
				"	<form action='BibliotecaController' method=get>" + 
				"		<input type='submit' value='Voltar'>" +  
				"		<h3>Biblioteca cadastrada com sucesso!</h3>" + 
				"		<h4>"+ b.toString("<br>") +"</h4>" + 
				"	</form>" + 
				"</body>" + 
				"</html>"
				);
		
//		request.getRequestDispatcher("finalizaBiblioteca.html").forward(request, response);
	}
}