#include <stdio.h>
#include <stdlib.h>

int main(){
    
    int numero, contador = -1, acumulador = 0;
    // contador eh -1 pois nao quero que o '0' usado para encerrar seja incluso no contador
    do {
        printf("Digite um numero para a soma acumulada\n(digite '0' para encerrar)\n");
        scanf("%d", &numero);
        acumulador += numero;
        contador++;
    } while (numero != 0);
    
    printf("A soma acumulada dos %d numeros que voce digitou foi %d", contador, acumulador); 
    
return 0;
}
