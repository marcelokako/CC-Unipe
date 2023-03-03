#include <stdio.h>

int max(int num1, int num2){
	int result;
	
	if (num1>num2)
		result = num1;
	else 
		result = num2;
		
	return result; // primeira linha
		
}


int main(){
	
	int a = 100;
	int b = 200;
	int ret;
	
	ret = max(a,b); // segunda linha
	
	printf("max value is: %d", ret);
	
	return 0;
}