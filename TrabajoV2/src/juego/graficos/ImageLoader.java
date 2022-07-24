package juego.graficos;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//Funcion que nos permite cargar imagenes al juego
public class ImageLoader {

	public BufferedImage loadImage(String path){
		try {
			//return ImageIO.read(new File(path));
			return ImageIO.read(getClass().getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	
}
