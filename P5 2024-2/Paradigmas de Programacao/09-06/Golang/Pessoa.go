package main

import "fmt"

// Endereco struct represents an address.
type Endereco struct {
	Rua    string
	Cidade string
	Estado string
	Cep    string
}

func (e *Endereco) MostrarEndereco() {
	fmt.Printf("Rua: %s, Cidade: %s, Estado: %s, CEP: %s\n", e.Rua, e.Cidade, e.Estado, e.Cep)
}

type Pessoa struct {
	Nome     string
	Idade    int
	Endereco *Endereco
}

func (p *Pessoa) AdicionarEndereco(endereco *Endereco) {
	p.Endereco = endereco
}

func (p *Pessoa) MostrarInformacoes() {
	fmt.Printf("Nome: %s, Idade: %d\n", p.Nome, p.Idade)
	if p.Endereco != nil {
		fmt.Println("Endereço: ")
		p.Endereco.MostrarEndereco()
	} else {
		fmt.Println("Endereço não disponível")
	}
}

type Empresa struct {
	Nome         string
	Cnpj         string
	Funcionarios []*Pessoa
}

func (e *Empresa) ContratarFuncionario(funcionario *Pessoa) {
	e.Funcionarios = append(e.Funcionarios, funcionario)
}

func (e *Empresa) ListarFuncionarios() {
	fmt.Printf("Funcionários da empresa: %s\n", e.Nome)
	for _, funcionario := range e.Funcionarios {
		fmt.Println(funcionario.Nome)
	}
}
