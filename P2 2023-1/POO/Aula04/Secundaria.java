import java.util.Scanner;

public class Secundaria {

	public static void ex1() {
		// CALCULADORA DE OPERAÇÕES BÁSICAS
		Double num1, num2;
		
		System.out.println("Digite um numero: ");
		Scanner entrada = new Scanner(System.in);
		num1 = entrada.nextDouble();
		
		System.out.println("Digite outro numero: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Soma: " + (num1+num2));
		System.out.println("Subtraçã: " + (num1-num2));
		System.out.println("Multiplicação: " + (num1*num2));
		System.out.println("Divisão: " + (num1/num2));

	}
	
	public static void ex2() {
		//	MEDIA DO ALUNO - PEGANDO NOTA COMO STRING
		// 	utilizando classes wrapper (nome do tipo com letra maiuscula, com exceção de int (Integer)
		// 	e char (Character), temos acesso aos seus métodos e convertemos usando o parse
		
		String n1, n2, n3;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextLine();

		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextLine();

		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextLine();
				
		double nota1Double, nota2Double, nota3Double;
	
		nota1Double = Double.parseDouble(n1);
		nota2Double = Double.parseDouble(n2);
		nota3Double = Double.parseDouble(n3);
		
		System.out.println("Sua média é: " + ((nota1Double + nota2Double + nota3Double)/3));
	}

	public static void ex3() {
		// Mostrando o maior valor OPERADOR TERNÁRIO
		int a = 120, b=0;
		int maior = (a>b) ? a: b ;
		System.out.println(maior);
	}
	
	public static void ex7() {
		// Mostrando o maior valor OPERADOR TERNÁRIO 2
		int a, b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = entrada.nextInt();
		
		int maior = (a>b) ? a: b ;
		
		System.out.println("O maior número é: " + maior);
	}
	
	public static void ex8() {
		// Mostrando o menor valor entre 3 OPERADOR TERNÁRIO 3
		int a, b, c;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		b = entrada.nextInt();

		System.out.println("Digite o terceiro numero: ");
		c = entrada.nextInt();

		int menor = ( (a<=b)&&(a<=c) ) ? a: ( (b<=c)&&(b<=a) ? b : c ) ;
		
		System.out.println("O menor número é: " + menor);
	}
}
