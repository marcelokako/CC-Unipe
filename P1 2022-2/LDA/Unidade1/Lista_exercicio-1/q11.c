// Questao 11
#include <stdio.h>

int main() {
    //  Ha duas interpretacoes para essa resolucao, a principal sera onde se calcula a media apenas dos numeros pares
    //  e a segunda so calculara se todos os numeros digitados forem pares, ela estara em comentarios com as explicacoes
    float num, media;
    float contador = 0, somador = 0;
    //  float contador2 = 0      // Este contador2 serve para contar TODO numero digitado
    //  int erro = 0             // e nao somente os numeros pares
    int erro = 0;
    do {
        
        printf("Digite um numero: ");
        scanf("%f", num);
        
        if (num % 2 == 0){      // Esta e a interpretacao principal, onde sera contado
            contador++;         // apenas os numeros pares para o calculo da media
            somador += num;
        }/* else {
            erro = 1;           // Se um dos numeros nao for par, a variavel erro ativará
        }
        contador2++; */
        
    } while (num != 0);

    media = somador / contador  // para a segunda interpretacao, aqui entraria o contador2

    //  if (erro == 0) {        // so entraria se a variavel erro nao for ativada
    printf("A media dos numeros pares e = %f", media); //  aqui apenas o texto precisaria mudar
    //}

    return 0;
}
