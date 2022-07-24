package Main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Interfaz.Interfaz;
import Jugadores.Equipos;
import Jugadores.Jugador;
import Posicion.Posicion;

 

public class Liga {
	public ArrayList<Equipos> liga1 = new ArrayList<Equipos>(6);
	public ArrayList<String> equipos = new ArrayList<String>();
	public Scanner reader = new Scanner(System.in);	
	public Posicion posicion;

	
	public Liga() {
		Interfaz intrfaz = new Interfaz();
		menu();
	}

	public void menu() {
		int opcion;
		boolean salir = false;

		while(!salir) {

			System.out.println("LIGA DE FUTBOL NEBRIJA");
			System.out.println("Introduzca una opcion para poder empezar: ");
			System.out.println("1. Mostrar quipos de la liga.");
			System.out.println("2. Crear un equipo max 6.");
			System.out.println("3. Salir.");
			System.out.println();

			opcion = reader.nextInt();
			
			switch(opcion) {
			case 1:
				mostrarequiposLiga();
				System.out.println();
				break;
			case 2: 
				if(liga1.size() == 6) {
					System.out.println("Error la liga solo puede tener un maximo de 6 equipos.");
					break;
				}
				añadirEquipo();
				System.out.println();
				break;
			case 3:
				salir = true;
				break;
			default:
                System.out.println("Solo números entre 1 y 3");
			}

		}

	}

	public void mostrarequiposLiga() {
		for(int i=0; i<liga1.size(); i++) {
			liga1.get(i).mostrarEquipo();
		}
	}
	
	public void añadirEquipo() {
		System.out.println();

		String x = JOptionPane.showInputDialog("Escrbe color de camiseta 1");
		String y = JOptionPane.showInputDialog("Escrbe color de camiseta 2");
		String z = JOptionPane.showInputDialog("Escrbe nombre de estadio");
		
		String p = JOptionPane.showInputDialog("Escrbe nombre del portero");
		Jugador portero = new Jugador(p, posicion.Porteo);
		String d = JOptionPane.showInputDialog("Escrbe nombre del defensa");
		Jugador defensa = new Jugador(d, posicion.Defensa);
		String m = JOptionPane.showInputDialog("Escrbe nombre del centrocampista");
		Jugador medio = new Jugador(m, posicion.Centrocampista);
		String de = JOptionPane.showInputDialog("Escrbe nombre del delantero");
		Jugador delantero = new Jugador(de, posicion.Delantero);
		
		Equipos equipo = new Equipos(x, y, z, portero, defensa, medio, delantero);
		liga1.add(equipo);
		
		System.out.println();
		
		equipos.add("Color de camiseta 1: " + x + ", " + "Color de camiseta 2:" + y + "Estadio " + z + ", " + "Nombre del portero: " + p 
				+ ", " + "Nombre de defensa: "+ d + ", " + "Nombre del medio: " + m + ", " + "Nombre del delantero: " + de);
		escribirFichero();
	}
	
	public void escribirFichero() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try
		{
			fichero = new FileWriter("Liga.txt");
			pw = new PrintWriter(fichero);
			for (int i = 0; i < equipos.size(); i++)
				pw.println(equipos.get(i));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
	
	


