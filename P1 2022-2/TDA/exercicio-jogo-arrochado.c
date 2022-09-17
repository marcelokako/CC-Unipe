#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    int numSecret, palpite;
	int menor, maior;
	
	menor = 0;
	maior = 100;
	srand(time(0));
    numSecret = rand() % 101;
    
	//printf("%d\n\n",numSecret);
	
	while (numSecret != palpite){
		printf("Digite um numero inteiro entre %d e %d: ", menor, maior);
	    scanf("%d", &palpite);
			
		if ((palpite < numSecret) && (palpite > menor)) {
			menor = palpite;
		} else if ((palpite > numSecret) && (palpite < maior)){
			maior = palpite;
		}    
	}
	printf("Parabens, voce acertou o numero!");
return 0;
}
