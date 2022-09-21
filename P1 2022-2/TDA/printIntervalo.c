#include <stdio.h>
#include <stdlib.h>

int main(){
    
    int inicio, fim, passo;
    
    printf("Digite o valor inicial do seu intervalo: ");
    scanf("%d", &inicio);
    
    printf("Digite o valor final do seu intervalo: ");
    scanf("%d", &fim);
    
    printf("Digite o passo entre cada valor: ");
    scanf("%d", &passo);
    
    for (inicio; inicio <= fim; inicio += passo){
        printf("%d\n", inicio);
    }
    
return 0;
}