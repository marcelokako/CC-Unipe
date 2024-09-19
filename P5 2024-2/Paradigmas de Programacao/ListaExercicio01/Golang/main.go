package main

import "fmt"

// Lista Exercícios 01

func main() {

	fmt.Println("------------------------------ QUESTÃO 1 E 6 ------------------------------")
	motor := Motor{tipo: "Gasolina", potencia: 150}
	roda := Roda{marca: "Pirelli", tamanho: 100}
	meuCarro := Carro{
		Motor:  motor,
		marca:  "Hyundai",
		modelo: "HB20",
		ano:    2020,
		Rodas:  make([]Roda, 4),
	}
	meuCarro.Motor.ligar()

	for i := range meuCarro.Rodas {
		meuCarro.Rodas[i] = roda
		meuCarro.Rodas[i].inflar()
	}
	meuCarro.exibirDetalhes()

	meuCarro.ligarCarro()

	fmt.Println("-------------------------------- QUESTÃO 2 --------------------------------")
	meuCarro.acelerar(50)
	meuCarro.acelerar(50)
	meuCarro.frear(75)
	meuCarro.frear(100)

	fmt.Println("-------------------------------- QUESTÃO 4 --------------------------------")
	cachorro := Cachorro{
		Animal:  Animal{nome: "Clifford"},
		especie: "Dálmata",
	}

	cachorro.emitirSom()
	gato := Gato{
		Animal:  Animal{nome: "Garfield"},
		especie: "Laranja",
	}

	gato.emitirSom()
	fmt.Println("-------------------------------- QUESTÃO 5 --------------------------------")
	zoologico := Zoologico{}
	zoologico.adicionarAnimal(cachorro)
	zoologico.adicionarAnimal(gato)
	zoologico.sonsAnimais()

	fmt.Println("------------------------------ QUESTÃO 3 e 15 ------------------------------")
	conta := ContaBancaria{
		titular: "Marcelo",
		saldo:   1500,
	}

	conta.ObterSaldo()

	conta.Depositar(500.0)

	err := conta.Sacar(300.0)
	if err != nil {
		fmt.Println("Erro ao sacar:", err)
	}

	err = conta.Sacar(2000.0)
	if err != nil {
		fmt.Println("Erro ao sacar:", err)
	}

	fmt.Println("-------------------------------- QUESTÃO 7 --------------------------------")

	escola1 := &Escola{nome: "Escola 1"}
	escola2 := &Escola{nome: "Escola 2"}

	professor1 := &Professor{nome: "Carlos"}
	professor2 := &Professor{nome: "Gilberto"}
	professor3 := &Professor{nome: "Maria"}

	escola1.contrataProfessor(professor1)
	escola1.contrataProfessor(professor2)

	escola2.contrataProfessor(professor3)
	escola2.contrataProfessor(professor2)

	escola1.listaProfessores()
	escola2.listaProfessores()

	professor2.listaEscolas()

	fmt.Println("-------------------------------- QUESTÃO 8 --------------------------------")

	empresa := &Empresa{nome: "Empresa 1"}
	funcionario1 := &Funcionario{
		nome:    "Carlos",
		cargo:   "Diretor",
		salario: 5000,
	}
	funcionario2 := &Funcionario{
		nome:    "Gilberto",
		cargo:   "Assistente",
		salario: 1000,
	}
	empresa.contrataFuncionario(funcionario1)
	empresa.contrataFuncionario(funcionario2)
	empresa.listaFuncionarios()

	fmt.Println("-------------------------------- QUESTÃO 9 --------------------------------")
	relatorio := &Relatorio{corpo: "Este é o corpo de um Relatorio"}
	contrato := &Contrato{corpo: "Este é o corpo de um Contrato", contratante: "Marcelo"}

	relatorio.imprimir()
	contrato.imprimir()

	fmt.Println("-------------------------------- QUESTÃO 10 --------------------------------")
	somaDois(2, 3)
	somaTres(2, 3, 5)

	fmt.Println("-------------------------------- QUESTÃO 11 --------------------------------")
	funcionario1.calcularSalario()
	funcionarioHorista1 := &FuncionarioHorista{
		nome:         "Jobson",
		cargo:        "Secretário",
		precoHora:    30,
		cargaHoraria: 40,
	}
	funcionarioHorista1.calcularSalario()

	fmt.Println("-------------------------------- QUESTÃO 12 --------------------------------")
	produto1 := Produto{nome: "produto1", valor: 50}
	produto2 := Produto{nome: "produto2", valor: 150}
	somaProdutos(&produto1, &produto2)

	fmt.Println("-------------------------------- QUESTÃO 13 --------------------------------")
	fatorial(5)

	fmt.Println("-------------------------------- QUESTÃO 14 --------------------------------")
	config1 := ObterConfiguracao()
	config2 := ObterConfiguracao()

	fmt.Println("Config1:", config1)
	fmt.Println("Config2:", config2)

	config1.valor = "Configuração alterada"

	fmt.Println("Valor de Config1:", config1.valor)
	fmt.Println("Valor de Config2:", config2.valor)
}
