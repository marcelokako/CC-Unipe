import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// ----------------------------------------------------------------------------
		System.out.println("--------------------------------ArrayList------------------------------");

		// Tipos Wrapper
		ArrayList<String> nomes = new ArrayList<String>();
		/*	add(arg1), add(arg1, arg2)
			remove(arg);
			set(arg1, arg2);
			get(arg);
			size();
		*/	
		//add(arg);
		nomes.add("Ana");
		nomes.add("Bruno");
		nomes.add("Carlos");
		//add(indice, arg);
		nomes.add(3, "Daniel");
		//remove(indice);
		nomes.remove(1);
		//set(indice, arg);
		nomes.set(2, "Carol");
		//get(indice);
		nomes.get(2);
		//size();
		nomes.size();
		
		System.out.println("For:\n");
		for (int i=0; i<nomes.size(); i++) {
			System.out.println(nomes.get(i) + " ");
		}
		
		System.out.println("\nForeach:\n");
		for (String elementos: nomes) {
			System.out.println(elementos + " ");
		}
		
		//-------------------------------------------------------------------
		System.out.println("--------------------------------GET / SET------------------------------");
		
		
		Retangulo r1 = new Retangulo();
		r1.setLargura(20);
		r1.setAltura(-10);
	
		System.out.println("\nL: " + r1.getLargura() + "\nA: " + r1.getAltura());
		System.out.println(r1); // depois de dar override no toString
		
		System.out.println("\nArea: " + r1.calcularArea() + "\nPerimetro: " + r1.calcularPerimetro());
		
		//-------------------------------------------------------------------
				System.out.println("--------------------------------Exercicio - Contato------------------------------");
				
		Contato c1 = new Contato();
		c1.setNome("Marcelo");
		c1.setTelefone("123456789");
		c1.exibirContato();
		System.out.println("\n\ntoString: " + c1);
	}

}
