package juego.clases;

//Clase asalto que el usuario puede elegir

public class Assault extends Race{
	
	//Constructor
	public Assault(String nombre_, double altura_, int ataque_, int defensa_, String x) {
		super(nombre_, altura_, ataque_, defensa_);
		ArmasAssault RifleAsalto;
		ArmasAssault EspadaSierra;
		this.x = x;
	}
	
	int ataque = 80;
	int defensa = 60;
	String x;
	String arma;
	
	//Salida de datos
	@Override
	public void Datos() {
		System.out.println("Name: " + nombre );
		System.out.println("Altura: " + altura);
		System.out.println("Ataque: " + ataque);
		System.out.println("Defensa: " + defensa);
		System.out.println(x);
	}
	
	//Otras funciones

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		System.out.println("Ataco");
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("Me muevo");
	}
}
