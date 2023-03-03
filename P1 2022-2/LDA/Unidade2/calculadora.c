#include <stdio.h>
#include <math.h>

float soma(float n1, float n2) {
	return n1+n2;
}

float subtracao(float n1, float n2) {
	return n1-n2;
}

float multiplicacao(float n1, float n2) {
	return n1*n2;
}

float divisao(float n1, float n2) {
	if (n2!=0) {
		return n1/n2;
	} else {
		printf("Divisor deve ser diferente de zero\n");
	}
}


int main() {

	float numero1, numero2;
	int escolha;
	float resultado;
	int erro = 0;

	while (escolha != 5) {

		printf("Digite os dois numeros: ");
		scanf("%f %f", &numero1, &numero2);	
		
		printf("\nEscolha qual operacao deseja executar\n[1]Adicao \n[2]Subtracao \n[3]Multiplicacao \n[4]Divisao \n[5]Sair da calculadora\n");
		scanf("%d", &escolha);
		
		
		switch (escolha) {
			case 1:
				resultado = soma(numero1,numero2);
				break;
			case 2:
				resultado = subtracao(numero1,numero2);
				break;
			case 3:
				resultado = multiplicacao(numero1,numero2);
				break;
			case 4:
				resultado = divisao(numero1,numero2);
				break;
			case 5:
				break;
			default:
				erro = 1;
				printf("Opcao invalida\n");
		}
		
		if (erro != 1){
			printf("O resultado da sua operacao foi: %f\n\n", resultado);
		} else {
			erro = 0;
		}
	}

return 0;
}
