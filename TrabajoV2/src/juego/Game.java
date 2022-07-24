package juego;

import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferStrategy;


import juego.display.DisplayJuego;
import juego.entities.Entity;
import juego.graficos.Assets;
import juego.graficos.GameCamara;
import juego.input.MouseManager;
import juego.input.keyManager;
import juego.personajes.Player;
import juego.states.GameState;
import juego.states.MenuState;
import juego.states.State;
import juego.world.World;


public class Game implements Runnable {

	private DisplayJuego display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	public State gameState;
	public State menuState;
	
	//Input
	private keyManager keyManager;
	private MouseManager mouseManager;
	
	//Camera
	private GameCamara gameCamera;
	
	//Handler
	private Handler handler;
	
	//Assets
	private Assets assets;
	
	//Constructor
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new keyManager();
		mouseManager = new MouseManager();
	}
	
	/*
	Inicaliza el juego generando el displayJuego con los inputs del teclado y rato, 
	inicializa los graficos y los estados
	 */
	
	private void init(){
		display = new DisplayJuego(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		assets = new Assets();
		assets.init();
		
		handler = new Handler(this);
		gameCamera = new GameCamara(handler, 0, 0);
		
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		State.setState(gameState);
	}
	
	//La funcion tick representa los ciclos del juego, el tiempo en actualizarse el juego para asi poder moverse entre otras cosas
	
	private void tick(){
		keyManager.tick();
		
		State.getState().tick();
	}
	
	//Crear la representacion grafica correspondiente generando las imagenes
	
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here!

		State.getState().render(g);

		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	//Hace que funcione el juego juntando las funciones anteriores tambien muestra los FPS y ticks a tiempo real

	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
		
	}
	
	//Getters y setters de distintas clases para poder acceder a ellas
	
	public keyManager getKeyManager(){
		return keyManager;
	}
	
	public MouseManager getMouseManager(){
		return mouseManager;
	}
	
	public GameCamara getGameCamera(){
		return gameCamera;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
