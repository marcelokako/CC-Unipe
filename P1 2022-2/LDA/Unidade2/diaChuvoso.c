// exemplo em sala 2 - chuva

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
	
	int semanaChuva[7]; // em mm
	char SEMANA[7][10] = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
	int maisChuva, menosChuva;
	int maisChuvaMM = -1;
	int menosChuvaMM = 12;
	int maisChuvaDia;
	int menosChuvaDia;
	float acumulador = 0;
	int i;
	srand(time(0));
	for (i = 0; i < 7; i++){
    	semanaChuva[i] = rand() % 11;
		
		if (semanaChuva[i] < menosChuvaMM) {
			menosChuvaMM = semanaChuva[i];
			menosChuvaDia = i;
		}
		if (semanaChuva[i] > maisChuvaMM){
			maisChuvaMM = semanaChuva[i];
			maisChuvaDia = i;
		}
		
		acumulador += semanaChuva[i];
	}
	
	printf("O dia que choveu menos foi: %s com %dmm", SEMANA[menosChuvaDia], semanaChuva[menosChuvaDia]);
	printf("\nO dia que choveu mais foi: %s com %dmm", SEMANA[maisChuvaDia], semanaChuva[maisChuvaDia]);
	printf("\nNo total choveu %.0fmm na semana e %f", acumulador, acumulador/7);
	
	return 0;
}