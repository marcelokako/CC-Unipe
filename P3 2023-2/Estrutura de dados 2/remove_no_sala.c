typedef struct no {
    int chave;
    struct no * esq;
    struct no * dir;
} Tno;

Tno *busca(int valor, Tno *arvore){

    while(arvore && arvore->chave != valor){
        arvore = (arvore->chave > valor)?(arvore->esq):(arvore->dir);
    }
    return arvore;
}

Tno *busca_pai(Tno *filho, Tno*arvore){

    Tno * pai;
    while(arvore && arvore->chave != filho->chave){
        pai = arvore;
        arvore = (arvore->chave > filho->chave)?(arvore->esq):(arvore->dir);
    }
    return pai;
}

int remove(int valor, Tno *arvore){

    Tno * no_removido = busca(valor, arvore);
    Tno * pai = busca_pai(no_removido, arvore);
    
    Tno * novo_filho = pai->chave > no_removido->chave ? pai->esq : pai->dir;
    // no_removido é folha
    if (no_removido->dir == NULL && no_removido->esq == NULL){
        
        no_removido = NULL;

    // no_removido tem filho na direita
    } else if (no_removido->dir != NULL && no_removido->esq == NULL){

        novo_filho = no_removido->dir;
        no_removido = NULL;
    
    // no_removido tem filho na esquerda
    } else if (no_removido->dir == NULL && no_removido->esq != NULL){
        novo_filho = no_removido->esq;
        no_removido = NULL;

    // no_removido tem dois filhos
    } else {
        // substituindo pelo menor dos maiores
        Tno * aux = no_removido->dir;
        while(aux->esq != NULL){
            aux = aux->esq;
        }
        novo_filho = aux;
        no_removido = NULL;
    }
    return 0;
}
