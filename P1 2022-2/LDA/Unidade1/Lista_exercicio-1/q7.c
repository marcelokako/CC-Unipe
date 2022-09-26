// Questao 7
#include <stdio.h>

int main(){
	
	float indice_pol;
	
	printf("Qual foi o indice de poluicao medido? ");
	scanf("%f", &indice_pol);
	
	if (indice_pol >= 0.5){
		printf("Todos os tres grupos serao notificados a paralisarem as atividades");
	} else if (indice_pol >= 0.4){
		printf("O grupo 1 e grupo 2 serao notificados a paralisarem as atividades");
	} else if (indice_pol >= 0.3){
		printf("Apenas o grupo 1 sera notificado a paralisar as atividades");
	} else {
		printf("Nao sera necessario a notificacao a nenhum grupo");
	}

	return 0;
}
