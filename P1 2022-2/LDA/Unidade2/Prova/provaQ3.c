#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){

int vetor[5];

int x;



for(x = 0; x < 5; x++){

printf("Digite o numero");

scanf("%d", &vetor[x]);
}

int i;
for (i = 0; i<=5;i++){
	printf("%d, ", vetor[i]);
}
	return 0;
}