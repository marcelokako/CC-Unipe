// exemplo em sala 1 - sorteio - 22/08/23

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int i, j = 0;
    int escolha;
    do {
        printf("Escolha a dificuldade: \n[1]Facil\n[2]Medio\n[3]Dificil\n");
        scanf("%d", &escolha);
    } while (escolha < 1 && escolha > 3);

    int tamanho_matriz;
    switch (escolha) {
    case 1:

        tamanho_matriz = 3;
        break;
    case 2:
        tamanho_matriz = 5;
        break;
    case 3:
        tamanho_matriz = 10;
        break;
    }

    int **matriz = NULL;

    matriz = (int **)malloc(tamanho_matriz * sizeof(int *));
    for (i=0; i < tamanho_matriz; i++) {
        *(matriz + i) = (int *)malloc(tamanho_matriz * sizeof(int));
    }


    for (i=0; i < tamanho_matriz; i++) {
        printf("|");
        for (j=0; j < tamanho_matriz; j++) {
            *((*(matriz + i)) + j) = rand() % 10;
            printf(" %d |", *( *(matriz + i) + j) );
        }
        printf("\n");
    }

    int palpite_linha, palpite_coluna;

    printf("Digite a linha e a coluna que voce acha que sera numero sorteado: ");
    scanf("%d %d", &palpite_linha, &palpite_coluna);

    int x, y; // coordenadas do sorteio
    x = rand() % tamanho_matriz;
    y = rand() % tamanho_matriz;

    if (x == palpite_linha && y == palpite_coluna) {
        printf("Parabens, voce acertou!!");
    } else {
        printf("Ah nao :(, a posicao correta era [%d][%d]", x, y);
    }

    return 0;
}
