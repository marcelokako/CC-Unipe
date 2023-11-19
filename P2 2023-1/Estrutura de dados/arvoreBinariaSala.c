#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct elemento{
	char nome[100];
} t_elemento;
	
typedef struct no {
	struct no * esquerda;
	t_elemento dado;
	struct no * direita;
} t_no;
	
typedef t_no* t_arvore;
	
void exibirPreOrdem(t_arvore arvore){
	if (arvore!=NULL){
		printf("%s\n", arvore->dado.nome);
		exibirPreOrdem(arvore->esquerda);
		exibirPreOrdem(arvore->direita);	
	}
}


void exibirInOrdem(t_arvore arvore){
	if (arvore!=NULL){
		exibirInOrdem(arvore->esquerda);
		printf("%s\n", arvore->dado.nome);	
		exibirInOrdem(arvore->direita);	
	}
}

void exibirPosOrdem(t_arvore arvore){
	if (arvore!=NULL){
		exibirPosOrdem(arvore->esquerda);
		exibirPosOrdem(arvore->direita);	
		printf("%s\n", arvore->dado.nome);
	}
}

t_no * criar() { // poderia ser t_arvore?
	t_no * no = (t_no*) malloc(sizeof(t_no));
	
	if (no){
		no->esquerda = no->direita = NULL;
	}
	
	return no;
}

int isVazia(t_arvore arvore){
	return (arvore==NULL);
}

t_no * busca(t_arvore arvore, t_elemento dado){
	t_no* achou;
	if (arvore==NULL)
		return NULL;
	
	if (strcmp(arvore->dado.nome,dado.nome) == 0){
		return arvore;
	}
	
	achou = busca(arvore->esquerda, dado);
	
	if (achou == NULL){
		busca(arvore->direita, dado);
	}
	
	return achou;
}


int insereRaiz(t_arvore* pontArvore, t_elemento dado){
	
	t_no* novo; //cria ponteiro para um no
	
	if (*pontArvore != NULL)
		return 0; // erro, ja existe raiz
		
	novo = criar(); // cria o no em si
	
	if (novo == NULL)
		return 0; // erro, memoria insuficiente
	
	novo->dado = dado; // insere o dado no no
	*pontArvore = novo; // substitui o ponteiro da arvore pelo criado para apontar para o no criado;
	return 1;
}

// Inserir um filho aa direita de um dado noh

int insereDireita(t_arvore arvore, t_elemento pai, t_elemento filho)
{
	t_no * f, *p, *novo;	
	
	// verifica se o elemento ja nao existe
	f = busca(arvore,filho);	
	if (f != NULL) {
		printf("Dado ja existe");
		return 0; // erro: dado ja existente
	}
	// busca o pai e verifica se ja nao possui filho direito	
	p = busca(arvore,pai);
	
	if (p == NULL){	
		printf("Memoria insuficiente");	
		return 0; // erro: pai nao encontrado	
	}
	if (p->direita != NULL){
		printf("Ja existe alguem na direita");
		return 0; // erro: ja existe filho direito
	} 
	
	novo = criar();	
	
	novo->dado = filho;
	p->direita = novo;
	return 1;
}

int insereEsquerda(t_arvore arvore, t_elemento pai, t_elemento filho){

	t_no * f, *p, *novo;	
	f = busca(arvore, filho);
	
	if (f != NULL) {
		printf("Dado ja existe");
		return 0; // erro: dado ja existente
	}
	// busca o pai e verifica se ja nao possui filho direito	
	p = busca(arvore, pai);
	
	if (p == NULL){	
		printf("Memoria insuficiente");	
		return 0; // erro: pai nao encontrado	
	}
	if (p->esquerda != NULL){
		printf("Ja existe alguem na esquerda");
		return 0; // erro: ja existe filho direito
	} 
	
	novo = criar();
	novo->dado = filho;
	p->esquerda = novo;
	return 1;
}

int main(){
	//cria arvore
	t_arvore minhaArvore = NULL; // cria o ponteiro para o no principal
	
	//cria dado e insere valor no dado
	t_elemento dado1;
	strcpy(dado1.nome, "Marcelo");
	
	t_elemento dado2;
	strcpy(dado2.nome, "Filho");
	
	t_elemento dado3;
	strcpy(dado3.nome, "Filha");
	//insere raiz na arvore
	insereRaiz(&minhaArvore, dado1);
	
	insereDireita(minhaArvore, dado1, dado2);
	insereEsquerda(minhaArvore, dado1, dado3);	
	
	exibirPreOrdem(minhaArvore);
	
	return 0;
}
