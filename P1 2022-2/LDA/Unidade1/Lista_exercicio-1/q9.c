// Questao 9
#include <stdio.h>

int main(){
	
	float num, contador = 0;
	int i = 1;
	float media;
	
	for (i; i <= 10; i++){
		printf("%d) Digite um numero: ", i);
		scanf("%f", &num);
		
		contador += num;
		}
	
	media = contador / 10;
	printf("Media = %f", media);
	return 0;
}
