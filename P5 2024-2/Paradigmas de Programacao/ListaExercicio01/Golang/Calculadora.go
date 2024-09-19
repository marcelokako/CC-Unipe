package main

import "fmt"

func somaDois(a float64, b float64) float64 {
	resultado := a + b
	fmt.Println("Resultado da soma:", resultado)
	return resultado
}

func somaTres(a float64, b float64, c float64) float64 {
	resultado := a + b + c
	fmt.Println("Resultado da soma:", resultado)
	return resultado
}

type Produto struct {
	nome  string
	valor float64
}

func somaProdutos(p1 *Produto, p2 *Produto) float64 {
	return somaDois(p1.valor, p2.valor)
}

func fatorial(n int) int {
	resultado := 1
	if n > 0 {
		for i := 1; i <= n; i++ {
			resultado *= i
		}
	} else if n == 0 {
		resultado = 1
	} else {
		resultado = 0 // erro
	}
	fmt.Printf("%d! = %d\n", n, resultado)
	return resultado
}
