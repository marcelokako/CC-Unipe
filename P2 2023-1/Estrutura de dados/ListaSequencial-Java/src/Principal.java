
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista minhaLista = new Lista();
		
		System.out.println("Tamanho: " + minhaLista.tamanho);
		System.out.println("Esta vazia?: " + minhaLista.estaVazia());
		System.out.println("Esta cheia?: " + minhaLista.estaCheia());
		
		Contato Marcelo = new Contato();
		Marcelo.nome = "Marcelo";
		Marcelo.telefone = "8311112222";
		Contato Roberto = new Contato();
		Roberto.nome = "Roberto";
		Roberto.telefone = "8333334444";
		Contato Bruna = new Contato();
		Bruna.nome = "Bruna";
		Bruna.telefone = "8355556666";
		minhaLista.adcContato(Marcelo);
		minhaLista.adcContato(Roberto);
		minhaLista.adcContato(Bruna);
		
		System.out.println("----------Depois de adicionar 3 contatos----------");
		
		System.out.println("Tamanho: " + minhaLista.tamanho);
		System.out.println("Esta vazia?: " + minhaLista.estaVazia());
		System.out.println("Esta cheia?: " + minhaLista.estaCheia());
		minhaLista.mostrar();
		
		Contato George = new Contato();
		George.nome = "George";
		George.telefone = "8377778888";
		

		minhaLista.inserir(George, 1);
		
		System.out.println("----------Depois de inserir George----------");
		minhaLista.mostrar();
		System.out.println("Tamanho: " + minhaLista.tamanho);

		minhaLista.excluir(0);

		System.out.println("----------Depois de excluir posicao 0----------");
		minhaLista.mostrar();
		System.out.println("Tamanho: " + minhaLista.tamanho);
		
		System.out.println("Buscando contato na posicao 0: " + 
							minhaLista.buscarContato(0).nome + "\t" +
							minhaLista.buscarContato(0).telefone);
		System.out.println("Buscando Indice do contato George: " + 
				minhaLista.buscarPosicao(George));

		
	
	}

}
