#include <stdio.h>
#include <stdlib.h>

int main(){
	
	float salarios[8];
	float aumento[8];
	int i;
	
	for (i = 0; i < 8; i++){
		do {
			printf("Digite um salario valido: ");
			scanf("%f", &salarios[i]);
		} while (salarios[i] <= 0);
		aumento[i] = salarios[i] * 1.08;
	}
	
	for (i = 0; i < 8; i++){
		printf("%d | Salario inicial: R$%.2f | Salario com aumento de 8%%: R$%.2f\n", i+1, salarios[i], aumento[i]);
	}
	
	return 0;
}