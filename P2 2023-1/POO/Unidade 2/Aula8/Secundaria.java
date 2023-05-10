import java.util.Scanner;

public class secundaria {

	public static void ex1() {
		System.out.println("exercicio1 - atribuir valores");
			
		String cores[] = new String[3];
		cores[0] = "vermelho";
		cores[1] = "verde";
		cores[2] = "azul";
		
		System.out.println(cores[0]);
		System.out.println(cores[1]);
		System.out.println(cores[2]);
	}

	public static void ex2() {
		System.out.println("exercicio2 - declaracao em linha e foreach");
			
		String cores[] = {"vermelho", "verde", "azul"};
		cores[0] = "vermelho";
		cores[1] = "verde";
		cores[2] = "azul";
		
		for (int i=0; i<cores.length;i++) {
			System.out.println(cores[i]);			
		}
		System.out.println("\ntestando for each:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		}

	public static void ex3() {
		System.out.println("exercicio3 - digite 5 numeros inteiros e printe eles e seus quadrados");
		
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[5];
		int quadrados[] = new int[5];
		int j = 0;
		for (int i : numeros) {
			System.out.println("\nDigite um numero: ");
			i = entrada.nextInt();
			numeros[j] = i;
			quadrados[j++] = i * i;
		}
		System.out.println("\nA | B");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " | " + quadrados[i]);
		}
		
	}
	
	public static void ex4() {
		System.out.println("exercicio4 extra - vetor par e impar");
		
		Scanner entrada = new Scanner(System.in);
		String pares[] = {"","","","","","","","","",""};
		String impares[] = {"","","","","","","","","",""};
		int numero;
		
		for (int i = 0; i < pares.length; i++) {
			System.out.println("\nDigite um numero: ");
			numero = entrada.nextInt();
			
			if (numero % 2 == 0) {
				pares[i] = String.valueOf(numero);
			} else {
				impares[i] = String.valueOf(numero);
			}
			
		}
		
		System.out.println("\nPares\t|\tImpares");
		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i] + "\t|\t" + impares[i]);
		}
		
	}
	
	public static void ex5() {
		System.out.println("exercicio5 - Matriz");
		
		int matriz[][] = new int[5][5];
		int cont = 1;
		for (int i = 0; i<5;i++) {
			System.out.print("|");
			for (int j = 0; j<5; j++) {
				matriz[i][j] = cont;
				System.out.print(" " + matriz[i][j] + " ");
			}
			cont++;
			System.out.print("|\n");
		}
	}
	
}
