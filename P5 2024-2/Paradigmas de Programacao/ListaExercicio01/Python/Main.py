# Lista Exercícios 01
from Configuracao import *
from Calculadora import *
from Imprimir import *
from Empresa import *
from Escola import *
from ContaBancaria import *
from Animal import *
from Carro import *

def main():

    print("------------------------------ QUESTÃO 1 E 6 ------------------------------")
    meuMotor = Motor("Diesel", 200)
    meuMotor2 = Motor("Alcool", 100)
    meuMotor3 = Motor("Elétrico", 150)
    meuCarro = Carro(
        meuMotor,
        [Pneu("Pirelli", 100) for _ in range(4)],
        2022,
        "Fiat",
        "Argo"
    )
    meuCarro2 = Carro(
        meuMotor2,
        [Pneu("Michellin", 150) for _ in range(4)],
        2020,
        "Fiat",
        "Uno Mille"
    )
    meuCarro3 = Carro(
        meuMotor3,
        [Pneu("Michellin", 100) for _ in range(4)],
        2024,
        "Tesla",
        "Truck"
    )
    
    meuCarro.exibirDetalhes()
    meuCarro2.exibirDetalhes()
    meuCarro3.exibirDetalhes()
    meuCarro.ligar()
    
    print("-------------------------------- QUESTÃO 2 --------------------------------")
    meuCarro.acelerar(50)
    meuCarro.acelerar(50)
    meuCarro.frear(75)
    meuCarro.frear(100)

    print("-------------------------------- QUESTÃO 4 --------------------------------")
    cachorro = Cachorro("Gigante", "Clifford")
    print(cachorro.emitir_som())
    
    gato = Gato("Laranja", "Garfield")
    print(gato.emitir_som())

    print("-------------------------------- QUESTÃO 5 --------------------------------")
    zoo = Zoologico()
    zoo.addAnimais(cachorro)
    zoo.addAnimais(gato)
    zoo.sonsAnimais()
    
    print("------------------------------ QUESTÃO 3 e 15 ------------------------------")
    minhaConta = ContaBancaria("Marcelo", 2000)
    minhaConta.obter_saldo()
    minhaConta.depositar(1000)
    try:
        minhaConta.sacar(2500)
    except SaldoInsuficiente as e:
        print(e)
    try:
        minhaConta.sacar(2500)
    except SaldoInsuficiente as e:
        print(e)

    print("-------------------------------- QUESTÃO 7 --------------------------------")
    escola1 = Escola("Evolucao")
    escola2 = Escola("Geo")
    
    professor1 = Professor("Carla")
    professor2 = Professor("Gilberto")
    professor3 = Professor("Luigi")

    escola1.contrataProfessor(professor1)
    escola1.contrataProfessor(professor2)
    escola2.contrataProfessor(professor2)
    escola2.contrataProfessor(professor3)

    escola1.listaProfessores()
    escola2.listaProfessores()
    professor2.listaEscolas()

    print("-------------------------------- QUESTÃO 8 --------------------------------")
    empresa = Empresa("Google")
    empregado1 = Empregado("Carlos", "Chefe", 1500)
    empregado2 = Empregado("Josefa", "Auxiliar", 1000)
    empregado3 = Empregado("Robert", "Gerente", 3000)

    empresa.contrataEmpregado(empregado1)
    empresa.contrataEmpregado(empregado2)
    empresa.contrataEmpregado(empregado3)
    
    empresa.listaEmpregados()

    print("-------------------------------- QUESTÃO 9 --------------------------------")
    relatorio = Relatorio("Este é o corpo do relatório")
    contrato = Contrato("Este é o corpo do contrato", "Marcelo")

    relatorio.imprimir()
    contrato.imprimir()

    print("-------------------------------- QUESTÃO 10 --------------------------------")
    calculadora = Calculadora()
    print("somando 2 valores: ", calculadora.soma(3, 4))
    print("somando 3 valores: ", calculadora.soma(3, 4, 10))

    print("-------------------------------- QUESTÃO 11 --------------------------------")
    empregado1.calcularSalario()

    empregado_horista = EmpregadoHorista(
        "George",
        "Consultor",
        60,
        40
    )
    empregado_horista.calcularSalario()

    print("-------------------------------- QUESTÃO 12 --------------------------------")
    produto1 = Produto("Banana", 5)
    produto2 = Produto("Limao", 3)
    print("Somando valores de dois produtos", produto1 + produto2)

    print("-------------------------------- QUESTÃO 13 --------------------------------")
    print("Calculando Fatorial de 5: ", Calculadora.fatorial(5))

    print("-------------------------------- QUESTÃO 14 --------------------------------")
    config1 = Configuracao()
    config2 = Configuracao()

    print("Testando configurações [config1 == config2]: ", config1 == config2)
	
main()