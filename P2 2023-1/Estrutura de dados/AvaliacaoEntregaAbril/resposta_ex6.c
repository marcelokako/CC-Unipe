#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* a) listas, b) pilhas e
c) filas, com implementação sequencial e encadeada (dependendo da necessidade da aplicação). 
Considerando que estas estruturas irão armazenar, em cada nó, o nome e o telefone de uma 
pessoa, escreva as definições em C (typedef struct) destas três estruturas nas duas 
implementações”*/

// nó com dados de cada pessoa

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
	letraA_Enc_No * prox;
} LetraA_No_ListaEncadeada;

// b) Pilhas -NÃO CONCLUIDO, CONFERIR TUDO

typedef struct letraA_Seq_Lista {
	dado_pessoa dado;
	int tamanho;
	int topo
} letraA_ListaSequencial;

typedef struct letraA_Enc_No {
	dado_pessoa dado;
	letraA_Enc_No * prox;
} LetraA_No_ListaEncadeada;
