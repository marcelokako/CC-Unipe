#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char placa[10];
} Carro;

typedef struct {
    Carro elemento[8];
    int topo;
} PilhaCarros;

void inicializarPilha(PilhaCarros *pilha) {
    pilha->topo = -1;
}

int estaVazia(PilhaCarros *pilha) {
    return (pilha->topo == -1);
}

int estaCheia(PilhaCarros *pilha) {
    return (pilha->topo == 7);
}

void push(PilhaCarros *pilha, Carro carro) {
    if (estaCheia(pilha)) {
        printf("\nRua esta lotada.\n");
        return;
    }
    pilha->topo++;
	strcpy(pilha->elemento[pilha->topo].placa, carro.placa);
}

Carro pop(PilhaCarros *pilha) {
    Carro carro;
    if (estaVazia(pilha)) {
        printf("\nRua esta vazia.\n");
        strcpy(carro.placa, "");
        return carro;
    }
    carro = pilha->elemento[pilha->topo];
    pilha->topo--;
    return carro;
}

void mostrar(PilhaCarros *pilha){
	int i;
	for (i = 0; i <= pilha->topo; i++){
		printf("\nPlaca do carro %d: %s\n", i+1, pilha->elemento[i].placa);
	}
}

int main() {
	// escolha da estrutura é pilha sequencial,
	// pois só pode sair da rua sem saída, o ultimo carro que entrou
    PilhaCarros minhaPilha;
    inicializarPilha(&minhaPilha);
	char placaTemp[10];
	int i;
	Carro carroTemp;
	// A) cinco carros entram no beco
	for (i = 0; i < 5; i++){
		printf("Digite a placa do carro que entrou: ");
		scanf("%s", placaTemp);
    	strcpy(carroTemp.placa, placaTemp);
    	push(&minhaPilha, carroTemp);
	}
	mostrar(&minhaPilha);	
	// B) mostrar placa do quinto carro
	printf("\n LetraB: Placa do carro 5: %s\n", minhaPilha.elemento[4].placa);	
	// C) 3 carros saem do beco e mostra a sua placa
	printf("\n LetraC: Placa do carro que saiu: %s\n", pop(&minhaPilha));
	printf("\n LetraC: Placa do carro que saiu: %s\n", pop(&minhaPilha));   
	printf("\n LetraC: Placa do carro que saiu: %s\n", pop(&minhaPilha));   

	mostrar(&minhaPilha);	
	// D) após A e C, mostrar quantos carros ainda tem
	printf("\n LetraD: No beco, ainda existem %d carros", minhaPilha.topo + 1);
    return 0;
}

