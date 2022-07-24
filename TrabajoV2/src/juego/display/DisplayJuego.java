package juego.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import juego.personajes.Player;

//Creacion del display juego, la segunda parte del programa donde nos permite jugar

public class DisplayJuego {
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	//Constructor
	public DisplayJuego(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	//Creacion del display con sus correspondientes caracteristicas
	private void createDisplay(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
	}
	
	//Getters

	public Canvas getCanvas(){
		return canvas;
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
}
