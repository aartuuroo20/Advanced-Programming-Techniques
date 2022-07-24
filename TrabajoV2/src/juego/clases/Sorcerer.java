package juego.clases;

//Clase sorcerer que el usuario puede elegir

public class Sorcerer extends Race{
	
	//Constrcutor
	public Sorcerer(String nombre_, double altura_, int ataque_, int defensa_, String x) {
		super(nombre_, altura_, ataque_, defensa_);
		ArmasSorcerer BastondelVacio;
		ArmasSorcerer BastondeFuego;
		this.x = x;
	}
	
	int ataque = 100;
	int defensa = 40;
	String x;
	
	//Salida de datos
	@Override
	public void Datos() {
		System.out.println("Name: " + nombre);
		System.out.println("Altura: " + altura);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defensa: " + defensa);
		System.out.println(x);
	}
	
	//Otras funciones
	@Override
	public void atacar() {
		System.out.println("Ataco");
	}

	@Override
	public void moverse() {
		System.out.println("Me muevo");
	}
	
}
