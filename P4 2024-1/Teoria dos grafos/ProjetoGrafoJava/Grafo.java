import java.util.List;

public class Grafo {
    List <Aresta> arestas;
    List <Vertice> vertices;
    int ordem=0;
    int tamanho=0;

    public int getOrdem() {
        return ordem;
    }

    boolean eDirecionado;

    public void addVertice(Vertice vertice) {
        this.vertices.add(vertice);
        this.ordem++;
    }
    public void addAresta(Aresta aresta) {
        arestas.add(aresta);
        tamanho++;
    }
}
