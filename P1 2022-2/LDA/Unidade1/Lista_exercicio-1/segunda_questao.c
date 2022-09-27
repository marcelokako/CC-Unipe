#include <stdio.h>

int main() {
 	
	int cardapio[] = {100, 101, 102, 103, 104, 105};
	int qntd[] = {0, 0, 0, 0, 0, 0};
	float preco[] = {1.2, 1.3, 1.5, 1.2, 1.3, 1.0};
	int codigo, quantidade;
	float conta = 0;
	
	do {
		printf("Digite o codigo do produto e a quantidade:\n");
		scanf("%d %d", &codigo, &quantidade);
		
		int i = 0;
		for (i;i <= 5; i++){
			if (codigo == cardapio[i]){
				qntd[i] += quantidade;
				conta += preco[i] * quantidade;
			}
		}
	} while (codigo != 0);	//	Condição de parada será digitar o código igual a 0
	
	int i = 0;
	for (i; i <= 5; i++){
		printf(" %d x Produto(%d): R$%.2f\n", qntd[i], cardapio[i], preco[i] * qntd[i]);
	}
	printf("Conta final: R$%.2f", conta);
    return 0;
}
