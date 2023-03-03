// Lista 1 Exercicio 1 
// Estrutura de dados

//Apresentar as potências de 3, variando de O a 15. Deve ser considerado que 
//qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Deverá ser 
//apresentado, observando a seguinte formatação: 

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int i; 
	int valor = 1;
	
	for (i=0;i<=15;i++){
		
		printf("3 elevado a %d = %d\n", i, valor);
		valor *= 3;
		
	}
	
	return 0;
}
