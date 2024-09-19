package main

import "fmt"

type Funcionario struct { // será o funcionario assalariado para questao 11
	nome    string
	cargo   string
	salario float64
}

type Empresa struct {
	nome         string
	Funcionarios []*Funcionario
}

func (e *Empresa) contrataFuncionario(f *Funcionario) {
	e.Funcionarios = append(e.Funcionarios, f)
}

func (e *Empresa) listaFuncionarios() {
	fmt.Println("Listando funcionarios da empresa ", e.nome)
	for _, f := range e.Funcionarios {
		fmt.Println(f.nome)
	}
}

type calcularSalario interface {
	calcularSalario()
}

func (f *Funcionario) calcularSalario() float64 {
	fmt.Println("Salário de", f.nome, ": R$ ", f.salario)
	return f.salario
}

type FuncionarioHorista struct {
	nome         string
	cargo        string
	precoHora    float64
	cargaHoraria int
}

func (fh *FuncionarioHorista) calcularSalario() float64 {
	fmt.Println("Salário de", fh.nome, ": R$ ", (fh.precoHora * float64(fh.cargaHoraria)))
	return (fh.precoHora * float64(fh.cargaHoraria))
}
