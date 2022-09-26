// Questao 3
#include <stdio.h>

int main(){
	
	float maca;
	int qtd;
	
	printf("Quantas macas voce quer comprar? ");
	scanf("%d", &qtd);
	
	// 	Uma condicao adicional poderia ser colocada para impedir 
	// 	o usuario de colocar uma qtd <= 0
	if (qtd < 12){
		maca = 1.3;
	} else {
		maca = 1;	
	};
	
	printf("O preco final das %d macas ficou %.2f reais", qtd, maca*qtd);
	
	return 0;
}
