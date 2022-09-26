#include <stdio.h>
#include <math.h>
#include <stdlib.h>

/*
1-) recebe base e altura de retangulo e calcula e exive a area

2-) recebe a temperatura em C e exibe em F

3-) recebe ano de nascimento e o ano atual e calcula a idade

*/

// exercicio 1

int main(){
	
	float base, altura, area;
	
	printf("Digite a base do retangulo: ");
	scanf("%f", &base);
	
	printf("Digite a altura do retangulo: ");
	scanf("%f", &altura);
	
	area = base * altura;
	
	printf("O retangulo de base %f e altura %f possui a area: %f", base, altura, area);
	
	
return 0;
}