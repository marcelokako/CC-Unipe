// 12/09/23

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int *aux = NULL;
    
    if (1==1){
        int *var = NULL;
        var = (int*)malloc(sizeof(int));
        if (var == NULL)
            printf("Alocacao falhou");
        *var = 4;
        printf("Conteudo var: %d\n", *var);
        aux = var;
        free(var); // sem isso, o conteúdo de var pode ser acessado por aux
    }
    
    printf("Conteudo aux: %d\n", *aux); // com o free, o conteúdo de aux eh algo qualquer
    printf("Passou da condicao");
    
    return 0;
}
