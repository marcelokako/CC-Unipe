import java.util.Scanner;

public class desafiosSala {

	public static int fatorial(int num) {
		int i=num;
		while (i>1) {
			num *= --i;			
		}
		
		return num;
	}
	
	public static void digiteAteZero() {
		Scanner entrada = new Scanner(System.in);
		int numero = 1;
		while (numero != 0 && true || !false) {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			System.out.println("Número digitado: "+ numero);
		}
	}
	
	public static void digiteSenha() {
		Scanner entrada = new Scanner(System.in);
		String senha = "naodigo";
		String palpite;
		do {
			System.out.println("Digite a senha: ");
			palpite = entrada.next();
			if (!palpite.equals(senha)) {
				System.out.println("Voce nao sabe a senha =P");
			}
		} while (!palpite.equals(senha));
		System.out.println("Acesso Liberado");
	}

	public static void contaVotos() {
		int sim = 0, nao = 0;
		Scanner entrada = new Scanner(System.in);
		int resp;
		do {
			System.out.println("Você quer ter aula na quarta-feira de cinzas?\n1 - Sim\n2 - Não\n0 - ENCERRAR");
			resp = entrada.nextInt();
			while (resp < 0 || resp > 2) {
				System.out.println("Número inválido\nVocê quer ter aula na quarta-feira de cinzas?\n1 - Sim\n2 - Não\n0 - ENCERRAR");
				resp = entrada.nextInt();
			}
			switch (resp) {
				case 1:
					sim++;
					break;
				case 2:
					nao++;
					break;
				case 0:
					System.out.println("\n\nVotação encerrada.\n");
			}
		} while (resp!=0);
		
		System.out.println("Contação de votos:\nSim: " + sim + "\tNão: " + nao);
		
	}
	
	public static void operacoes() {
		double num1, num2, resultado = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite outro numero: ");
		num2 = entrada.nextDouble();
		int resp;
		do {
			System.out.println("Selecione uma operação:");
			System.out.println("[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[0] ENCERRAR");
			resp = entrada.nextInt();
			while (resp < 0 || resp > 4) {
				System.out.println("Número inválido\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[0] ENCERRAR");
				resp = entrada.nextInt();
			}
			switch (resp) {
				case 1:
					resultado = num1+num2;
					break;
				case 2:
					resultado = num1-num2;
					break;
				case 3:
					resultado = num1*num2;
					break;
				case 4:
					if (num2 != 0) {
						resultado = num1/num2;
					} else {
						System.out.println("Operação inválida.");
					}
					break;
			}
				System.out.println("Resultado: " + resultado);
		
		} while (resp!=0);
				
	}
}
