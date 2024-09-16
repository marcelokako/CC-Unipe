package main

func main() {

	dog := Cachorro{
		Animal:  Animal{nome: "Clifford"},
		especie: "Dálmata",
	}

	dog.emitirSom()

	morcego := Animal{nome: "batman"}
	batman := Morcego{
		Ave:      Ave{morcego},
		Mamifero: Mamifero{morcego},
	}

	batman.amamentar()
	batman.voar()
}
