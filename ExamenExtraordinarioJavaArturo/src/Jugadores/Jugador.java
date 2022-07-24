package Jugadores;

import java.util.ArrayList;

import Posicion.Posicion;


public class Jugador extends Equipacion{
	public String nombre;
	public int dorsal;
	public Posicion posicion;
	public ArrayList<Equipacion> equipacion = new ArrayList<Equipacion>();
	
	public Jugador(String nombre, Posicion posicion) {
		super(pantalon, camiseta, zapatilla);
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
	}
	
	@Override
	public void mostrarJugadores() {
		if(this.posicion == posicion.Delantero) {
			System.out.println("Se ha creado el jugador con el nombre: " + nombre + " con el dorsal: " + 4 + " y la posicion: " + posicion);
		}else if(this.posicion == posicion.Centrocampista) {
			System.out.println("Se ha creado el jugador con el nombre: " + nombre + " con el dorsal: " + 3 + " y la posicion: " + posicion);
		}else if(this.posicion == posicion.Defensa) {
			System.out.println("Se ha creado el jugador con el nombre: " + nombre + " con el dorsal: " + 2 + " y la posicion: " + posicion);
		}else {
			System.out.println("Se ha creado el jugador con el nombre: " + nombre + " con el dorsal: " + 1 + " y la posicion: " + posicion);
		}
	}
	
	
	
	
	//Getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public ArrayList<Equipacion> getEquipacion() {
		return equipacion;
	}

	public void setEquipacion(ArrayList<Equipacion> equipacion) {
		this.equipacion = equipacion;
	}

	

	
	
}
