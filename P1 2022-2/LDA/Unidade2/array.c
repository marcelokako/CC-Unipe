#include <stdio.h>
#include <stdlib.h>

int main (){
	
	int numeros[10];
	int i;
	float somador = 0;
	for (i = 0; i < 10; i++){
		printf("Digite um numero: ");
		scanf("%d", &numeros[i]);
		somador += numeros[i];
	}
	for (i = 0; i < 10; i++){
		printf("%d ", numeros[i]);
	}
	printf("\nSoma dos valores: %.0f\nMedia dos numeros: %f", somador, somador/10);
	
	return 0;
}