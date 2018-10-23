package negocio;

public class Endereco {

	private String bairro;
	private String cidade;
	private String uf;
	
	@Override
	public String toString() {
		return String.format(
				  "Bairro: %s\n"
				+ "Cidade: %s\n"
				+ "UF: %s\n",
				this.getBairro(),
				this.getCidade(),
				this.getUf()
			);
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
}
