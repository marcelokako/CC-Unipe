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

}
