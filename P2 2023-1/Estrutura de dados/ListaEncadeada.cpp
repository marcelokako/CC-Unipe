// Lista encadeada
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct No {
	char nome[20];
	No *prox;
} Aluno;

typedef struct listaEncadeada {
	Aluno *cabeca;
} ListaE;

ListaE criarEncadeada(){
	return ListaE;
}

int getTamanho (Aluno *aluno){
	int tamanho = 0;
	temp = &aluno;
	while (temp->prox != null){
		temp = temp->prox;
		tamanho++;
	}
	return tamanho;
}


bool estaVazia(Aluno *aluno){
	if (aluno->prox == null){
		return true;
	}
	return false;
}

void adicionar(Aluno *aluno, No no){
	if ( estaVazia(&aluno) ){
		aluno->prox = &no;
		strcpy(aluno->nome ,no.nome)
	}
}

void exibirLista (ListaE *lista){
	int i = 0;
	Aluno *temp = lista;
	while (temp->prox != null){
		printf("Aluno %d: %s\n", i, aluno->nome);
		temp = temp->prox;
		i++;
	}
}

int main (){
	minhaLista = criarEncadeada();
	
	
	return 0;
}
