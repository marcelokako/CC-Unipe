// Funcoes da lista
public class Lista {
	Contato[] vetor = new Contato[100];
	int tamanho = 0;
	
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	public boolean estaCheia() {
		return (tamanho == vetor.length);
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean adcContato(Contato contato) {
		if (estaCheia()) {
			return false;
		} else {
			vetor[tamanho] = contato;
			tamanho++;
			return true;
		}
	}

	public Contato buscarContato(int pos) {
		if (pos >= 0 && pos < tamanho) {
			return vetor[pos];
		} else {
			return null;
		}	
	}
	
	public boolean comparaContato(Contato c1, Contato c2) {
		return (c1.nome.equals(c2.nome) && c1.telefone.equals(c2.telefone));
	}
	
	public int buscarPosicao(Contato contato) {
		for (int i=0;i<tamanho;i++) {
			if ( comparaContato(contato, vetor[i]) ) {
				return i;
			}
		}
		return -1;
	}
	
	public void deslocarDireita(int pos) {
		for (int i=tamanho; i > pos; i--) {
			vetor[i] = vetor[i-1];
		}
	}
	
	public boolean inserir(Contato contato, int pos) {
		if (estaCheia() || pos<0 || pos > vetor.length){
			return false;
		}
		deslocarDireita(pos);
		vetor[pos] = contato;
		tamanho++;
		return true;
	}
	
	public void deslocarEsquerda(int pos) {
		for (int i=pos; i < (tamanho - 1); i++) {
			vetor[i] = vetor[i+1];
		}
	}
	
	public boolean excluir(int pos) {
		if (estaVazia() || pos<0 || pos > vetor.length){
			return false;
		}
		deslocarEsquerda(pos);
		tamanho--;
		return true;
	}
	
	public void mostrar() {
		for (int i=0; i < tamanho; i++) {
			System.out.println("\nContato Indice " + (i) +
					"\nNome: " + (vetor[i].nome) + 
					"\tTelefone: " + (vetor[i].telefone));
		}
	}
	
}
