import java.util.ArrayList;
import java.util.List;

public class Animal {
    protected String especie;
    protected String nome;

    public Animal(String especie, String nome) {
        this.especie = especie;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String emitirSom() {
        return "";
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super("Cachorro", nome);
    }
    @Override
    public String emitirSom() {
        System.out.println(this.nome + " diz: Au Au");
        return "Au Au";
    }
}
class Gato extends Animal {
    public Gato(String nome) {
        super("Gato", nome);
    }
    @Override
    public String emitirSom() {
        System.out.println(this.nome + " diz: Miau");
        return "Miau";
    }
}

class Zoologico {
    protected List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<Animal>();
    }
    public void addAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void getAnimais() {
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}