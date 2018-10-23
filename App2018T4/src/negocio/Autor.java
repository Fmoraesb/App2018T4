package negocio;

public class Autor {

	private String nome;
	private String sobrenome;
	
	public String getNomeCompleto() {
		
		return String.format("%s %s", 
				nome, 
				sobrenome
			);
	}
	
	public String getCitacaoBibliografica() {
		
		return String.format("%s, %s.", 
				sobrenome.toUpperCase(), 
				nome.toUpperCase().charAt(0)
			);
	}
	
	public Autor(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
