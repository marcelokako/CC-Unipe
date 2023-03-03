// Lista 1 Exercicio 4
// Estrutura de dados

//Calcular e apresentar o somatório do número de grãos de trigo que se pode
// colocar em um tabuleiro de xadrez, obedecendo à seguinte regra: colocar
// um grão de trigo no primeiro quadro e nos quadros seguintes o dobro do quadro
// anterior. Ou seja, no primeiro quadro coloca-se 1 grão, no segundo quadro 
//coloca-se 2 grãos (neste momento têm-se 3 grãos), no terceiro quadro coloca-se 
//4 grãos (tendo neste momento 7 grãos), no quarto quadro colocam-se 8 grãos 
//(tendo-se então 15 grãos) até atingir o sexagésimo quarto quadro 

#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int i;
	unsigned long long graos = 1; 
	unsigned long long acumulador = 0;
	
	for (i=0;i<64;i++){
		acumulador += graos;
		graos *= 2;
		printf("%d: %llu\n", i+1, acumulador);
	}
	
	return 0;
}
