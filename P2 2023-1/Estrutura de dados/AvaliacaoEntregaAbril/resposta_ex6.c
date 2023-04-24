#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* a) listas, b) pilhas e
c) filas, com implementacao sequencial e encadeada (dependendo da necessidade da aplicacao). 
Considerando que estas estruturas irao armazenar, em cada no, o nome e o telefone de uma 
pessoa, escreva as definicoes em C (typedef struct) destas tres estruturas nas duas 
implementacoesù*/

// Dados de cada pessoa

typedef struct elemento {
	char[50] nome;
	char[20] telefone;
} dado_pessoa;

// a) Listas: Sequencial e Encadeada


typedef struct letraA_Seq_Lista {
	dado_pessoa dado;
	int tamanho;
} letraA_ListaSequencial;

typedef struct letraA_Enc_No {
	dado_pessoa dado;
	struct letraA_Enc_No * prox;
} LetraA_No_ListaEncadeada;

// b) Pilhas: Sequencial e Encadeada

typedef struct letraB_Pilha_Seq {
	dado_pessoa dado;
	int topo;
} letraB_PilhaSequencial;

typedef struct letraB_Pilha_Enc_No {
	dado_pessoa dado;
	struct letraB_Pilha_Enc_No * prox;
} LetraB_No_PilhaEncadeada;

// c) Filas: Sequencial e Encadeada

typedef struct letraC_Fila_Seq {
	dado_pessoa dado;
	int inicio;
	int fim;
} letraC_PilhaSequencial;

typedef struct letraC_Fila_Enc_No {
	dado_pessoa dado;
	struct letraC_Fila_Enc_No * prox;
} LetraC_No_PilhaEncadeada;

