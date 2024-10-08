# Lista Exercícios 01
from Carro import *
from Animal import *
from ContaBancaria import *

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

	# escola1 := &Escola{nome: "Escola 1"}
	# escola2 := &Escola{nome: "Escola 2"}

	# professor1 := &Professor{nome: "Carlos"}
	# professor2 := &Professor{nome: "Gilberto"}
	# professor3 := &Professor{nome: "Maria"}

	# escola1.contrataProfessor(professor1)
	# escola1.contrataProfessor(professor2)

	# escola2.contrataProfessor(professor3)
	# escola2.contrataProfessor(professor2)

	# escola1.listaProfessores()
	# escola2.listaProfessores()

	# professor2.listaEscolas()

    print("-------------------------------- QUESTÃO 8 --------------------------------")

	# empresa := &Empresa{nome: "Empresa 1"}
	# funcionario1 := &Funcionario{
	# 	nome:    "Carlos",
	# 	cargo:   "Diretor",
	# 	salario: 5000,
	# }
	# funcionario2 := &Funcionario{
	# 	nome:    "Gilberto",
	# 	cargo:   "Assistente",
	# 	salario: 1000,
	# }
	# empresa.contrataFuncionario(funcionario1)
	# empresa.contrataFuncionario(funcionario2)
	# empresa.listaFuncionarios()

    print("-------------------------------- QUESTÃO 9 --------------------------------")
	# relatorio := &Relatorio{corpo: "Este é o corpo de um Relatorio"}
	# contrato := &Contrato{corpo: "Este é o corpo de um Contrato", contratante: "Marcelo"}

	# relatorio.imprimir()
	# contrato.imprimir()

    print("-------------------------------- QUESTÃO 10 --------------------------------")
	# somaDois(2, 3)
	# somaTres(2, 3, 5)

    print("-------------------------------- QUESTÃO 11 --------------------------------")
	# funcionario1.calcularSalario()
	# funcionarioHorista1 := &FuncionarioHorista{
	# 	nome:         "Jobson",
	# 	cargo:        "Secretário",
	# 	precoHora:    30,
	# 	cargaHoraria: 40,
	# }
	# funcionarioHorista1.calcularSalario()

    print("-------------------------------- QUESTÃO 12 --------------------------------")
	# produto1 := Produto{nome: "produto1", valor: 50}
	# produto2 := Produto{nome: "produto2", valor: 150}
	# somaProdutos(&produto1, &produto2)

    print("-------------------------------- QUESTÃO 13 --------------------------------")
	# fatorial(5)

    print("-------------------------------- QUESTÃO 14 --------------------------------")
	# config1 := ObterConfiguracao()
	# config2 := ObterConfiguracao()

	# print("Config1:", config1)
	# print("Config2:", config2)

	# config1.valor = "Configuração alterada"

	# print("Valor de Config1:", config1.valor)
	# print("Valor de Config2:", config2.valor)
	
main()