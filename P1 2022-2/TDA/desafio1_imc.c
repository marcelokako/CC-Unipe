#include <stdio.h>

int main (void) {
	
	float peso, altura, imc;
	
	printf("Informe seu peso em kg \n");
	scanf("%f", &peso);
	printf("Informe sua altura em metros \n");
	scanf("%f", &altura);
	
	imc = peso / (altura * altura);
	
	if (imc > 40) {
		printf("Voce possui obesidade morbida (grau III)");
	} else if (imc > 35) {
		printf("Voce possui obesidade grau II (severa)");
	} else if (imc > 30) {
		printf("Voce possui obesidade grau I");
	} else if (imc > 25) {
		printf("Voce esta levemente acima do peso");
	} else if (imc > 18.5) {
		printf("Voce esta no seu peso ideal"); 
	} else {
		printf("Voce esta abaixo do peso");
	}
	
	printf("\nImc = %f", imc);
	return 0;
}
