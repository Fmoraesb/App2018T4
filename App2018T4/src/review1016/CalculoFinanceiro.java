package review1016;

public class CalculoFinanceiro {

	private String nome;
	private float primeiroValor;
	private float segundoValor;
	private float adicional;

	public String toString(String operacao) {

		return String.format("O valor R$%.2f foi calculado para o funcionário %s",
				this.calcular(operacao),
				this.getNome()
			);
	}
	
	public void exibir() {
		this.exibir("+");
	}
	
	public void exibir(String operacao) {
		System.out.printf(this.toString(operacao));
	}
	
	private float calcularAdicional(float valor) {
		return this.getAdicional() * valor / 100;
	}
	
	private float calcular(String operacao) {
		float valor = 0;
		
		switch (operacao) {
		case "+":
			valor = this.calcularSoma();
			break;
			
		case "-":			
			valor = this.calcularSubtracao();
			break;
			
		case "*":			
			valor = this.calcularMultiplicacao();
			break;
			
		case "/":			
			valor = this.calcularDivisao();
			break;
			
		default:
			valor = 0;
		}
		
		return valor + this.calcularAdicional(valor);
	}	
	private float calcularSoma() {
		return this.getPrimeiroValor() + this.getSegundoValor();
	}
	private float calcularSubtracao() {
		return this.getPrimeiroValor() - this.getSegundoValor();
	}
	private float calcularMultiplicacao() {
		return this.getPrimeiroValor() * this.getSegundoValor();
	}
	private float calcularDivisao() {
		return this.getPrimeiroValor() / this.getSegundoValor();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPrimeiroValor() {
		return primeiroValor;
	}
	public void setPrimeiroValor(float primeiroValor) {
		this.primeiroValor = primeiroValor;
	}
	public float getSegundoValor() {
		return segundoValor;
	}
	public void setSegundoValor(float segundoValor) {
		this.segundoValor = segundoValor;
	}
	public float getAdicional() {
		return adicional;
	}
	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
}