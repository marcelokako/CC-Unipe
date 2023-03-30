// Lista encadeada
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Dados {
	char nome[20];
} Aluno;

typedef struct No {
	Aluno Elemento;
	struct No * prox;
} ListaE;

ListaE * criarNo(){
	ListaE * no = (ListaE*) malloc(sizeof(ListaE));
	
	if (no)
		no->prox=NULL
	return no;
}

int getTamanho (Aluno *aluno){
	int tamanho = 0;
	temp = &aluno;
	while (temp->prox != NULL){
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

No getNo(ListaE lista, int pos){
	int n = 0;
	
	if (pos<0) 
		return 0;
		
	while (lista != NULL){
		if (n==pos)
			return lista;
		lista = lista->prox;
		n++
	}
	
	return 0; // só para aqui se nao encontrar nada na posicao dada
	
}

void adicionar(ListaE *lista, Aluno aluno){
	if ( estaVazia(&aluno) ){
		aluno->prox = NULL;
		strcpy(aluno->nome ,no.nome)
	} 
	while (aluno->prox != null){
		aluno = aluno->prox;
	}
	criarNo();
	
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
	minhaLista = criarNo();
	
	
	return 0;
}
