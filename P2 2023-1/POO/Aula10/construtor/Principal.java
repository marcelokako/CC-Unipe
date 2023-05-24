import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Aluno a1 = new Aluno();
		
		System.out.println("Insira o nome");
		a1.setNome(teclado.next());
		System.out.println("Insira a matricula");
		a1.setMatricula(teclado.next());
		System.out.println("Insira a nota 1");
		a1.setNota1(teclado.nextDouble());
		System.out.println("Insira a nota 2");
		a1.setNota2(teclado.nextDouble());
		System.out.println("Insira a nota 3");
		a1.setNota3(teclado.nextDouble());
		
		a1.calculaMedia();
		
		System.out.println(a1 + "\nSituacao: " + a1.situacao());
		Aluno a2 = new Aluno("Marcelo", "12345", 10, 8, 4);
		
		System.out.println("Media: " + a2.getMedia() + "\nSituacao: " + a2.situacao());
		
	}

}
