public class Cachorro extends Animal{
    public Cachorro(String especie, String nome) {
        super(especie, nome);
    }

    public void emitir_som(){
        System.out.println("Au Au");
    }
}
