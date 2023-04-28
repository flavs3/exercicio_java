package entidades;

public abstract class Item {
	protected int identificacao;
	protected String nome;
	protected int preco;
	protected int imposto;


public Item(int identificacao, String nome, int preco, int imposto) {
	this.identificacao = identificacao;
	this.nome = nome;
	this.preco = preco;
	this.imposto = imposto;
}

public void exibirInformacoes() {
	System.out.println("Identificação:" +this.identificacao);
	System.out.println("Nome:" +this.nome);
	System.out.println("Preço:" +this.preco);
	System.out.println("Imposto:" +this.imposto);
}

public abstract int calcularPreco(); {
}

	
}
