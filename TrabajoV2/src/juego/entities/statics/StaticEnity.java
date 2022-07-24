package juego.entities.statics;

import juego.Handler;

import juego.entities.Entity;

//Clase que nos permite crear entidades estaticas como un arbol o una roca

public abstract class StaticEnity extends Entity{

	public StaticEnity(Handler handler, float x, float y, int width, int height){
		super(handler, x, y, width, height);
	}
	

}
