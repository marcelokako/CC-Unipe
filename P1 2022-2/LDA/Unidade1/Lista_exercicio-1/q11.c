// Questao 11
#include <stdio.h>

int main() {
    //  H� duas interpreta��es para essa resolu��o, a principal ser� onde se calcula a m�dia apenas dos n�meros pares
    //  e a segunda s� calcular� se todos os n�meros digitados forem pares, ela estar� em coment�rios com as explica��es
    int num; 
	float media;
    float contador = -1, somador = 0;
    //  float contador2 = 0      // Este contador2 serve para contar TODO n�mero digitado, e n�o s� os pares
    //  int erro = 0             // Esta vari�vel seria o ativador para uma condi��o
    
	do {
        
        printf("Digite um numero: ");
        scanf("%d", &num);
        
        if (num % 2 == 0){      // Esta e a interpreta��o principal, onde ser� contado
            contador++;         // apenas os n�meros pares para o c�lculo da m�dia
            somador += num;
        }/* else {
            erro = 1;           // Se um dos n�meros n�o for par, a vari�vel erro ativar�
        }
        contador2++; */
        
    } while (num != 0);

    media = somador / contador;  // para a segunda interpreta��o, aqui entraria o contador2

    //  if (erro == 0) {        // so entraria se a vari�vel erro n�o for ativada
    printf("Media dos numeros pares = %f", media); //  aqui apenas o texto precisaria mudar
    //}

    return 0;
}
