// Questao 2
#include <stdio.h>

int main(){
	
	int A = 10,B = 20;
	int C;

	C = A;
	A = B;
	B = C;

	printf("A: %d, B: %d", A, B);
	return 0;
}
