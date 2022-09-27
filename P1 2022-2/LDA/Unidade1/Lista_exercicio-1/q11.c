// Questao 11
#include <stdio.h>

int main() {
    //  Há duas interpretações para essa resolução, a principal será onde se calcula a média apenas dos números pares
    //  e a segunda só calculará se todos os números digitados forem pares, ela estará em comentários com as explicações
    int num; 
	float media;
    float contador = -1, somador = 0;
    //  float contador2 = 0      // Este contador2 serve para contar TODO número digitado, e não só os pares
    //  int erro = 0             // Esta variável seria o ativador para uma condição
    
	do {
        
        printf("Digite um numero: ");
        scanf("%d", &num);
        
        if (num % 2 == 0){      // Esta e a interpretação principal, onde será contado
            contador++;         // apenas os números pares para o cálculo da média
            somador += num;
        }/* else {
            erro = 1;           // Se um dos números não for par, a variável erro ativará¡
        }
        contador2++; */
        
    } while (num != 0);

    media = somador / contador;  // para a segunda interpretação, aqui entraria o contador2

    //  if (erro == 0) {        // so entraria se a variável erro não for ativada
    printf("Media dos numeros pares = %f", media); //  aqui apenas o texto precisaria mudar
    //}

    return 0;
}
