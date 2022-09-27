// Questao 12
#include <stdio.h>

int main() {
 	
	float salario, media_salario, media_filhos, maior = 0;
	int filhos, contador100 = 0, habitantes = 0;
	float somador_salario = 0, somador_filhos = 0, percentual100;
	
	do {
		printf("Digite o seu salario: ");
		scanf("%f", &salario);	
		if (salario < 0) {break;} // condicao de parada deve ser colocada aqui para nao
								 // atrapalhar a media dos filhos nem numero de habitantes
		printf("Digite o numero de filhos: ");
		scanf("%d", &filhos);
		
		if (salario > maior){
			maior = salario;
		}
		if (salario <= 100){
			contador100++;
		}
		
		somador_salario += salario;
		somador_filhos += filhos;
		habitantes++;
		
	} while (salario >= 0);
	
	media_salario = somador_salario / habitantes;
	media_filhos = somador_filhos / habitantes;
	percentual100 = contador100 * 100.0 / habitantes;
	
	printf("\nMedia do salario da populacao: R$%.2f\nMedia do numero de filhos: %f\n", media_salario, media_filhos);
	printf("O maior salario digitado foi: R$%.2f\nPercentual de pessoas com salario ate R$100: %f%%", maior, percentual100);

    return 0;
}
