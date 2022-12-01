#include <stdio.h>
/*
Crie duas funções:
uma para retornar o maior número dentre 5 números e
outra para retornar o menor número.
Receba do usuário os cinco números e retorne para ele o maior e o menor, utilizando as funções.
*/
float maiorNumero(float num1,float num2, float num3, float num4, float num5) {

	float numeros[5] = {num1,num2,num3,num4,num5};
	float maior = numeros[0];
	int i;
	for (i=0; i<5; i++){
		if (numeros[i]>maior){
			maior = numeros[i];
		}
	}
return maior;
}

float menorNumero(float num1,float num2, float num3, float num4, float num5) {

	float numeros[5] = {num1,num2,num3,num4,num5};
	float menor = numeros[0];
	int i;
	for (i=0; i<5; i++){
		if (numeros[i]<menor){
			menor = numeros[i];
		}
	}
return menor;
}

int main() {

	int i;
	float numeroUsuario[5];
	float maior, menor;

	for (i=0;i<5;i++){
		printf("Digite o numero %d: ", i+1);
		scanf("%f", &numeroUsuario[i]);
	}
	
	maior = maiorNumero(numeroUsuario[0],numeroUsuario[1],numeroUsuario[2],numeroUsuario[3],numeroUsuario[4]);
	menor = menorNumero(numeroUsuario[0],numeroUsuario[1],numeroUsuario[2],numeroUsuario[3],numeroUsuario[4]);

	printf("\nO maior numero dentre os digitados e: %f\n e o menor e: %f", maior, menor);
	
	return 0;
}