#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int i = 1;
	
	for (i; i<=10; i++){
		printf("%d | ", i);
	}
	
	printf("\n--------------------------------\n");
	i = 1;
	
	while (i<=10){
		printf("%d | ", i);	
		i++;	
	}
	
	printf("\n--------------------------------\n");
	i = 1;
	
	do {
		printf("%d | ", i);	
		i++;	
	} while (i<=10);
	
return 0;
}
