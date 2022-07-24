package juego.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

//Permite crear las tiles del juego como la lava u otros grafics, tiene clases hijas que hacen lo mismo menos la roca que es una tile que no se puede atravesar
public class Tile {
	
	//static stuff
	
	public static Tile[] tiles = new Tile[256];
	public static Tile LavaTile = new LavaTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile rockTile = new RockTile(2);
	
	
	//Class
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}

}
