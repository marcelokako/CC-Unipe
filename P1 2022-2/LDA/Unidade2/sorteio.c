// exemplo em sala 1 - sorteio

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	
	srand(time(0));
	int numeros[10], i, posicao = -1, palpite
	
	for (i = 0; i < 10; i++){
    	numeros[i] = rand() % 31;
	}
	printf("Digite um numero de 0 a 30: ");
	scanf("%d", &palpite);
	
	for (i=0; i<10; i++){
		if (palpite == numeros[i]){
			posicao = i;
		} 
	}
	
	if (posicao > 0){
		printf("\nVoce acertou!, o numero correto estava na posicao %d", posicao);
	} else {
		printf("\ntente novamente...");
	}
	
	for (i = 0; i < 10; i++){
    	printf("\n%d ", numeros[i]);
	}
	
	return 0;
}