#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main()

{

  char str[10];

  int l= 0;

  

  printf("Input the string : ");

  fgets(str, 10, stdin);



  while(str[l] != '\0')

    l++;

  

  printf("The wanted value is : %d\n\n", l-1);
printf("\n strlen: %d", strlen(str));
}