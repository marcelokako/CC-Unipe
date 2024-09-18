package main

import "fmt"

type Professor struct {
	nome    string
	Escolas []*Escola
}

type Escola struct {
	nome        string
	Professores []*Professor
}

func (e *Escola) contrataProfessor(p *Professor) {
	e.Professores = append(e.Professores, p)
	p.Escolas = append(p.Escolas, e)
}

func (e *Escola) listaProfessores() {
	fmt.Println("Listando professores da escola ", e.nome)
	for _, p := range e.Professores {
		fmt.Println(p.nome)
	}
}

func (p *Professor) listaEscolas() {
	fmt.Println("Listando escolas do professor ", p.nome)
	for _, e := range p.Escolas {
		fmt.Println(e.nome)
	}
}
