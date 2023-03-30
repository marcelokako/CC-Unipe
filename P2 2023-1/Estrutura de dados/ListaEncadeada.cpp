// Lista encadeada
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct Dados {
	char nome[20];
} Aluno;

typedef struct t_no {
	Aluno Elemento;
	struct t_no * prox;
} No;

typedef No* ListaE;

No * criarNo(){
	No * no = (No*) malloc(sizeof(No));
	
	if (no)
		no->prox = NULL;
	
	return no;
}

int getTamanho (ListaE lista){
	int tamanho = 0;
	
	while (lista->prox != NULL){
		lista = lista->prox;
		tamanho++;
	}
	return tamanho;
}


bool estaVazia(ListaE lista){
	if (lista->prox == NULL){
		return true;
	}
	return false;
}

No * getNo(ListaE  lista, int pos){
	int n=0;
	
	if (pos<0)
		return 0; // posição inválida
	
	while (lista != NULL) {
		if (n == pos){
			return lista;
		}
		lista = lista -> prox;
		n++;
	}
	
	return 0; // chega aqui se posição for maior que o tamanho da lista
}



int primeiroTermo(ListaE *lista, Aluno aluno){
	No * novo;
	novo = criarNo();
	
	novo->elemento = aluno;
	novo->prox = *lista;
	*lista = novo;
	return 1;
		
}

void exibirLista (ListaE *lista){
	int i = 0;
	Aluno *temp = lista;
	while (temp->prox != NULL){
		printf("Aluno %d: %s\n", i, aluno->nome);
		temp = temp->prox;
		i++;
	}
}

int main (){
	
	minhaLista = criarNo();
	Aluno struct Marcelo {
		char nome[20] = "Marcelo";
	}
	primeiroTermo(minhaLista, Marcelo);
	
	exibirLista();
	
	
	return 0;
}
