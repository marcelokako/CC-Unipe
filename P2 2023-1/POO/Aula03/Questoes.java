package AulaPOO;

import java.util.Scanner;

public class Questoes {

	public static void ex1() {
		System.out.println("Exercicio 1");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Soma: " + (num1+num2) + "\nSubtracao: " + (num1-num2));
	}
	
	public static void ex2(){
		System.out.println("Exercicio 2");

		double n1 = Math.round(Math.random()*100);
		double n2 = Math.round(Math.random()*100);
		double n3 = Math.round(Math.random()*100);
	
		System.out.println("Primeiro numero: " + n1 + 
							"\nSegundo numero: " + n2 +
							"\nTerceiro numero: " + n3);
	}

	public static void ex3(){
	// AINDA INCOMPLETO	
		System.out.println("Exercicio 3");
		
		double numeros[] = {0,0,0,0,0,0};
		
		int j = 0;
		double x;
		boolean repetido;
		
		while (j < 6) {
			
			repetido = true;
			while (repetido == true) {
			
			x = Math.round(Math.random()*60);

			for (int i=0;i<6;i++) {
				if (x == numeros[i]) {
					break;
				}
			}
			
			}
			numeros[j] = x;
			j++;
		}
		
		for (int i=0;i<6;i++) {
				System.out.println("Numero " + (i+1) + ": " + numeros[i]);
			}
		}
	}
