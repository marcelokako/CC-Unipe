public class Aresta {
    String nome;
    Vertice origem;
    Vertice destino;

    public Aresta(String nome, Vertice origem, Vertice destino) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        origem.grauOut++;
        destino.grauIn++;

    }


}
