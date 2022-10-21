// exemplo em sala 3 - inverter

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int numeros[6];
	int i;
	
	for (i=0; i < 6; i++){
		printf("Digite um numero: ");
		scanf("%d", &numeros[i]);
	}
	
	for (i=5; i > -1; i--){
		printf(" %d ", numeros[i]);
	}	
	return 0;	
}