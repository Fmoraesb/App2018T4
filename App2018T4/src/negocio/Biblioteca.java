package negocio;

public class Biblioteca {

	private String nome;
	private Endereco endereco;
	private Contato contato;
	private String[] assuntos;

	// @Override
	public String toString(String quebraLinha) {
		return String.format("Nome: %s" + quebraLinha 
				+ "Endereço: %s" + quebraLinha 
				+ "Contato: %s" + quebraLinha, this.getNome(),
				this.getEndereco().toString(), this.getContato().toString());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String[] getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(String[] assuntos) {
		this.assuntos = assuntos;
	}

}
