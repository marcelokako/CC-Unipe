package aula01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Hello Universe");
		String nome = "walter";
		System.out.println("Bom dia, "+nome+"\n");
		
		Secundaria.escrevaEstatico();
		
		Secundaria s1 = new Secundaria();
		s1.escreva();
	
		go();

	}

	public static void go() {
		System.out.println("Entrei no metodo go\n");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("Olá, "+nome);
	}
	
}
