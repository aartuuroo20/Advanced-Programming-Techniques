package juego;

import java.awt.EventQueue;
import javax.swing.*;

import juego.clases.Explorer;
import juego.clases.Race;
import juego.display.DisplayMenu;

//Clase donde se ejecuta desde el principio el codigo, es decir el Main del programa

public class Launcher{
	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayMenu display = new DisplayMenu();
					display.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
