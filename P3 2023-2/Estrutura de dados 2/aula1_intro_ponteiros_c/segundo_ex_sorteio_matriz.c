// exemplo em sala 1 - sorteio

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    srand(time(0));
    int escolha;
    do {
        printf("Escolha a dificuldade: \n[1]Fácil\n[2]Médio\n[3]Difícil\n");
        scanf("%d", &escolha);
    } while (escolha < 1 && escolha > 3);

    int t_matriz;
    switch (escolha) {
    case 1:
        
        t_matriz = 3;
        break;
    case 2:
        t_matriz = 5;
        break;
    case 3:
        t_matriz = 10;
        break;
    }

    int matriz[t_matriz][t_matriz];

    for (int i=0; i < t_matriz; i++) {
        printf("|");
        for (int j=0; j < t_matriz; j++) {
            matriz[i][j] = rand() % 10;
            printf(" %d |", matriz[i][j] );
        }
        printf("\n");
    }

    int palpite_linha, palpite_coluna;

    printf("Digite a linha e a coluna que voce acha que será numero sorteado: ");
    scanf("%d %d", &palpite_linha, &palpite_coluna);

    int x, y; // coordenadas do sorteio
    x = rand() % t_matriz;
    y = rand() % t_matriz;

    if (x == palpite_linha && y == palpite_coluna){
        printf("Parabéns, você acertou!!");
    } else {
        printf("Ah não :(, tente novamente\n a posição correta era [%d][%d]", x, y);
    }

    return 0;
}
