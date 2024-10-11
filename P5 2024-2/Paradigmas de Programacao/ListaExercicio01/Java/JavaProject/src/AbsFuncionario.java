public abstract class AbsFuncionario {
    protected String nome;

    public AbsFuncionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}

class FuncionarioAssalariado extends AbsFuncionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Salario: " + salarioMensal);
        return salarioMensal;
    }
}

class FuncionarioHorista extends AbsFuncionario {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Salario: " + (horasTrabalhadas * valorHora));
        return horasTrabalhadas * valorHora;
    }
}

