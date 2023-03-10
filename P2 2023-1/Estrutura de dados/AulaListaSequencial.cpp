#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 10

// CRIANDO TIPO DO NOSSO VETOR;E UMA LISTA DE NOME E TELEFONE, SEU NOME SERA CONTATO
typedef struct informacoes {
	char nome[50];
	char telefone[20];
} Contato;

// CRIANDO A LISTA, A LISTA NESSE CASO E UM TIPO NAO PRIMITIVO, CONTEM UM VETOR COM OS CONTATOS E UMA VARIAVEL N
typedef struct lista {
	Contato vetor[MAX]; // VETOR COM CONTATO (nome e telefone)
	int n;	// variavel que diz o indice do ultimo valor preenchido da lista
} Lista;

// CRIACAO DA FUNCAO DE CRIACAO DE LISTA; ATRIBUO N COMO -1 PARA INICIAR COMO VAZIA (INDICE=-1)
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
	if (pos < MAX){
		strcpy(lista->vetor[pos].nome, contato.nome);
		strcpy(lista->vetor[pos].telefone, contato.telefone);	
		
		lista->n++;
	} else {
		printf("Nao foi possivel adicionar este contato");
	}
}

void mostrar(Lista * lista){
	printf("\n\t[ID]\tNome\t\tTelefone\n");
	for (int i=0; i < tamanho(lista); i++){
		printf("\t[%d]\t%s\t\t%s\n", i, &lista->vetor[i].nome, &lista->vetor[i].telefone);	
	}
		printf("---------------------------\n");

}

void buscarIndice(Lista * lista, int j){
	if (j<tamanho(lista)&&j>=0){
		printf("\t[ID]\tNome\t\tTelefone\n");
		printf("\t[%d]\t%s\t\t%s\n", j, &lista->vetor[j].nome, &lista->vetor[j].telefone);
		printf("---------------------------\n");
	} else {
		printf("\tIndice invalido\n");
	}
}

int buscarNome(Lista * lista, char nome[50]){
	for (int i=0; i<tamanho(lista); i++){
		if (strcmp(nome, lista->vetor[i].nome)==0){
			return i;
		}
	}
	return -1;
}

int buscarTelefone(Lista * lista, char telefone[20]){
	for (int i=0; i<tamanho(lista); i++){
		if (strcmp(telefone, lista->vetor[i].telefone)==0){
			return i;
		}
	}
	return -1;
}

void deslocaEsquerda(Lista * lista, int pos){
	// usada para excluir um contato
	for (int i=pos; i<(lista->n); i++){
		lista->vetor[i] = lista->vetor[i+1];
	}
}

void deslocaDireita(Lista * lista, int pos){
	// usada para inserir um contato
	for (int i=(lista->n); i>(pos); i--){
		lista->vetor[i] = lista->vetor[i-1];
	}
}

void excluir(Lista * lista, int pos){
	if (pos < tamanho(lista) && pos > 0){
		deslocaEsquerda(lista, pos);
		lista->n--;
	} else {
		printf("\tIndice invalido!");
	}
}

void inserir(Lista * lista, int pos, Contato contato){
	if (pos < tamanho(lista) && pos > 0 && estaCheia(lista)==0){
		deslocaDireita(lista, pos);
		
		strcpy(lista->vetor[pos].nome, contato.nome);
		strcpy(lista->vetor[pos].telefone, contato.telefone);	
		
		lista->n++;

	} else {
		printf("\tIndice invalido!");
	}
}

int main(){
	
	int numContatos;
	char nomeUser[50], telefoneUser[20];
	Contato contatoUser;

	Lista minhaLista = criar();
	
	//	Este loop ira adicionar a quantidade de contatos que o usuario quiser
	printf("Quantos contatos quer adicionar? ");
	scanf("%d", &numContatos);
	for (int i=0; i<numContatos; i++){
		printf("Digite o nome do contato: ");
		scanf("%s", nomeUser);
		
		printf("Digite o telefone do contato: ");
		scanf("%s", telefoneUser);
		
		strcpy(contatoUser.nome, nomeUser);
		strcpy(contatoUser.telefone, telefoneUser);
		adcContato(&minhaLista, contatoUser);
	}

	printf("\tEsta vazia? %d\n\tEsta cheia? %d\n", estaVazia(&minhaLista), estaCheia(&minhaLista));
	
	// informa o tamanho da lista
	printf("Tamanho: %d\n", tamanho(&minhaLista));
	
	// printa toda a lista	
	mostrar(&minhaLista);

	// busca na lista as informações do contato com este indice
	buscarIndice(&minhaLista, 1);
	
	// retorna o indice procurando pela string especifica informada
	int indice1 = buscarNome(&minhaLista, "marcelo");
	int indice2 = buscarTelefone(&minhaLista, "123456");
	printf("Indice 1: %d\tIndice 2: %d\n", indice1, indice2);
	
	// EXCLUINDO CONTATO DA POSICAO 1;
	excluir(&minhaLista, 1);
	mostrar(&minhaLista);

	//	INSERINDO CONTATO NA POSICAO 1
	Contato george;
	strcpy(george.nome, "George");
	strcpy(george.telefone, "83123456789");
	
	inserir(&minhaLista,1, george);	
	mostrar(&minhaLista);


	return 0;
}
