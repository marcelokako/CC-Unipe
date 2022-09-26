#include <stdio.h>
#include <time.h>
#include <stdlib.h>

/*
1-) recebe base e altura de retangulo e calcula e exive a area

2-) recebe a temperatura em C e exibe em F

3-) recebe ano de nascimento e o ano atual e calcula a idade

*/

// exercicio 3

int main(){
	
	int idade, hoje, nascimento;
	
	printf("Digite o ano de seu nascimento: ");
	scanf("%d", &nascimento);
	
	printf("Digite o ano atual: ");
	scanf("%d", &hoje);
	
	idade = hoje - nascimento; 
	
	printf("Voce vai fazer %d anos este ano", idade);
	
return 0;
}