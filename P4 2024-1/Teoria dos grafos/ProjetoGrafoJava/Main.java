public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        Vertice a = new Vertice("A");
        grafo.addVertice(a);
        
        Vertice b = new Vertice("B");
        grafo.addVertice(b);
        
        Vertice c = new Vertice("C");
        grafo.addVertice(c);
        
        Aresta ab = new Aresta("AB", a,b);
        grafo.addAresta(ab);
        
        Aresta bc = new Aresta("BC", b,c);
        grafo.addAresta(bc);
        
        Aresta ca = new Aresta("CA", c,a);
        grafo.addAresta(ca);
        Aresta ac = new Aresta("AC", a,c);
        grafo.addAresta(ac);
        
        //Aresta aa = new Aresta("AA", a,a);
        //grafo.addAresta(aa);
        // grafo.getVertices();
        // grafo.getArestas();

        grafo.imprimeDadosGrafo();
    }
}
