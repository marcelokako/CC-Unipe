#include <stdio.h>  //standard input and output
#include <stdlib.h>  //standard library

int main(void)  //assinatura do método principal 
{ //inicio do escopo

	printf("Hello world \n");

	//Variável é uma representação de um endereço de memória
	float	a; //declaração de variável
	a = 2.3; //atribuição de variável
	
	float b = 3.1; //declarar + atribuir = inicialização
	
	float soma = a + b;
	
	printf("Resultado da soma: %f + %f = %f", a, b, soma);
	
} //fim do escopo
