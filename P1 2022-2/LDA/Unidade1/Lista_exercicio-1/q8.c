// Questao 8
#include <stdio.h>

int main(){
	
	int Num;
	
	printf("Digite um numero inteiro positivo maior que 1: ");
	scanf("%d", &Num);
	
	int i = 1;
	
	if (Num >= 1){
		while (i <= Num) {	
			printf("%d\n", i);
			i++;
		}
	} else {
		printf("Numero invalido");
	}
	
	
	return 0;
}
