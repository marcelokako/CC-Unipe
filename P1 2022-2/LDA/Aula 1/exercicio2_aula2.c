#include <stdio.h>
#include <math.h>
#include <stdlib.h>

/*
1-) recebe base e altura de retangulo e calcula e exive a area

2-) recebe a temperatura em C e exibe em F

3-) recebe ano de nascimento e o ano atual e calcula a idade

*/

// exercicio 2

int main(){
	
	float C, F;
	
	printf("Digite a temperatura em C: ");
	scanf("%f", &C);
	
	F = 1.8 * C + 32;
	
	printf("Esta temperatura em F e: %f", F);
	
return 0;
}