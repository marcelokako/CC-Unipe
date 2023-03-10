#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

// CRIANDO TIPO DO NOSSO VETOR; É UMA LISTA DE NOME E TELEFONE, SEU NOME SERÁ CONTATO
typedef struct informacoes {
	char nome[50];
	char telefone[20];
} Contato;

// CRIANDO A LISTA, A LISTA NESSE CASO É UM TIPO NÃO PRIMITIVO, CONTEM UM VETOR COM OS CONTATOS E UMA VARIAVEL N
typedef struct lista {
	Contato vetor[MAX]; // VETOR COM CONTATO (nome e telefone)
	int n;	// variável que diz o índice do ultimo valor preenchido da lista
} Lista;

// CRIAÇÃO DA FUNÇÃO DE CRIAÇÃO DE LISTA; ATRIBUO N COMO -1 PARA INICIAR COMO VAZIA (INDICE=-1)
Lista criar(){
	Lista lista;
	lista.n = -1;
	return lista;
}

int estaVazia(Lista * lista){
	return (lista->n == -1);
	/*if (lista->n == -1){
		return 1;
	} else {
		return 0;
	}*/
	}

int estaCheia(Lista * lista){
	return (lista->n == MAX);
	/*if (lista->n == MAX-1){
		return 1;
	} else {
		return 0;
	}*/
}

int tamanho(Lista * lista){
	return (lista-> n + 1);
}

void adcContato(Lista * lista, Contato contato){
	int pos = lista->n + 1;
	strcpy(lista->vetor[pos].nome, contato.nome);
	strcpy(lista->vetor[pos].telefone, contato.telefone);
	printf("[%d]", lista->n);
	lista->n =+ 1;
}

int main(){
	Lista minhaLista = criar();
	
	Contato Luiz;
	strcpy(Luiz.nome, "Luiz");
	strcpy(Luiz.telefone,"83987654321");
	adcContato(&minhaLista, Luiz);
	
	printf("\tEsta vazia? %d\n\tEsta cheia? %d", estaVazia(&minhaLista), estaCheia(&minhaLista));
	printf("\n\tTamanho da lista: %d", tamanho(&minhaLista));
	
	printf("\nNome: %s\nTelefone: %s", minhaLista.vetor[0].nome, minhaLista.vetor[0].telefone);
	
	return 0;
}
