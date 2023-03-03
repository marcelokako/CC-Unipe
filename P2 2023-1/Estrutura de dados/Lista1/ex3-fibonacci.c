// Lista 1 Exercicio 3
// Estrutura de dados

//Apresentar a série de Fibonacci até o décimo quinto termo. A série de 
//Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34,... etc. 

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int i;
	int fibonacci[15] = {};

	fibonacci[0] = 1;
	fibonacci[1] = 1;
	
	for (i=0;i<15;i++){
		
		if (i>1){
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		printf("%d: %d\n", i+1, fibonacci[i]);
	}
	
	return 0;
}
