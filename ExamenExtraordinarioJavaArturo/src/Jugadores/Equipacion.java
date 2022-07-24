package Jugadores;

public abstract class Equipacion {
	public static String pantalon;
	public static String camiseta;
	public static String zapatilla;
	
	
	public Equipacion(String pantalon, String camiseta, String zapatilla) {
		this.pantalon = pantalon;
		this.camiseta = camiseta;
		this.zapatilla = zapatilla;
	}
	
	public abstract void mostrarJugadores();
	
}
