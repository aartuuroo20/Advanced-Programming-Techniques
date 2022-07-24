package Bombos;

import java.util.ArrayList;

import Bolas.Bolas;

public class BomboNumeros implements Bombos{
	
	ArrayList<Bolas> numeros = new ArrayList<Bolas>();
	
	public BomboNumeros() {
		for(int i=0; i<99999; i++) {
			numeros.add(new Bolas(i));
		}
	}

	@Override
	public Bolas sacarBolas() {
		int random = (int)(Math.random() * 99999 + 0);
		Bolas bola = numeros.get(random);
		numeros.remove(random);
		return bola;
	}

	@Override
	public void mostarBombos() {
		for(Bolas b: numeros) {
			System.out.println(b.getIdentificador());
		}
	}

}
