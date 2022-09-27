#include <stdio.h>
#include <string.h>

int main (void) {

	int sangue;

	printf("Informe seu tipo sanguineo: \n[1] A+ \n[2] A- \n[3] B+ \n[4] B- \n[5] AB+ \n[6] AB- \n[7] O+ \n[8] O- \n");
	scanf("%d", &sangue);

	switch(sangue) {
		case 1:
			printf("Seu tipo sanguineo e A+.\nVoce pode doar para: AB+ e A+.\nVoce pode receber de: A+, A-, O+ e O-.\n");
			break;
		case 2:
			printf("Seu tipo sanguineo e A-.\nVoce pode doar para: AB+, A+, AB- e A-.\nVoce pode receber de: A- e O-.\n");
			break;
		case 3:
			printf("Seu tipo sanguineo e B+.\nVoce pode doar para: B+ e AB+.\nVoce pode receber de: B+, B-, O+ e O-.\n");
			break;
		case 4:
			printf("Seu tipo sanguineo e B-.\nVoce pode doar para: B+, B-, AB+ e AB-.\nVoce pode receber de: B-, O-.\n");
			break;
		case 5:
			printf("Seu tipo sanguineo e AB+.\nVoce pode doar para: AB+.\nVoce pode receber de: Todos.\n");
			break;
		case 6:
			printf("Seu tipo sanguineo e AB-.\nVoce pode doar para: AB+ e AB-.\nVoce pode receber de: A-, B-, O- e AB-.\n");
			break;
		case 7:
			printf("Seu tipo sanguineo e O+.\nVoce pode doar para: A+, B+, O+ e AB+.\nVoce pode receber de: O+ e O-.\n");
			break;
		case 8:
			printf("Seu tipo sanguineo e O-.\nVoce pode doar para: Todos.\nVoce pode receber de: O-.\n");
			break;
		default:
			printf("Numero invalido");
	}

	return 0;
}
