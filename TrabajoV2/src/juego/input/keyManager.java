package juego.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import juego.personajes.Player;

public class keyManager implements KeyListener{
	
	private boolean[] keys;
	public boolean up, down, left, right;
	
	public keyManager(){
		keys = new boolean[256];
	}
	
	//Moviemiento del personjes
	
	public void tick(){
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
	}
	
	//Implemented methods que nos permiten utilizar las distintas funciones del teclado y que se reconoza

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
