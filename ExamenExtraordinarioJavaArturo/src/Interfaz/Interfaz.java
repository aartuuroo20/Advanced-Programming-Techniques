package Interfaz;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Interfaz extends JFrame{

	protected JPanel mainPanel;

	public Interfaz() {
		super("LIga de equipos Nebrija");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1000, 820);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);


		JLabel equipo1 = new JLabel("equipos1");
		equipo1.setBounds(50, 50, 100, 100);
		mainPanel.add(equipo1);

		JLabel equipo2 = new JLabel("equipos2");
		equipo2.setBounds(50, 100, 200, 100);
		mainPanel.add(equipo2);

		JLabel equipo3 = new JLabel("equipos3");
		equipo3.setBounds(50, 150, 300, 100);
		mainPanel.add(equipo3);

		JLabel equipo4 = new JLabel("equipos4");
		equipo4.setBounds(50, 200, 400, 100);
		mainPanel.add(equipo4);

		JLabel equipo5 = new JLabel("equipos5");
		equipo5.setBounds(50, 250, 500, 100);
		mainPanel.add(equipo5);

		JLabel equipo6 = new JLabel("equipos6");
		equipo6.setBounds(50, 300, 600, 100);
		mainPanel.add(equipo6);

		setVisible(true);

	}

}
