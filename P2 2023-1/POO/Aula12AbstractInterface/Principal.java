package View;
import java.util.ArrayList;

import Animais.*;
import Automovel.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Cachorro();
		a1.emitirSom();
		Animal a2 = new Gato();
		a2.emitirSom();
		
		System.out.println("-----------------------------");
		
		Automovel c1 = new Jetta();
		Automovel c2 = new FordKa();
		Automovel c3 = new Elba();
		
		ArrayList<Automovel> carros = new ArrayList<Automovel>();
		carros.add(c1);
		carros.add(c2);
		carros.add(c3);
		
		for (Automovel a: carros) {
			a.ligar();
		}
		((Elba) c3).acenderFarol();
	}

}
