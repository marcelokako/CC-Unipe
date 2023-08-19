/*
Escreva usando linguagem de sua preferencia, um programa de agenda telefônica
Utiliza estrutura de dados básica (ou objetos) e armazene em arquivos
Plus: ordene alfabeticamente
Entregas: algoritmo desenhado (fluxograma) + código
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>


typedef struct agenda {
    char nome[50];
    char telefone[20];
} t_contato;

int main(){
    int resp;
    char nome_temp[50];
    char telefone_temp[20];
    int tamanho = 0;

    t_contato minha_agenda[20];

    do {

    printf("\n------------MENU------------\n\n");
    
    printf("[1] Inserir contato\n[2] Listar contatos\n[3] Sair\n");
    scanf("%d", &resp);

    switch (resp){
        case 1:

            printf("Digite o nome do contato: \n");
            scanf("%s", nome_temp);

            printf("Digite o telefone do contato:\n ");
            scanf("%s", telefone_temp);

            strcpy(minha_agenda[tamanho].nome, nome_temp);
            strcpy(minha_agenda[tamanho].telefone, telefone_temp);

            tamanho++;
            break;
        case 2:
            printf("Listando Agenda\n");
            for (int i=0; i < tamanho; i++){
                printf("%d- Nome: %s | Telefone: %s\n", i+1, minha_agenda[i].nome, minha_agenda[i].telefone);
            }
            break;
        case 3:
            printf("Saindo...");
            break;
        default:
            printf("Opção inválida\n");
            break;
    }
    
    } while (resp != 3);

    FILE *agenda_telefonica;
    char nome_arquivo[] = "agenda.txt";

    agenda_telefonica = fopen(nome_arquivo, "w");

    for (int i=0; i < tamanho; i++){
        fprintf(agenda_telefonica, "%d- Nome: %s | Telefone: %s\n", i+1, minha_agenda[i].nome, minha_agenda[i].telefone);
    }

    fclose(agenda_telefonica);

    return 0;
}