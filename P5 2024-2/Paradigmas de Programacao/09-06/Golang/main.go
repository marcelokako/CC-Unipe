package main

func main() {

	// dog := Cachorro{
	// 	Animal:  Animal{nome: "Clifford"},
	// 	especie: "Dálmata",
	// }

	// dog.emitirSom()

	// morcego := Animal{nome: "batman"}
	// batman := Morcego{
	// 	Ave:      Ave{morcego},
	// 	Mamifero: Mamifero{morcego},
	// }

	// batman.amamentar()
	// batman.voar()

	motor := Motor{tipo: "Gasolina", potencia: 150}
	roda := Roda{marca: "Pirelli", tamanho: 100}
	meuCarro := Carro{
		Motor: motor,
		Rodas: make([]Roda, 4),
	}
	for i := range meuCarro.Rodas {
		meuCarro.Rodas[i] = roda
	}

	// Ligando carro passo a passo
	meuCarro.ligarCarro()

	meuCarro.Motor.ligar()
	meuCarro.ligarCarro()

	for i := range meuCarro.Rodas {
		meuCarro.Rodas[i].inflar()
	}
	meuCarro.ligarCarro()
}
