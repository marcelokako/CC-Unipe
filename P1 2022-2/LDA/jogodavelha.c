#include <stdio.h>
#include <stdlib.h>

int main() {

	int tabuleiroNum[3][3] = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};
	int tabuleiroJogadas[3][3] = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};

	char tabuleiroSim[3][3] = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};

	int i = 0, j = 0;
	int x, y;
	char jogador = 'X';
	int somador;
	int fimDoJogo = 1;
	int xtemp, ytemp;

	while (fimDoJogo) {

		for (i = 0; i < 3; i++) {
			printf("| ");
			for (j = 0; j < 3; j++) {
				printf(" %c ", tabuleiroSim[i][j]);
			}
			printf("|\n");
		}
		do {
			printf("\nJogador %c, digite a posicao: ", jogador);
			scanf("%d %d", &x, &y);
		} while (tabuleiroJogadas[x-1][y-1] != 0 || ((x > 3 || x < 0) || (y > 4 || y < 0)) );
		tabuleiroJogadas[x-1][y-1] = 9;

		if (jogador == 'X') {
			tabuleiroNum[x-1][y-1] = 1;
			tabuleiroSim[x-1][y-1] = 'X';
			jogador = 'O';
		} else {
			tabuleiroNum[x-1][y-1] = -1;
			tabuleiroSim[x-1][y-1] = 'O';
			jogador = 'X';
		}

		// Checar vitoria linha
		somador = 0;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				somador += tabuleiroNum[i][j];
			}
			if (abs(somador) == 3) {
				fimDoJogo = 0;
				continue;
			}
			somador = 0;
		}
		// Checar vitoria coluna
		somador = 0;
		for (j = 0; j < 3; j++) {
			for (i = 0; i < 3; i++) {
				somador += tabuleiroNum[i][j];
			}
			if (abs(somador) == 3) {
				fimDoJogo = 0;
				continue;
			}
			somador = 0;
		}
		// Checar vitoria diagonal 1
		somador = 0;
		for (i = 0; i < 3; i++) {
			somador += tabuleiroNum[i][i];
		}
		if (abs(somador) == 3) {
			fimDoJogo = 0;
			continue;
		}
		// Checar vitoria diagonal 2
		somador = 0;
		for (i = 0; i < 3; i++) {
			somador += tabuleiroNum[i][2-i];
		}
		if (abs(somador) == 3) {
			fimDoJogo = 0;
			continue;
		}

	}
	// Impressao final
	for (i = 0; i < 3; i++) {
		printf("| ");
		for (j = 0; j < 3; j++) {
			printf(" %c ", tabuleiroSim[i][j]);
		}
		printf("\n");
	}
	printf("PERDEDOR: JOGADOR %c", jogador);
	return 0;
}