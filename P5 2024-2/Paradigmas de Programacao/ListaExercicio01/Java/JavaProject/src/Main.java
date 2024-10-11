class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------Questão 1 e 6-----------------------");
        Motor motor1 = new Motor("Diesel", 200);
        Motor motor2 = new Motor("Alcool", 100);
        Motor motor3 = new Motor("Elétrico", 150);

        Pneu pneuQualquer = new Pneu("Pirelli", 100);
        Carro carro1 = new Carro("Fiat", "Argo", motor1, 2024, pneuQualquer);
        Carro carro2 = new Carro("Hyundai", "HB20", motor2, 2023, pneuQualquer);
        Carro carro3 = new Carro("Chevrolet", "Onyx", motor3, 2022, pneuQualquer);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

        System.out.println("-----------------------Questão 2-----------------------");
        carro1.ligar();
        carro1.acelerar(50);
        carro1.acelerar(50);
        carro1.desacelerar(75);
        carro1.desacelerar(100);

        System.out.println("-----------------------Questão 4-----------------------");
        Animal cachorro = new Cachorro("Clifford");
        Animal gato = new Gato("Garfield");

        cachorro.emitirSom();
        gato.emitirSom();

        System.out.println("-----------------------Questão 5-----------------------");
        Zoologico zoologico = new Zoologico();
        zoologico.addAnimal(cachorro);
        zoologico.addAnimal(gato);
        zoologico.getAnimais();

        System.out.println("-----------------------Questão 3 e 15-----------------------");
        ContaBancaria minhaConta = new ContaBancaria("Marcelo");
        minhaConta.depositar(2000);
        try {
            System.out.println("Tentando sacar " + 1500 + "... Saldo = " + minhaConta.sacar(1500));
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------Questão 7-----------------------");
        Escola escola1 = new Escola("Evolucao");
        Escola escola2 = new Escola("Motiva");
        Professor professor1 = new Professor("Pedro");
        Professor professor2 = new Professor("Maria");
        Professor professor3 = new Professor("George");

        escola1.contratarProfessores(professor1);
        escola1.contratarProfessores(professor2);
        escola2.contratarProfessores(professor2);
        escola2.contratarProfessores(professor3);

        escola1.listaProfessores();
        escola2.listaProfessores();
        professor2.listaEscolas();

        System.out.println("-----------------------Questão 8-----------------------");
        Empresa empresa = new Empresa("Empresa Incrivel");
        Funcionario funcionario1 = new Funcionario("Marcelo", "CEO", 10000);
        Funcionario funcionario2 = new Funcionario("Maria", "Front", 2500);
        Funcionario funcionario3 = new Funcionario("Carlos", "Back", 3000);
        empresa.contratarFuncionario(funcionario1);
        empresa.contratarFuncionario(funcionario2);
        empresa.contratarFuncionario(funcionario3);

        empresa.listarFuncionarios();

        System.out.println("-----------------------Questão 9-----------------------");
        Relatorio relatorio = new Relatorio("que relatorio irado!!");
        Contrato contrato = new Contrato("Contrato importante", "Marcelo");

        relatorio.imprimir();
        contrato.imprimir();

        System.out.println("-----------------------Questão 10-----------------------");
        System.out.println("Somando 2 valores: " + Calculadora.soma(3,4));
        System.out.println("Somando 3 valores: " + Calculadora.soma(3,4,10));

        System.out.println("-----------------------Questão 11-----------------------");
        AbsFuncionario funcionarioHorista = new FuncionarioHorista("Carlos", 40, 80);
        AbsFuncionario funcionarioAssalariado = new FuncionarioAssalariado("Maria", 5000);

        funcionarioHorista.calcularSalario();
        funcionarioAssalariado.calcularSalario();

        System.out.println("-----------------------Questão 12-----------------------");
        Produto produto1 = new Produto("banana", 5);
        Produto produto2 = new Produto("limao", 3);

        System.out.println("Somando produtos: " + produto1.getSoma(produto2));

        System.out.println("-----------------------Questão 13-----------------------");
        System.out.println("Calculando fatorial: " + Calculadora.calcularFatorial(5));

        System.out.println("-----------------------Questão 14-----------------------");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Testando configuracao: [s1 == s2]: " + (s1 == s2 ? "True" : "False"));
    }
}