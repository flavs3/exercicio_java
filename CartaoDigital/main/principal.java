package main;

import java.util.Scanner;

import entidades.Livro;

public class principal {
	public static void main(String[] args) {
		int identificacao, preco, imposto, numPaginas, anoPubli;
		String nome, tema;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a identificação: ");
		identificacao = ler.nextInt();
		System.out.println("Insira o nome: ");
		nome = ler.next();
		System.out.println("Insira o preço: ");
		preco = ler.nextInt();
		System.out.println("Insira o imposto: ");
		imposto = ler.nextInt();
		System.out.println("Insira o número de páginas: ");
		numPaginas = ler.nextInt();
		System.out.println("Insira o insira o ano de publicação: ");
		anoPubli = ler.nextInt();
		System.out.println("Insira o tema: ");
		tema = ler.next();
		
		
	
		Livro livro = new Livro(identificacao,nome,preco,imposto,tema,numPaginas,anoPubli);		

		livro.exibirInformacoes();
	
		System.out.println("Valor final: " +livro.calcularPreco());
	
	
	}
}

