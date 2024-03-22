public class Vertice {
    String nome;
    int grauIn = 0;
    int grauOut = 0;
    public Vertice(String nome) {
        this.nome = nome;
    }
    public int getGrau() {
        return grauIn+grauOut;
    }
    public int getGrauIn() {
        return grauIn;
    }
    public int getGrauOut() {
        return grauOut;
    }
}
