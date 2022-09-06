#include <stdio.h>
#include <math.h>
#include <stdlib.h>

// calcular área de terreno
int main(){
	
	float x1, y1;
	float x2, y2;
	float distancia; 
	
	
	printf("Digite o primeiro ponto: ");
	scanf("%f %f", &x1, &y1);
	
	printf("Digite o segundo ponto: ");
	scanf("%f %f", &x2, &y2);
	
	distancia = sqrt(pow(x2-x1,2) + pow(y2-y1,2));
	
	printf("distancia: %f", distancia);

return 0;
}
