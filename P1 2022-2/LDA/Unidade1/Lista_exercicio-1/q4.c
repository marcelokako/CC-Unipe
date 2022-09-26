// Questao 4
#include <stdio.h>

int main(){
	
	char time1[10], time2[10];
	int gol1, gol2;
	
	printf("Digite o nome do primeiro time e a quantidade de gols: ");
	scanf("%s %d", &time1, &gol1);
	
	printf("Digite o nome do segundo time e a quantidade de gols: ");
	scanf("%s %d", &time2, &gol2);

	if (gol1 > gol2){
		printf("Placar: %s %d X %d %s\nO vencedor foi %s", time1, gol1, gol2, time2, time1);
	} else if (gol2 > gol1) {
		printf("Placar: %s %d X %d %s\nO vencedor foi %s", time1, gol1, gol2, time2, time2);
	} else {
		printf("Placar: %s %d X %d %s\n EMPATE", time1, gol1, gol2, time2);
	}
	
		
	return 0;
}
