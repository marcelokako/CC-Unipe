#include <stdio.h>
#include <string.h>

int main(){
	
	char nome[20]; // para o compilador, toda string terminara com um '\0' que significa end of text;
	int erro = 0;
	char comparacao[20];
	
	printf("Digite uma palavra que comece com A e tenha no maximo 5 char: ");
	fgets(nome, 20, stdin); // 
	
	printf("%s\n", nome);
	
	if (nome[0] != 'A' && nome[0] != 'a'){
		printf("Errado! Voce iniciou com a letra 'A'\n");
		erro++;
	}
	if (strlen(nome)-1 > 5 ){
		printf("Errado! Voce digitou uma palavra com mais de 5 letras\n");
		erro++;
	}
	if (erro == 0){
		printf("Deu turo certo\n");
	}
	
	printf("Agora, digite uma palavra qualquer\n"); // string length, ele conta o '\n', mas nao conta o '\0'
	fgets(comparacao, 20, stdin);
	
	if (strcmp(nome, comparacao) == 0){
		printf("As 2 palavras sao iguais\n");
	} else {
		printf("As 2 palavras sao diferentes\n");
	}
	
	
	return 0;
}
