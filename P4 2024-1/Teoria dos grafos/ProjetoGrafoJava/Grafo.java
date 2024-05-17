import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Grafo {
    List <Aresta> arestas = new ArrayList<>();
    List <Vertice> vertices = new ArrayList<>();
    boolean eDirecionado = false;
    boolean ePonderado = false;
    int ordem=0;
    int tamanho=0;

    public void setDirecionado(){
        this.eDirecionado = true;
    }

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
            System.out.println("\n" + value.nome + ": " + stringGrau);

            System.out.println("\nAdjacentes a mim");
            for (Vertice adj : value.adjecentesAMim) {
                System.out.println(adj.nome + " , ");
            }
        }
    }
    public void imprimeDadosGrafo() {
        System.out.println("Informações do Grafo:");
        System.out.println("Número de Vértices: " + ordem);
        System.out.println("Número de Arestas: " + tamanho);
        System.out.println("Grafo Direcionado: " + (eDirecionado ? "Sim" : "Não"));

        this.getVertices();
        this.getArestas();
        System.out.println("--------------------------------------------");
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
    public int comprimentoCaminhoArestas(List<Aresta> arestasPercorridos){
        if(!ePonderado) return  arestasPercorridos.size();
        int comprimento = 0;
        for (Aresta aresta : arestasPercorridos){
            comprimento+= aresta.getPeso();
        }

        return comprimento;
    }
    public int comprimentoCaminhoVertices(List<Vertice> verticesPercorridos){
        return verticesPercorridos.size() - 1;
    }
    
    public List<Vertice> passeioGrafo(Vertice inicio, Vertice objetivo){
        List<Vertice> verticesPercorridos = new ArrayList<Vertice>();
        
        return verticesPercorridos;
    }
    
    public List<Vertice> buscaProfundidade(Vertice verticeAlvo){
        // estou num vertice -> ve se tenho adjacentes a mim, vou nele, repito até que não tenha
        List<Vertice> verticesPercorridos = new ArrayList<>();
        if(this.vertices.isEmpty()){
            return verticesPercorridos;
        }
        Stack<Vertice> pilha = new Stack<>();
        for (Vertice verticeInicio : vertices) {
            if(verticesPercorridos.contains(verticeInicio)){
                continue;
            }

            pilha.push(verticeInicio);
            System.out.println("\nVertice ADD: " + verticeInicio.nome);

            while (!pilha.isEmpty()) { 

                Vertice proximoVertice = pilha.peek();
                if (proximoVertice == verticeAlvo) {
                    System.out.println("Vertice encontrado!");
                    return verticesPercorridos;
                }
                boolean adjPercorridos = true;
                for (Vertice adj : proximoVertice.adjecentesAMim) {
                    if(!verticesPercorridos.contains(adj)){
                        adjPercorridos = false;
                        pilha.push(adj);
                        System.out.println("Vertice ADD: " + adj.nome);
                        break;
                    }
                }

                if(adjPercorridos){
                    Vertice verticeVisto = pilha.pop();
                    if(!verticesPercorridos.contains(verticeVisto)){
                        System.out.println("Vertice Visto: " + verticeVisto.nome);
                        verticesPercorridos.add(verticeVisto);
                    }
                }
            }
        }
        System.out.println("Vertice não foi encontrado!");
        return verticesPercorridos;
    }
}
