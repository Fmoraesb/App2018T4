package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import review1016.CalculoFinanceiro;

public class FinanceiroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FinanceiroController() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CalculoFinanceiro cf = new CalculoFinanceiro();

		cf.setNome(request.getParameter("nome"));
		cf.setPrimeiroValor(Float.valueOf(request.getParameter("primeiroValor")));
		cf.setSegundoValor(Float.valueOf(request.getParameter("segundoValor")));
		cf.setAdicional(Float.valueOf(request.getParameter("adicional")));
		
		PrintWriter out = response.getWriter();		
		out.println(cf.toString(request.getParameter("operacao")));
	}
}