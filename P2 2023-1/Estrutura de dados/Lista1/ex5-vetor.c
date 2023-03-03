// Lista 1 Exercicio 5
// Estrutura de dados

//Elaborar um programa que efetue a leitura de 5 valores positivos inteiros e 
//armazená-los em um vetor. Percorrer este vetor, apresentando cada valor, 
//e encontrar e apresentar o maior e o menor valor informado pelo usuário.

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int i;
	int vetor[5] = {};

	for (i=0;i<5;i++){
		
		printf("insira um numero inteiro positivo: ");
		scanf("%d", &vetor[i]);
		
	}
	int maior = vetor[0];
	int menor = vetor[0];
	
	for (i=0;i<5;i++){
		if (vetor[i]>maior){
			maior = vetor[i];
		}		
		if (vetor[i]<menor){
			menor = vetor[i];
		}
		
		printf("%d: %d\n", i+1, vetor[i]);	
	}
	
	printf("\nMaior: %d\nMenor: %d", maior, menor);
	
	return 0;
	
}
