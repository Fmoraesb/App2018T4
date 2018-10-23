package negocio;

public class Contato {

	private String telefone;
	private String email;
	
	@Override
	public String toString() {
		return String.format(
				  "Telefone: %s\n"
				+ "E-mail: %s\n",
				this.getTelefone(),
				this.getEmail()
			);
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
