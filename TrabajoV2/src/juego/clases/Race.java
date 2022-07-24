package juego.clases;

/**
 * La clase raze representa la clase abstracta y padre de las posibles clases y razas que el usuario puede elegir, los atributos de esta clase
 * race seran comunes para todos sus hijos.
 * @author arturo requejo portilla
 */

public abstract class Race implements Accion{
	protected String nombre = " ";
	protected double altura = 0;
	protected int ataque = 0;
	protected int defensa = 0;
	
	/**
	 * La raza se creara con los siguientes atributos, luego al especificar la raza se crearan nuevos atributos mas especificos
	 * @param nombre_
	 * @param altura_
	 * @param ataque_
	 * @param defensa_
	 */
	
	public Race(String nombre_, double altura_, int ataque_, int defensa_) {
		this.nombre = nombre_;
		this.altura = altura_;
		this.ataque = ataque_;
		this.defensa = defensa_;
	}
	
	/**
	 * Devuelve los datos de cada raza 
	 */
	
	public abstract void Datos();
	
	//Getters y setters de los atributos
	
	public void setNombre(String name) {
		nombre = name;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setAltura(int altura_) {
		altura = altura_;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAtaque(int ataque_) {
		ataque = ataque_;
	}
	
	public int getAtaque() {
		return ataque;
	}
	
	public void setDefensa(int defensa_) {
		defensa = defensa_;
	}
	
	public int getDefensa() {
		return defensa;
	}
	

}