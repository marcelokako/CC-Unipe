import java.util.ArrayList;
import java.util.List;

public class Grafo {
    List <Aresta> arestas = new ArrayList<>();
    List <Vertice> vertices = new ArrayList<>();
    boolean eDirecionado = false;
    int ordem=0;
    int tamanho=0;

    public int getOrdem() {
        return ordem;
    }

    public void addVertice(Vertice vertice) {
        if(!vertices.contains(vertice)){
            vertices.add(vertice);
            ordem++;
        }
    }

    public void addAresta(Aresta aresta) {
        if(!checkVerticesAresta(aresta.origem, aresta.destino)){
            return; // vertice não contido no grafo atual
        }
        if(aresta.origem.nome.equals(aresta.destino.nome)){ // Testa se é um loop
            eDirecionado = true;
        }
        for (Aresta value : this.arestas) { // Vê se existe uma aresta de sentido contrário
            if(value.origem.nome.equals(aresta.destino.nome) && value.destino.nome.equals(aresta.origem.nome)){
                eDirecionado = true;
            }
        }
        if(!arestas.contains(aresta)){ 
            arestas.add(aresta);
            tamanho++;
        }
    }

    private boolean checkVerticesAresta(Vertice v1, Vertice v2){
        return vertices.contains(v1) && vertices.contains(v2);
    }

    public void getArestas(){
        System.out.println("Mostrando todas as arestas:\n");
        String conexao = this.eDirecionado ? "->" : "--"; 
        for (Aresta value : arestas) {
            System.out.println(value.nome + ": " + value.origem.nome + conexao + value.destino.nome);
        }
    }
    public void getVertices(){
        System.out.println("Mostrando todas os vertices:\n");
        String stringGrau = "";
        boolean flagDirecionado = this.eDirecionado;
        for (Vertice value : vertices) {
            stringGrau = flagDirecionado 
                ? ("grauIn: " + value.getGrauIn() + " | grauOut: " + value.getGrauOut())
                : ("grau: " + value.getGrau()) ;
            System.out.println(value.nome + ": " + stringGrau);
        }    
    }
    public void imprimeDadosGrafo() {
        System.out.println("Informações do Grafo:");
        System.out.println("Número de Vértices: " + ordem);
        System.out.println("Número de Arestas: " + tamanho);
        System.out.println("Grafo Direcionado: " + (eDirecionado ? "Sim" : "Não"));
        
        this.getVertices();      
        this.getArestas();

    }
}
