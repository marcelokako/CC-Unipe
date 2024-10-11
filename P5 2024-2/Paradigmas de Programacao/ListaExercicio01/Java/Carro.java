// Classe Motor
class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void ligar() {
        System.out.println("O motor estÃ¡ ligado.");
    }

    public void desligar() {
        System.out.println("O motor estÃ¡ desligado.");
    }
}

// Classe Pneu
class Pneu {
    private String marca;
    private int tamanho;

    public Pneu(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void inflar() {
        System.out.println("O pneu estÃ¡ inflado.");
    }

    public void desinflar() {
        System.out.println("O pneu estÃ¡ desinflado.");
    }
}

// Classe Carro
class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;
    private Pneu[] pneus;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor("Gasolina", 150);
        this.pneus = new Pneu[4];
        for (int i = 0; i < 4; i++) {
            pneus[i] = new Pneu("Pirelli", 18);
        }
    }

    public void ligar() {
        motor.ligar();
        System.out.println("O carro está pronto para rodar.");
    }

    public void desligar() {
        motor.desligar();
        System.out.println("O carro foi desligado.");
    }

    public void trocarPneu(int indice, Pneu novoPneu) {
        if (indice >= 0 && indice < 4) {
            pneus[indice] = novoPneu;
            System.out.println("Pneu " + (indice + 1) + " trocado.");
        } else {
            System.out.println("Índice de pneu inválido.");
        }
    }
}

// Cliente
public class Composicao_exemplo{
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        carro.ligar();

        // Trocando o pneu da posiÃ§Ã£o 2
        Pneu novoPneu = new Pneu("Michelin", 17);
        carro.trocarPneu(2, novoPneu);

        carro.desligar();
    }
}
