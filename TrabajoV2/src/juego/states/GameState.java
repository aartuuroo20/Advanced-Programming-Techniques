package juego.states;

import java.awt.Graphics;

import juego.Game;
import juego.Handler;
import juego.entities.statics.Tree;
import juego.personajes.Player;
import juego.tiles.Tile;
import juego.world.World;

//Carga del juego con game state
public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler){
		super(handler);
		
		world = new World(handler, "/worlds/world1.txt");
		handler.setWorld(world);
	}
	
	@Override
	public void tick() {
		world.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
	}

}

