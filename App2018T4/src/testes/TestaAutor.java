package testes;

import negocio.Autor;

public class TestaAutor {

	public static void main(String[] args) {
		
		Autor autor = new Autor("elberth", "moraes");
		
		System.out.println(autor.getNomeCompleto());
		
		System.out.println(autor.getCitacaoBibliografica());
	}
}