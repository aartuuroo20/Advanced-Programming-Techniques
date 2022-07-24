package juego.clases;

//Clase explorador que el usuario puede elegir

public class Explorer extends Race{
	
	//Constructor
	public Explorer(String nombre_, double altura_, int ataque_, int defensa_, String x) {
		super(nombre_, altura_, ataque_, defensa_);
		ArmasExplorer Subfusil;
		ArmasExplorer DagaSilenciosa;
		this.x = x;
	}
	
	int ataque = 50;
	int defensa = 50;
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
		// TODO Auto-generated method stub
		System.out.println("Ataco");
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("Me muevo");
	}
}
