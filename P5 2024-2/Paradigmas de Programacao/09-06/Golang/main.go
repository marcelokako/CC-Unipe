package main

func main() {

	/*
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
		/*

		/*
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
	*/

	endereco := &Endereco{
		Rua:    "Rua 1",
		Cidade: "Cidade 2",
		Estado: "Estado 3",
		Cep:    "00000-000",
	}

	pessoa := &Pessoa{
		Nome:  "João",
		Idade: 30,
	}

	pessoa.AdicionarEndereco(endereco)

	empresa := &Empresa{
		Nome: "Empresa 5",
		Cnpj: "12.345.678/0001-90",
	}

	empresa.ContratarFuncionario(pessoa)

	pessoa.MostrarInformacoes()
	empresa.ListarFuncionarios()
}
