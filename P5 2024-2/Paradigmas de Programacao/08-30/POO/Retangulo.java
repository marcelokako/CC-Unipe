public class Retangulo {
    private double comprimento;
    private double largura;
    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return this.comprimento * this.largura;
    }
    public double calcularPerimetro() {
        return 2*(this.comprimento + this.largura);
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(200, 300);
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }

}
