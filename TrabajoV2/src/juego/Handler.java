package juego;

import juego.graficos.GameCamara;
import juego.input.keyManager;
import juego.world.World;
import juego.input.keyManager;
import juego.input.MouseManager;

//Patron de diseño correspondiente a chain of responsability o cadena de responsabilidad, conectando distintas clases

public class Handler {
	private Game game;
	private World world;
	
	public Handler(Game game){
		this.game = game;
	}
	
	public GameCamara getGameCamera(){
		return game.getGameCamera();
	}
	
	public keyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager(){
		return game.getMouseManager();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
}

