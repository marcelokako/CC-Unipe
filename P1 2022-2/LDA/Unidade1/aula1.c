#include <stdio.h>  //standard input and output
#include <stdlib.h>  //standard library
#include <math.h> //grande parte das operações matemáticas

int main(void)  //assinatura do método principal 
{ //inicio do escopo

	printf("Hello world \n");

	//Variável é uma representação de um endereço de memória
	float	a; //declaração de variável
	a = 2; //atribuição de variável
	
	float b = 3; //declarar + atribuir = inicialização
	
	float soma = a + b;
	float pot = pow(a,b); //a^b
		
	printf("Resultado da soma: %.2f + %.2f = %.2f \n", a, b, soma);
	printf("Resultado da potencia: %.2f ^ %.2f = %f", a, b, pot);

return 0;
} //fim do escopo
