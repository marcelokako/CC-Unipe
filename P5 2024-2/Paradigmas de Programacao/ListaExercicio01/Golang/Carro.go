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
	Rodas      []Roda
	marca      string
	modelo     string
	ano        int
	ligado     bool
	velocidade float64
}

func (c *Carro) exibirDetalhes() {
	fmt.Printf(`
		Exibindo detalhes do Carro
		Motor {Tipo: %s, Potencia: %d}
		Rodas {Marca: %s, Tamanho: %d}
		Carro {Marca: %s, Modelo: %s, Ano: %d}
	`, c.tipo, c.potencia, c.Rodas[0].marca, c.Rodas[0].tamanho, c.marca, c.modelo, c.ano)
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

func (c *Carro) acelerar(v float64) {
	if c.ligado {
		fmt.Println("\nAcelerando carro")
		c.velocidade += v
		fmt.Printf("\nO Carro está a %.2f km/h", c.velocidade)
	} else {
		fmt.Println("\nO Carro está desligado")
	}
}

func (c *Carro) frear(v float64) {
	if c.ligado {
		fmt.Println("\nFreando carro")
		c.velocidade -= v
		if c.velocidade <= 0 {
			c.velocidade = 0
			fmt.Println("\nO Carro parou")
		} else {
			fmt.Printf("\nO Carro está a %.2f km/h", c.velocidade)
		}
	} else {
		fmt.Println("\nO Carro está desligado")
	}
}
