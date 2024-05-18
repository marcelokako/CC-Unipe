public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        grafo.setDirecionado();
        // Criando grafo igual ao do slide mas com letras ao inves de numero
        Vertice a = new Vertice("1");
        grafo.addVertice(a);
        Vertice b = new Vertice("2");
        grafo.addVertice(b);
        Vertice c = new Vertice("3");
        grafo.addVertice(c);
        Vertice d = new Vertice("4");
        grafo.addVertice(d);
        Vertice e = new Vertice("5");
        grafo.addVertice(e);
        Vertice f = new Vertice("6");
        grafo.addVertice(f);
        Vertice g = new Vertice("7");
        grafo.addVertice(g);
        
        Aresta a1 = new Aresta("AB", a,b);
        grafo.addAresta(a1);
        
        Aresta a2 = new Aresta("AE", a,e);
        grafo.addAresta(a2);
        
        Aresta a3 = new Aresta("AC", a,c);
        grafo.addAresta(a3);
        
        Aresta a4 = new Aresta("BF", b,f);
        grafo.addAresta(a4);
        
        Aresta a5 = new Aresta("BD", b,d);
        grafo.addAresta(a5);
        
        Aresta a6 = new Aresta("ED", e,d);
        grafo.addAresta(a6);
        
        Aresta a7 = new Aresta("CD", c,d);
        grafo.addAresta(a7);
        
        Aresta a8 = new Aresta("CG", c,g);
        grafo.addAresta(a8);
           
        grafo.imprimeDadosGrafo();
        
        // grafo.passeioProfundidadeDireita(g);
        grafo.buscaLargura(a, g);
    }
}
