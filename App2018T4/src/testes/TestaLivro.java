package testes;

import negocio.Autor;
import negocio.Livro;

public class TestaLivro {

	public static void main(String[] args) {

		Livro livro = new Livro("Objects First with Java - A Practical Introduction Using BlueJ");
		
		livro.setAno(2017);
		livro.setEditora("Pearson Education");
		
		livro.adicionarAutor(new Autor("dee", "barnes"));
		livro.adicionarAutor(new Autor("michael", "kölling"));
		livro.adicionarAutor(new Autor("elberth", "moraes"));

		livro.imprimirFichaCatalografica();		
	}
}