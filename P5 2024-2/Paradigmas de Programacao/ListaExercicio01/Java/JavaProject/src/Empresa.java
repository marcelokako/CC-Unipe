import java.util.ArrayList;
import java.util.List;

// Class Funcionario
class Funcionario {
    private String nome;
    private String cargo;
    private int salario;

    public Funcionario(String nome, String cargo, int salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

}

class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    // criar getter
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }

    public String getNome() {
        return this.nome;
    }
}
