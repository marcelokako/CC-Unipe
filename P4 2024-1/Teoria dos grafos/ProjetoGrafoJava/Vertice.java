import java.util.ArrayList;
import java.util.List;

public class Vertice {
    String nome;
    int grauIn = 0;
    int grauOut = 0;
    List<Vertice> adjacencias = new ArrayList<>();
    List<Vertice> adjecentesAMim = new ArrayList<>();

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
