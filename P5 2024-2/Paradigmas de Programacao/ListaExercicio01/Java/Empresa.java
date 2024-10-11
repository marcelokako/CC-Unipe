// Class Funcionario
class Funcionario {
    private String nome;
    private int salario;
    private List<Empresa> empresas;

    public Funcionario(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }
    // criar getter
    public void listarEmpresas() {
        System.out.println("Empresas do funcionário " + nome + ":");
        for (Empresa empresa : empresas) {
            System.out.println(empresa.getNome());
        }
    }
}

// Classe Empresa
class Empresa {
    private String nome;
    private List<Pessoa> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    // criar getter
    public void contratarFuncionario(Pessoa funcionario) {
        funcionarios.add(funcionario);
        funcionario.empresas.add(this);
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (Pessoa funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }
}

// Cliente
public class Agregacao_exemplo {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa ABC", "12345678901234");
        empresa.contratarFuncionario(pessoa1);
        empresa.contratarFuncionario(pessoa2);

        empresa.listarFuncionarios();
    }
}
