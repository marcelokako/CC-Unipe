// 12/09/23

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int tamanho_x = 10;
    int tamanho_y = 10;
    // ------- Array ------- //
    int array[tamanho_x];
    int *array_d = NULL;
    array_d = (int *)malloc(tamanho_x * sizeof(int)); // 10 * a quantidade de um inteiro
    
    array_d[0] = 10;
    printf("primeiro valor: %d\n", array_d[0]);
    *(array_d+1) = 30; 
    printf("segundo valor: %d\n", array_d[1]);

    for (int i = 0; i < tamanho_x; i++){
        printf("%d: %d\n", i, *(array_d+i));
    }
    
    // ------- Matriz ------- //
    printf("--------------------------------------\n");
    int **matriz_d = NULL;
    int linhas = 0;
    
    matriz_d = (int **)malloc(tamanho_x * sizeof(int *)); 
    for (linhas = 0; linhas < tamanho_y; linhas++){
        *(matriz_d + linhas) = (int *)malloc(tamanho_y * sizeof(int));
    }
    
    printf(" _____ _____ _____ _____ _____ _____ _____ _____ _____ _____\n");
    for (int i = 0; i < tamanho_x; i++){
        printf("|");
        for (int j = 0; j < tamanho_y; j++){
            *( *(matriz_d+i) +j) = rand() % 10;
            printf("__%d__|", *(*(matriz_d+i)+j) );
        }
        printf("\n");
    }
    return 0;
}
