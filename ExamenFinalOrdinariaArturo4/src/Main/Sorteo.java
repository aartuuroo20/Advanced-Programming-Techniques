package Main;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Bolas.Bolas;
import Bombos.BomboNumeros;
import Bombos.BomboPremios;
import Estados.Estados;
import Interfaz.InterfazGrafica;

public class Sorteo extends Thread{

	private boolean ejecucion = false;
	public long timer=0;
	public int ticks=0;
	private Thread th1;

	BomboNumeros bomboNumeros = new BomboNumeros();
	BomboPremios bomboPremios = new BomboPremios();
	Bolas bolaNumeros;
	Bolas bolaPremios;

	ArrayList<String> resultados = new ArrayList<String>();
	
	FileWriter fichero = null;
    PrintWriter pw = null;

	public Sorteo() {

	}

	public synchronized void start() {//metodo para empezar el hilo
		if(ejecucion)
			return;
		ejecucion=true;
		th1 =new Thread(this);
		th1.start();
	}

	public void actualizar() {
		bolaNumeros = bomboNumeros.sacarBolas();
		bolaPremios = bomboPremios.sacarBolas();

		System.out.println("Ha salido la bola: " + bolaNumeros.getIdentificador() + " con el premios " + bolaPremios.getIdentificador());
		resultados.add(bolaNumeros.getIdentificador() + "-" + bolaPremios.getIdentificador());
		
		escribirFichero();
	}

	public void run() {
		
		InterfazGrafica it = new InterfazGrafica();
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
				actualizar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		it.mostrarResultados();
		it.setVisible(true);
	}

	public void escribirFichero() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try
		{
			fichero = new FileWriter("Resultados.txt");
			pw = new PrintWriter(fichero);
			for (int i = 0; i < resultados.size(); i++)
				pw.println(resultados.get(i));
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
