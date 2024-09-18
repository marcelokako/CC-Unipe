package main

import (
	"errors"
	"fmt"
)

type ContaBancaria struct {
	titular string
	saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
	if valor > 0 {
		c.saldo += valor
		fmt.Printf("Depósito de R$%.2f realizado com sucesso! Novo saldo: R$%.2f\n", valor, c.saldo)
	} else {
		fmt.Println("O valor de depósito deve ser positivo!")
	}
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > 0 {
		if valor <= c.saldo {
			c.saldo -= valor
			fmt.Printf("Saque de R$%.2f realizado com sucesso! Novo saldo: R$%.2f\n", valor, c.saldo)
			return nil
		}
		return errors.New("Saldo insuficiente!")
	}
	return errors.New("o valor de saque deve ser positivo")
}

func (c *ContaBancaria) ObterSaldo() float64 {
	fmt.Printf("Saldo de R$%.2f\n", c.saldo)
	return c.saldo
}
