// Lista 1 Exercicio 1 
// Estrutura de dados

//Apresentar as pot�ncias de 3, variando de O a 15. Deve ser considerado que 
//qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. Dever� ser 
//apresentado, observando a seguinte formata��o: 

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
