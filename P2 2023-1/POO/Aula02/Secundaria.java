package Aula02;

import java.time.LocalDate;
import java.util.Scanner;

public class Secundaria {
	
	public static void ex1() {
		System.out.println("Digite o seu nome: ");
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		System.out.println("Digite seu ano de nascimento: ");
		int nascimento = entrada.nextInt();
		
		LocalDate dataAtual = LocalDate.now();
		int anoAtual = dataAtual.getYear();
		
		int idade = anoAtual - nascimento;
		System.out.println("Bom dia, " + nome + " e voce fará " + idade + " anos este ano.");	
	
	}

	public static void ex2() {
		System.out.println("--------------Iniciando exercicio 2--------------\n");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n1 = teclado.nextInt();
		teclado.nextLine();
		System.out.println("digite agora um nome: ");
		String nome = teclado.next();
		System.out.println("O numero digitado foi "+ n1 + " e o nome foi " + nome);
	}
	
	public static void ex3() {
		String nome, apelido;
		nome = "João";
		apelido = nome;
		nome = null;
		
		System.out.println(apelido);
	}
	
	public static void ex4() {
		final double SALARIOMINIMO = 1212;
		System.out.println("Digite seu salário: ");
		Scanner teclado = new Scanner(System.in);
		double salario = teclado.nextDouble();
		System.out.println("A diferença entre seu salario e o minimo é: " + (salario - SALARIOMINIMO));
	}
}
