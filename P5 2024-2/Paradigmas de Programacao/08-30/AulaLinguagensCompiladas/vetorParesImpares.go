// Faça um programa em go que recebe 6 numeros inteiros e mostre
// - Os numeros pares digitados
// - A soma dos numeros pares digitados
// - Os numeros ímpares digitados
// - A quantidade de numeros ímpares

package main
import (
	"fmt"
)

func main() {

	var numeros [6]int
	var somaPares int
	var qtdImpares int

	fmt.Print("Digite 6 números inteiros: ")
	for i := 0; i < 6; i++ {
		fmt.Scan(&numeros[i])
	}
	
	fmt.Print("\nNúmeros pares digitados: ")
	for _, num := range numeros {
		if num%2 == 0 {
			fmt.Print(num, " ")
			somaPares += num
		}
	}
	fmt.Print("\nNúmeros ímpares digitados: ")
	for _, num := range numeros {
		if num%2 != 0 {
			fmt.Print(num, " ")
			qtdImpares++
		}
	}

	fmt.Printf("\nSoma pares: %d", somaPares)
	fmt.Printf("\nQuantidade ímpares: %d", qtdImpares)
}
