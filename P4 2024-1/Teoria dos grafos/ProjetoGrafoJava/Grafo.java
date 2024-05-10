import java.util.ArrayList;
import java.util.List;

public class Grafo {
    List <Aresta> arestas = new ArrayList<>();
    List <Vertice> vertices = new ArrayList<>();
    boolean eDirecionado = false;
    boolean ePonderado = false;
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
        } else {
            for (Aresta value : this.arestas) { // Vê se existe uma aresta de sentido contrário
                if(value.origem.nome.equals(aresta.destino.nome) && value.destino.nome.equals(aresta.origem.nome)){
                    eDirecionado = true;
                    break;
                }
            }
        }
        if(!arestas.contains(aresta)){
            // Preenche listas adjacencias e adjacentes a mim dos vertices
            addAdjacencias(aresta.destino, aresta.origem);
            addAdjacenciasAMim(aresta.origem,aresta.destino);
            if(!eDirecionado){
                addAdjacencias(aresta.origem, aresta.destino);
                addAdjacenciasAMim(aresta.destino,aresta.origem);
            }

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
    public void addAdjacencias(Vertice vertice, Vertice verticeAdj) {
        if(!vertice.adjacencias.contains(verticeAdj)){
            vertice.adjacencias.add(verticeAdj);
        }
    }
    public void addAdjacenciasAMim(Vertice vertice, Vertice verticeAdjAMim) {
        if(!vertice.adjecentesAMim.contains(verticeAdjAMim)){
            vertice.adjecentesAMim.add(verticeAdjAMim);
        }
    }
    public int comprimentoCaminho(List<Aresta> arestasPercorridos){
        if(!ePonderado) return  arestasPercorridos.size();
        int comprimento = 0;
        for (Aresta aresta : arestasPercorridos){
            comprimento+= aresta.getPeso();
        }

        return comprimento;
    }
    public int comprimentoCaminho(List<Vertice> verticesPercorridos){
        return verticesPercorridos.size() - 1;
    }
    
    public List<Vertice> passeioGrafo(Vertice inicio, Vertice objetivo){
        List<Vertice> verticesPercorridos = new ArrayList<Vertice>();
        
        return verticesPercorridos;
    }
    
    
}
