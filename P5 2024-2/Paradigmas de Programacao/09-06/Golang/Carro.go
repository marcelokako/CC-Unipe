package main

import "fmt"

type Motor struct {
	tipo     string
	potencia int
	ligado   bool
}

func (m *Motor) ligar() {
	m.ligado = true
	fmt.Println("O Motor está ligado")
}

func (m *Motor) desligar() {
	m.ligado = false
	fmt.Println("O Motor está desligado")
}

type Roda struct {
	marca   string
	tamanho int
	inflado bool
}

func (r *Roda) inflar() {
	r.inflado = true
	fmt.Println("A Roda está inflada")
}

func (r *Roda) desinflar() {
	r.inflado = false
	fmt.Println("A Roda está desinflada")
}

type Carro struct {
	Motor
	Rodas  []Roda
	ligado bool
}

func (c *Carro) ligarCarro() int {
	if !c.Motor.ligado {
		fmt.Println("Não é possível ligar o carro, o motor está desligado")
		return 0
	}

	for _, r := range c.Rodas {
		if !r.inflado {
			fmt.Println("Não é possível ligar o carro, tem pelo menos uma roda desinflada")
			return 0
		}
	}

	c.ligado = true
	fmt.Println("O Carro está ligado")
	return 1
}
