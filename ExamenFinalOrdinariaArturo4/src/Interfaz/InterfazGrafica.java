package Interfaz;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bombos.BomboPremios;

public class InterfazGrafica extends JFrame{
	
	private BomboPremios bp = new BomboPremios();
	private JPanel panelFondo;
	private JLabel tituloPanel;	
	private JLabel n60000;
	int nPremio;
	int nNumero;
	private ArrayList<Integer> numeros = new ArrayList<Integer>(99999);
	private ArrayList<Integer> premios = new ArrayList<Integer>(1805);
	private ArrayList<String> todo = new ArrayList<String>(99999);
	private int pos = 10, pos2 = 15, pos3 = 20, pos4 = 25, pos5 = 30, pos6 = 30;
	
	JPanel mainPanel = new JPanel();
	
	public InterfazGrafica() {
		super("Loteria de Navidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1000, 820);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
	}
	
	public void mostrarResultados() {
		JLabel tituloPanel = new JLabel("LOTERIA");
		tituloPanel.setBounds(10, 10, 150, 40);
		mainPanel.add(tituloPanel);		

		JLabel premio = new JLabel("1000�: ");	
		premio.setBounds(10, 50, 150, 40);	
		mainPanel.add(premio);	
		
		for (int i = 0; i < premios.size(); i++) {
			if (premios.get(i) == 1000) {
				pos = pos + 50;
				JLabel numero1000 = new JLabel(numeros.get(i) + ", ");
				numero1000.setBounds(pos, 50, 150, 40);
				mainPanel.add(numero1000);
				pos = pos - 10;
			}
		}
		
		JLabel premio2 = new JLabel("60000�: ");
		premio2.setBounds(10, 70, 150, 40);
		mainPanel.add(premio2);	
		
		for (int i = 0; i < premios.size(); i++) {
			if (premios.get(i) == 60000) {
				pos2 = pos2 + 50;
				JLabel numero60000 = new JLabel(numeros.get(i) + ", ");
				numero60000.setBounds(pos2, 70, 150, 40);
				mainPanel.add(numero60000);
				pos2 = pos2 - 10;
			}
		}

		JLabel premio3 = new JLabel("200000�: ");
		premio3.setBounds(10, 90, 150, 40);
		mainPanel.add(premio3);	
		
		for (int i = 0; i < premios.size(); i++) {
			if (premios.get(i) == 200000) {
				pos3 = pos3 + 50;
				JLabel numero200000 = new JLabel(numeros.get(i) + ", ");
				numero200000.setBounds(pos3, 90, 150, 40);
				mainPanel.add(numero200000);
				pos3 = pos3 - 10;
			}
		}

		JLabel premio4 = new JLabel("500000�: ");
		premio4.setBounds(10, 110, 150, 40);
		mainPanel.add(premio4);	
		
		for (int i = 0; i < premios.size(); i++) {
			if (premios.get(i) == 500000) {
				pos4 = pos4 + 50;
				JLabel numero500000 = new JLabel(numeros.get(i) + ", ");
				numero500000.setBounds(pos4, 110, 150, 40);
				mainPanel.add(numero500000);
				pos4 = pos4 - 10;
			}
		}
		
		JLabel premio5 = new JLabel("1250000�: ");
		premio5.setBounds(10, 130, 150, 40);
		mainPanel.add(premio5);	
		
		for (int i = 0; i < premios.size(); i++) {
			if (premios.get(i) == 1250000) {
				pos5 = pos5 + 50;
				JLabel numero1250000 = new JLabel(numeros.get(i) + ", ");
				numero1250000.setBounds(pos5, 130, 150, 40);
				mainPanel.add(numero1250000);
				pos5 = pos5 - 10;
			}
		}
		
		JLabel premio6 = new JLabel("4000000�: ");
		premio6.setBounds(10, 150, 150, 40);
		mainPanel.add(premio6);
		
		for (int i = 0; i < premios.size(); i++) {
			if (premios.get(i) == 4000000) {
				pos6 = pos6 + 50;
				JLabel numero4000000 = new JLabel(numeros.get(i) + ", ");
				numero4000000.setBounds(pos6, 150, 150, 40);
				mainPanel.add(numero4000000);
				pos6 = pos6 - 10;
			}
		}
	}

}
