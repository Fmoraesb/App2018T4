package testes;

import negocio.Biblioteca;
import negocio.Contato;
import negocio.Endereco;

public class TestaBiblioteca {

	public static void main(String[] args) {
		
		String[] assuntos = new String[7];
		assuntos[0] = "Ciência da computação, informação e obras gerais";
		assuntos[1] = "Bibliografia";
		assuntos[2] = "Biblioteconomia e ciência da informação";
		assuntos[3] = "Enciclopédias gerais";
		assuntos[4] = "Periódicos";
		assuntos[5] = "Sociedades, organizações e museologia";
		assuntos[6] = "Jornalismo, editoração e imprensa documentária e educativa";
		
		Contato c = new Contato();
		c.setEmail("biblioteca@nacional.com");
		c.setTelefone("123456789");
		
		Endereco e = new Endereco();
		e.setBairro("centro");
		e.setCidade("rio de janeiro");
		e.setUf("rj");
		
		Biblioteca b = new Biblioteca();
		b.setAssuntos(assuntos);
		b.setContato(c);
		b.setEndereco(e);
		b.setNome("Biblioteca Nacional");
		System.out.println(b.toString("\n"));
	}
}