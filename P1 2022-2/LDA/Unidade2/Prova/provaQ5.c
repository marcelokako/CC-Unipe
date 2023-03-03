#include <stdio.h>
#include <string.h>

int main(){
	
	char palavra[15];
	char letra;
	int contador = 0;
	int i;
	
	printf("Digite uma palavra qualquer: ");
	scanf("%s", palavra);
	getchar();
	
	printf("Agora, digite uma letra: ");
	scanf("%c", &letra);
	
	for (i=0; i < strlen(palavra); i++){
		if (palavra[i] == letra){
			contador++;
		}
	}
	
	printf("A letra [%c] aparece %d vezes na palavra [%s]", letra, contador, palavra);
	
	return 0;
}