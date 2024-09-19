package main

import (
	"sync"
)

type Configuracao struct {
	valor string
}

var instancia *Configuracao
var once sync.Once

func ObterConfiguracao() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{valor: "Configuração padrão"}
	})
	return instancia
}
