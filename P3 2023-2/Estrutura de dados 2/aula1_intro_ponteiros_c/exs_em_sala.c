#include <stdio.h>

int main()
{

    int varint[5] = {0,1,2,3,4};

    printf("--------------Ponteiros--------------\n");
    for (int i=0; i < 5; i++) {
        printf("Índice %d | Aritmetica de ponteiros: %d\n", varint[i], *(varint+i) );
    }
    printf("-------------Função-Trim-------------\n");

    char *string = "   Teste\n";
    for (; *string == ' '; string++);
    printf("%s", string);

    printf("--------------Matrizes---------------\n");
    int matriz[2][3];
    int k=0;
    for (int i=0;i<2;i++){
        for (int j=0;j<3;j++){
            matriz[i][j] = k;
            printf("%d ", k++);
        }
        printf("\n");
    }
 
    return 0;
}
