// Lista 1 Exercicio 2
// Estrutura de dados

//Apresentar como resultado o valor de uma potência de uma base qualquer elevada
//a um expoente qualquer, BE (onde B é o valor da base e E o valor do expoente),
// informados pelo usuário.

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int i; int B; int E;
	int valor = 1;
	
	printf("Digite a base da potencia: ");
	scanf("%d", &B);

	printf("Digite o expoente da potencia: ");
	scanf("%d", &E);
	
	for (i=0;i<=E;i++){
		
		printf("%d elevado a %d = %d\n", B, i, valor);
		valor *= B;
		
	}
	
	return 0;
}
