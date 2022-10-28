// exemplo em sala 1 - sorteio

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	
	srand(time(0));
	int numeros[10], posicao[10];
	int i, palpite;
	int acerto = 0;
	
	for (i = 0; i < 10; i++){
    	numeros[i] = rand() % 11;
	}
	printf("Digite um numero de 0 a 30: ");
	scanf("%d", &palpite);
	
	for (i=0; i<10; i++){
		if (palpite == numeros[i]){
			posicao[i] = 1;
			acerto = 1;
		} else {
			posicao[i] = 0;
		}
	}
		if (acerto == 0){
			printf("\nVoce nao acertou, tente novamente.");
		} else {
			printf("\nO(s) numero(s) correto(s) estava(m) na(s) posicao(oes): ");			
			for (i = 0; i < 10; i++){
				if (posicao[i] == 0){
					continue;
				} else {
					printf("%d ", i);
				}				
			}
		}
	
	for (i = 0; i < 10; i++){
    	printf("\nPosicao [%d] | numero: %2.1d ", i, numeros[i]);
	}
	
	return 0;
}
