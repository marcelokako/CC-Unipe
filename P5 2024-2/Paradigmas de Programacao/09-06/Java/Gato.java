public class Gato extends Animal{
    public Gato(String especie, String nome) {
        super(especie, nome);
    }

    public void emitir_som(){
        System.out.println("Miau");
    }
}
