package Bombos;

import java.util.ArrayList;

import Bolas.Bolas;

public class BomboPremios implements Bombos{
	
	ArrayList<Bolas> premios = new ArrayList<Bolas>();
	
	public BomboPremios() {
		premios.add(new Bolas(4000000));
		premios.add(new Bolas(1250000));
		premios.add(new Bolas(500000));
		
		for(int i=0; i<2; i++) {
			premios.add(new Bolas(200000));
		}
		
		for(int i=0; i<5; i++) {
			premios.add(new Bolas(60000));
		}
		
		for(int i=0; i<1794; i++) {
			premios.add(new Bolas(1000));
		}
	}

	@Override
	public Bolas sacarBolas() {
		int random = (int)(Math.random() * 1805 + 0);
		Bolas bola = premios.get(random);
		premios.remove(random);
		return bola;
	}

	@Override
	public void mostarBombos() {
		for(Bolas b: premios) {
			System.out.println(b.getIdentificador());
		}
	}

}
