public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        Vertice a = new Vertice("A");
        Vertice b = new Vertice("B");
        Vertice c = new Vertice("C");
        Aresta ab = new Aresta("ab", a,b);

        grafo.addVertice(a);

        System.out.println(grafo.getOrdem());

    }
}
