package main

import "fmt"

type Funcionario struct {
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
