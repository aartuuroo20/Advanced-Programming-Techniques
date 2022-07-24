package juego.tiles;

import java.awt.image.BufferedImage;

import juego.graficos.Assets;

public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.stone, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
