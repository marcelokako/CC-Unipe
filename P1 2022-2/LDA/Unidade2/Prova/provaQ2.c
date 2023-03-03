#include <stdio.h>

int main (void){

	int m1[10], m2[10], m3[10], i, j, mm=1, ctr=0;

	for(i=0; i<10; ++i){
		printf("Enter number%d: ",i+1);
		scanf("%d", &m1[i]);
	}

	for(i=0; i<10; i++)	{
		m2[i]=m1[i];
		m3[i]=0;
	}

	for(i=0; i<10; i++){
		for(j=0; j<10; j++){
			if(m1[i]==m2[j]){
				m3[j]=mm;
				mm++;
			}
		}
		mm=1;
	}

	for(i=0; i<10; i++){
		if(m3[i]==2)
			ctr++;
	}
	
	printf("The total number found is: %d \n", ctr);

	return 0;
}