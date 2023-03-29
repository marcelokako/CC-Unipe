import java.util.Locale;
import java.util.Scanner;

public class Secundaria {

	
	public static void ex1() {
		Locale.setDefault(Locale.US);
		// FORMATAÇÃO DE STRING
		
		double n1=10;
		double n2=3;
		double resultado = n1/n2;
		System.out.println("Sem formatação: " + resultado);
		
		System.out.printf("Com printf: %.1f / %.1f = %.2f", n1, n2, resultado);
		
		System.out.println("\nString format: " + String.format("%.2f", resultado));
		
		
	}
	
	public static void ex2() {
		/* PEGA IDADE DE USUARIO E MOSTRE SE ELE PODE DIRIGIR */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade>=18)
			System.out.println("Voce pode dirigir");
		else
			System.out.println("Voce não pode dirigir");

	}

	public static void ex3() {
		// Dizer se o numero digitado é positivo, negativo ou zero
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero = entrada.nextInt();
	
	if (numero>0)
		System.out.println("Positivo");
	else if (numero<0)
		System.out.println("Negativo");
	else
		System.out.println("Nulo");

	}
	
	public static void ex4() {
		// DIZER SE O ALUNO FOI APROVADO FINAL OU REPROVADO PELA MEDIA
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite a média: ");
	double media = entrada.nextDouble();
		
	if (media<5)
		System.out.println("Reprovado");
	else if (media<7)
		System.out.println("Final");
	else
		System.out.println("Aprovado");
	}
	
	public static void ex5() {
		// MÉTODO EQUALS
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite o nome do cavaleiro: ");
	String cavaleiro = entrada.nextLine();
			
	if		  (cavaleiro.equalsIgnoreCase("Seiya")) {
		System.out.println(cavaleiro + " é o cavaleiro de Pégasus");
	} else if (cavaleiro.equalsIgnoreCase("Hyoga")) {
		System.out.println(cavaleiro + " é o cavaleiro de Cisne");
	} else if (cavaleiro.equalsIgnoreCase("Shiryu")) {
		System.out.println(cavaleiro + " é o cavaleiro de Dragão");
	} else if (cavaleiro.equalsIgnoreCase("Shun")) {
		System.out.println(cavaleiro + " é o cavaleiro de Andromeda");
	} else if (cavaleiro.equalsIgnoreCase("Ikki")) {
		System.out.println(cavaleiro + " é o cavaleiro de Fênix");
	} else {
		System.out.println("Nome de cavaleiro inválido ");
	}
	
	}  
	
	public static void ex6() {
		// MÉTODO COMPARE TO (COMPARA STRING E RETORNA BOOLEANO)
		// S1.compareTo(S2) faz a subtração do S1 - S2 da tabela ascii
		Scanner entrada = new Scanner(System.in);
		System.out.println("[1] Digite um nome: ");
		String nome1 = entrada.nextLine();
		System.out.println("[2] Digite um nome: ");
		String nome2 = entrada.nextLine();
		System.out.println("[3] Digite um nome: ");
		String nome3 = entrada.nextLine();
		
		if (nome1.compareTo(nome2)>=0 && nome1.compareTo(nome3)>=0) {
			System.out.println(nome1 + " é o nome mais proximo da letra z.");
		} else if (nome2.compareTo(nome1)>=0 && nome2.compareTo(nome3)>=0) {
			System.out.println(nome2 + " é o nome mais proximo da letra z.");
		} else if (nome3.compareTo(nome1)>=0 && nome3.compareTo(nome2)>=0) {
			System.out.println(nome3 + " é o nome mais proximo da letra z.");
		} else System.out.println(" Algo de errado não está certo.");

		
	}
	
}
