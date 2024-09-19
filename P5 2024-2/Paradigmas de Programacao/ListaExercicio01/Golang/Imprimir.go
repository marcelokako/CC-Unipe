package main

import "fmt"

type imprimivel interface {
	imprimir()
}

type Relatorio struct {
	corpo string
	imprimivel
}

type Contrato struct {
	corpo       string
	contratante string
	imprimivel
}

func (r *Relatorio) imprimir() {
	fmt.Println("Imprimindo relatorio: \n", r.corpo)
}

func (c *Contrato) imprimir() {
	fmt.Println("Imprimindo contrato de", c.contratante, "\n", c.corpo)
}
