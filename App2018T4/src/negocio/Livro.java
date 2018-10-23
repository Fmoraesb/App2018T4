package negocio;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private String titulo;
	private String editora;
	private int ano;
	private List<Autor> autores;
	
	public void adicionarAutor(Autor autor) {
		autores.add(autor);
	}
	
	public void imprimirFichaCatalografica() {
		
		for(Autor autor : autores) {
			System.out.printf(
					"%s ", 
					autor.getCitacaoBibliografica()
				);
		}
		
		System.out.printf(
				  "(%d) "
				+ "%s. "
				+ "%s, "
				+ "%d.",
				ano,
				titulo,
				editora,
				ano
			);
	}
	
	public void listarAutores() {
		
		for(Autor autor : autores) {
			System.out.println(autor.getNomeCompleto());
		}
	}
	
	public void buscarAutor(String nomeCompleto) {
		
	}
	
	public void removerAutor(String nomeCompleto) {
		
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
		autores = new ArrayList<Autor>();
	}
	
	public Livro(String titulo, String editora, int ano) {
		this(titulo);
		this.editora = editora;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
}