package entidades;

public class Livro extends Item {
	protected String tema;
	protected int numPaginas;
	protected int anoPubli;

	
public Livro (int identificacao, String nome, int preco, int imposto, String tema, int numPaginas, int anoPubli) {
	super(identificacao, nome, preco, imposto);
	this.tema = tema;
	this.numPaginas = numPaginas;
	this.anoPubli = anoPubli;
}

@Override 
public void exibirInformacoes () {
	super.exibirInformacoes();
	System.out.println("Tema: " +tema);
	System.out.println("Numero de paginas: "+numPaginas);
	System.out.println("Ano publicacao: " +anoPubli);
}

@Override
public int calcularPreco() {
	return (preco*imposto);
}
}
