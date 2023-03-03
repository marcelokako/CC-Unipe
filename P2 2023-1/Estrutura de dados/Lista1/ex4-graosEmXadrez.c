// Lista 1 Exercicio 4
// Estrutura de dados

//Calcular e apresentar o somat�rio do n�mero de gr�os de trigo que se pode
// colocar em um tabuleiro de xadrez, obedecendo � seguinte regra: colocar
// um gr�o de trigo no primeiro quadro e nos quadros seguintes o dobro do quadro
// anterior. Ou seja, no primeiro quadro coloca-se 1 gr�o, no segundo quadro 
//coloca-se 2 gr�os (neste momento t�m-se 3 gr�os), no terceiro quadro coloca-se 
//4 gr�os (tendo neste momento 7 gr�os), no quarto quadro colocam-se 8 gr�os 
//(tendo-se ent�o 15 gr�os) at� atingir o sexag�simo quarto quadro 

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
