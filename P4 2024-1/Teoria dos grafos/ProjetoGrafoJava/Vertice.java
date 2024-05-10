import java.util.List;

public class Vertice {
    String nome;
    int grauIn = 0;
    int grauOut = 0;
    List<Vertice> adjacencias;
    List<Vertice> adjecentesAMim;

    public List<Vertice> getAdjacencias() {
        return adjacencias;
    }

    public List<Vertice> getAdjecentesAMim() {
        return adjecentesAMim;
    }

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
