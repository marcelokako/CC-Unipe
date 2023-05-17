import java.lang.Math;

public class Retangulo {
	private double altura;
	private double largura;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = Math.abs(altura);
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = Math.abs(largura);
	}
	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
	}
	
	public double calcularArea() {
		return (this.altura * this.largura);
	}
	
	public double calcularPerimetro() {
		return (2 * (this.altura + this.largura));
	}
}
