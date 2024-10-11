import java.util.Arrays;

class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    public void ligar() {
        System.out.println("O motor está ligado.");
    }

    public void desligar() {
        System.out.println("O motor está desligado.");
    }
}

class Pneu {
    private String marca;
    private int tamanho;

    public Pneu(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pneu{" +
                "marca='" + marca + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }

    public void inflar() {
        System.out.println("O pneu está inflado.");
    }

    public void desinflar() {
        System.out.println("O pneu está desinflado.");
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;
    private Pneu[] pneus;
    public int velocidade;

    public Carro(String marca, String modelo, Motor motor, int ano, Pneu pneu) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor("Gasolina", 150);
        this.ano = ano;
        this.pneus = new Pneu[4];
        for (int i = 0; i < 4; i++) {
            pneus[i] = new Pneu("Pirelli", 18);
        }
        this.velocidade = 0;
    }

    public void ligar() {
        motor.ligar();
        System.out.println("O carro está pronto para rodar.");
    }

    public void desligar() {
        motor.desligar();
        System.out.println("O carro foi desligado.");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", motor=" + motor +
                ", pneus=" + Arrays.toString(pneus) +
                '}';
    }

    public int acelerar(int velocidade){
        this.velocidade += velocidade;
        System.out.println("O carro está a " + this.velocidade + " km/h");
        return this.velocidade;
    }
    public int desacelerar(int velocidade){
        this.velocidade -= velocidade;
        if(this.velocidade < 0){
            this.velocidade = 0;
            System.out.println("O carro está parado");
        } else {
            System.out.println("O carro está a " + this.velocidade + " km/h");
        }
        return this.velocidade;
    }
}