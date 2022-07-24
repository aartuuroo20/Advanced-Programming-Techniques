package Jugadores;

import java.util.ArrayList;

import Posicion.Posicion;

public class Equipos {
	public String colorEquipacion1;
	public String colorEquipacion2;
	public String Estadio;
	
	public Jugador portero;
	public Jugador defensa;
	public Jugador medio;
	public Jugador delantero;

	
	public Equipos(String color1, String color2, String estadio, Jugador portero,  Jugador defensa, Jugador medio, Jugador delantero) {
		this.colorEquipacion1 = color1;
		this.colorEquipacion2 = color2;
		this.Estadio = estadio;
		
		this.portero = portero;
		this.defensa = defensa;
		this.medio = medio;
		this.delantero = delantero;

	}
		
	public void mostrarEquipo() {
		System.out.println("La equipacion 1 es: " + colorEquipacion1);
		System.out.println("La equipacion 2 es: " + colorEquipacion2);
		System.out.println("El estadio es: " + Estadio);
		System.out.println("EL equipo es: ");
		mostrarJugadores();
	}
	
	public void mostrarJugadores() {
		portero.mostrarJugadores();
		defensa.mostrarJugadores();
		medio.mostrarJugadores();
		delantero.mostrarJugadores();


	}
	
	

}
