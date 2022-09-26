#include <stdio.h>
#include <stdlib.h>

// 	Faca um programa que le a idade de varias pessoas, ate que uma idade negativa seja digitada
// 	o algoritmo devera calcular e exibir a quantidade de pessoas com menos de 15 anos

int main(){
	
int idade, contador = -1;
	
	 do {
		
		printf("Insira sua idade: ");
		scanf("%d", &idade);
		
		if (idade < 15){
			contador++;
		}
		
	}  while (idade >= 0); 
		
	printf("Tiveram %d pessoas com menos de 15 anos", contador);
	
// 	Digitando 5 idades
	printf("\n Agora, so podera ser digitado ate 5 idade \n");
	
	contador = -1;
	for (int i = 1; i <= 5; i++){
		printf("Insira sua idade: ");
		scanf("%d", &idade);
		
		if (idade < 15){
			contador++;
		}
	}
	printf("Tiveram %d pessoas com menos de 15 anos", contador);
return 0;
}
