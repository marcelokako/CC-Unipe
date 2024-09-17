package main

import (
	"fmt"
)

// Definindo a estrutura Triangulo
type Animal struct {
	especie string
	nome    string
}

func (a Animal) emitirSom() {
	fmt.Println(a.nome, "faz um barulho...")
}

type Cachorro struct {
	Animal
	especie string
}

func (c Cachorro) emitirSom() {
	fmt.Println("Au Au")
}

type Gato struct {
	Animal
	especie string
}

func (g Gato) emitirSom() {
	fmt.Println("Miau")
}

type Mamifero struct {
	Animal
}

func (m Mamifero) amamentar() {
	fmt.Println(m.nome, "está amamentando...")
}

type Ave struct {
	Animal
}

func (a Ave) voar() {
	fmt.Println(a.nome, "está voando...")
}

type Morcego struct {
	Ave
	Mamifero
}

type AnimalInterface interface {
	emitirSom()
}

type Zoologico struct {
	Animais []AnimalInterface
}

func (z *Zoologico) adicionarAnimal(a AnimalInterface) {
	z.Animais = append(z.Animais, a)
}

func (z *Zoologico) sonsAnimais() {
	fmt.Printf("O Zoológico tem %d animais\n", len(z.Animais))

	for i := range z.Animais {
		z.Animais[i].emitirSom()
	}
}
