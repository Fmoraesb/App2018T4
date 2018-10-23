package review1016;

public class TestaCalculoEtapa03 {

	public static void main(String[] args) {
		
		CalculoFinanceiro cf = new CalculoFinanceiro();
		
		cf.setNome("elberth");
		cf.setPrimeiroValor(100);
		cf.setSegundoValor(100);
		cf.setAdicional(25);
		
		cf.exibir("+");
	}
}
