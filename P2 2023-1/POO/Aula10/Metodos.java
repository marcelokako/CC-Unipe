import java.util.Scanner;

public class Metodos {
	
	public static void calculaMedia() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Método estático na mesma classe s/ arg s/ retorno");
		System.out.println("Digite uma nota");
		double nota1 = teclado.nextDouble();
		System.out.println("Digite outra nota");
		double nota2 = teclado.nextDouble();
		System.out.println("A média é: " + (nota1+nota2)/2 );
	}
	
	public static void calculaMediaArg(double n1, double n2) {
		System.out.println("Método estático na mesma classe c/ arg s/ retorno");
		System.out.println("A média é: " + (n1+n2)/2 );
	}
	
	public static double calculaMediaArgRet(double n1, double n2) {
		System.out.println("Método estático na mesma classe c/ arg c/ retorno");
		return (n1+n2)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2;
		
		System.out.println("Escolha uma opção: "
				+ "\n[1] Método Main "
				+ "\n[2] Método estático na mesma classe s/ arg s/ retorno"
				+ "\n[3] Método estático na mesma classe c/ arg s/ retorno"
				+ "\n[4] Método estático na mesma classe c/ arg c/ retorno");
		int opcao=teclado.nextInt();
		
		switch (opcao){
			case 1://-----------------------------------------------MAIN
				System.out.println("Método Main");
				System.out.println("Digite uma nota");
				nota1 = teclado.nextDouble();
				System.out.println("Digite outra nota");
				nota2 = teclado.nextDouble();
				System.out.println("A média é: " + (nota1+nota2)/2 );
				break;
				
			case 2://-----------------------------------------------Método estático na mesma classe s/ arg s/ retorno
				calculaMedia();
				break;
				
			case 3://-----------------------------------------------Método estático na mesma classe c/ arg s/ retorno
				System.out.println("Digite uma nota");
				nota1 = teclado.nextDouble();
				System.out.println("Digite outra nota");
				nota2 = teclado.nextDouble();
				
				calculaMediaArg(nota1, nota2);
				
				break;
				
			case 4://-----------------------------------------------Método estático na mesma classe c/ arg c/ retorno
				System.out.println("Digite uma nota");
				nota1 = teclado.nextDouble();
				System.out.println("Digite outra nota");
				nota2 = teclado.nextDouble();
				
				System.out.println("Média: " + calculaMediaArgRet(nota1, nota2) );
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
		}
			
	}

}
