public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("gato", "garfield");
        gato.emitir_som();

        Cachorro cachorro = new Cachorro("cachorro", "Clifford");
        cachorro.emitir_som();

        Morcego morcego = new Morcego("morcego", "batman");
        morcego.amamentar(morcego.nome);
        morcego.voar();
    }
}
