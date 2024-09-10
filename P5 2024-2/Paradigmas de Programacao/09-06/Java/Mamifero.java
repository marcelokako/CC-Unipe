public interface Mamifero {
    default void amamentar(String nome){
        System.out.println(nome + " está amamentando");
    }
}
