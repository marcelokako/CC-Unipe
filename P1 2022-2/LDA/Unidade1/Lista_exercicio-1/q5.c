// Questao 5
#include <stdio.h>
#include <string.h>

int main(){
	
	char combustivel[10];
	float litros, preco, conta;
	float desc_gas, desc_alc, desc;
	int erro = 0;
	
	printf("Qual sera o combustivel a ser utilizado? alcool ou gasolina? ");
	scanf("%s", &combustivel);
		
	printf("Quantos litros de %s? ", combustivel);
	scanf("%f", &litros);
	
	if (litros <= 20){
		desc_gas = 0.04;
		desc_alc = 0.03;
	} else {
		desc_gas = 0.06;
		desc_alc = 0.05;
	}
		
	if (strcmp(combustivel,"alcool") == 0) {	
		preco = 0.9;
		desc = desc_alc;
	} else if (strcmp(combustivel,"gasolina") == 0) {
		preco = 1.2;
		desc = desc_gas;
	} else {
		erro = 1;
		printf("Combustivel digitado invalido!");
	}
	
	conta = litros * preco * (1 - desc);
	
	if (!erro) {
		printf("%.3f litros a R$%.2f com %.1f%% de desconto:\nConta final: R$%.2f", litros, preco, desc*100, conta);
	}
		
	return 0;
}
