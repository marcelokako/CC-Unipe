// Questao 6
#include <stdio.h>

int main(){
	
	float morango_kg, maca_kg;
	float morango_rs, maca_rs, conta;
	
	printf("Quantos quilos de morango deseja comprar? ");
	scanf("%f", &morango_kg);
	
	if (morango_kg <= 5){
		morango_rs = 2; //	R$/kg
	} else {
		morango_rs = 1.8;//	R$/kg
	}
	
	printf("Quantos quilos de maca deseja comprar? ");
	scanf("%f", &maca_kg);
		
	if (maca_kg <= 5){
		maca_rs = 1.5; //	R$/kg
	} else {
		maca_rs = 1.1;//	R$/kg
	}
	
	conta = morango_rs * morango_kg + maca_rs * maca_kg;
	
	//	   soma dos quilos totais   ou  mais que RS25
	if ( (maca_kg + morango_kg > 8) || (conta > 25) ){
		conta *= 0.9; // 	DESCONTO DE 10%
	} 
	
	printf("Conta Final\n%.1f kg de morango a R$%.2f/kg\n%.1f kg de maca a R$%.2f/kg\nTotal: R$%.2f",
	morango_kg, morango_rs, maca_kg, maca_rs, conta);

	return 0;
}
