package juego.states;

import java.awt.Graphics;

import juego.Game;
import juego.Handler;

//Patron de diseño que corresponde al cambio entre estados
public abstract class State {

	private static State currentState = null;
	
	//Getter y setter
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	//CLASS
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
