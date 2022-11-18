#include <stdio.h>
#include <string.h>

// declaração da função = assinatura + corpo

void olamundo()	// assinatura da função
{		 		// inicio do corpo da função
	printf("hello world\n");
}		 		// fim do corpo da função

void printaIdade(int idade){
	printf("Sua idade e: %d\n", idade);
}

int soma(int n1,int n2){
	return n1+n2;
}

float pi(){
	return 3.14159;
}

int main(){
	olamundo();
	printaIdade(10);
	int x = soma(10, 20);
	printf("%d\n", x);
	printf("%f\n", pi());
	return 0;
}
