public class Ave extends Animal{
    public Ave(String especie, String nome) {
        super(especie, nome);
    }

    public void voar(){
        System.out.println(this.nome + " está voando");
    }
}
