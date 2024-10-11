import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome){
        this.nome = nome;
        this.professores = new ArrayList<Professor>();
    }
    public String getNome() {
        return nome;
    }

    public void contratarProfessores(Professor professor){
        professores.add(professor);
        professor.addEscola(this);
    }

    public void listaProfessores(){
        System.out.println("Lista de Professores da Escola " + this.nome);
        for(Professor professor : professores){
            System.out.println(professor.getNome());
        }
    }
}

class Professor {
    private String nome;
    List<Escola> escolas;

    public Professor(String nome){
        this.nome = nome;
        this.escolas = new ArrayList<Escola>();
    }
    public String getNome() {
        return nome;
    }
    public void addEscola(Escola escola){
        escolas.add(escola);
    }

    public void listaEscolas(){
        System.out.println("Lista de Escolas do Professor " + this.nome);
        for(Escola escola : escolas){
            System.out.println(escola.getNome());
        }
    }
}
