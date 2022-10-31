#include <stdio.h>
#include <time.h>

int main() {
	srand(time(0));

	int matriz[3][4] = {
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12}
	};
	int i, j;

	for (i = 0; i < 3; i++) {
		for (j = 0; j < 4; j++) {
			printf("Vetor[%d][%d] => %d\n", i, j , matriz[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}