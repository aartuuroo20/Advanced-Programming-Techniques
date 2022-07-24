package juego.graficos;

import java.awt.image.BufferedImage;

//Creacion de una imagen que contiene a su vez mas imaganes, se hace esto pq es la forma mas facil de cargar
public class SpriteSheet {

	private BufferedImage sheet;
	
	//Constructor
	public SpriteSheet(BufferedImage sheet){
		this.sheet = sheet;
	}
	
	//Funcin que nos permit cortar las sub imagenes de la spritesheet
	public BufferedImage crop(int x, int y, int width, int height){
		return sheet.getSubimage(x, y, width, height);
	}
	
}
