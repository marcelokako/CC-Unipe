
public class Aluno {

	private String nome;
	private String matricula;
	private double nota1, nota2, nota3, media;
	
	public Aluno() {
		this.nota1 = 0;
		this.nota2 = 0;
		this.nota3 = 0;
		this.media = 0;
	}
	
	public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = (nota1 + nota2 + nota3)/3;
	}
	
	public String situacao() {
		
		String situacao;
		
		if (this.media >= 7) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
		
		return situacao;
	}

	public void calculaMedia() {
		this.media = (nota1 + nota2 + nota3)/3;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
				+ nota3 + ", media=" + media + "]";
	}
	
	
}
