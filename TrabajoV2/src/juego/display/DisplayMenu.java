package juego.display;


import juego.Game;
import juego.clases.*;
import juego.graficos.ImageLoader;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//Display donde se genera la primera parte del programa, la interfaz que nos permite elegir la raza con las clases, el nombre etc etc generando asi tambien objetos
public class DisplayMenu extends JFrame {

	protected JPanel contentPane;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel fondo;
	JRadioButton rbrace1 = new JRadioButton("Chaos Demons: ");
	JRadioButton rbrace2 = new JRadioButton("Ork: ");
	JRadioButton rbrace3 = new JRadioButton("Space Marines: ");
	ButtonGroup razas = new ButtonGroup();
	JRadioButton rbclass1 = new JRadioButton("Explorer: ");
	JRadioButton rbclass2 = new JRadioButton("Sorcerer: ");
	JRadioButton rbclass3 = new JRadioButton("Assault: ");
	public ButtonGroup clases = new ButtonGroup();

	ArmasAssault[] Armas_Asalto = ArmasAssault.values();
	ArmasSorcerer[] Armas_Mago = ArmasSorcerer.values();
	ArmasExplorer[] Armas_Explorador = ArmasExplorer.values();

	String arma;
	
	//Constructor
	public DisplayMenu() {
		super("Warhammer 40k");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400,1080);
		//setResizable(false);+
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel1 = new JPanel();
		//panel1.setBackground(Color.CYAN);
		panel1.setBounds(0,0,1000,350);
		contentPane.add(panel1);
		panel1.setLayout(null);

		panel2 = new JPanel();
		//panel2.setBackground(Color.GREEN);
		panel2.setBounds(1,350,1000,350);
		contentPane.add(panel2);
		panel2.setLayout(null);

		panel3 = new JPanel();
		//panel3.setBackground(Color.RED);
		panel3.setBounds(0, 650, 1000, 350);
		contentPane.add(panel3);
		panel3.setLayout(null);


		setVisible(true);
	}
	
	//Funcion que junta la creacion de los 3 paneles el frame 
	public void start() {
		this.crear_panel1();
		this.crear_panel2();
		this.crear_panel3();
	}

	public void crear_panel1() {
		JLabel selectRace = new JLabel("Select Race:");
		selectRace.setBounds(10, 10, 100, 40);
		panel1.add(selectRace);

		//Boton del la primera raza
		rbrace1.setBounds(50, 70, 140, 40);
		panel1.add(rbrace1);

		//Boton del la segunda raza
		rbrace2.setBounds(420, 70, 140, 40);
		panel1.add(rbrace2);

		//Boton del la tercera raza
		rbrace3.setBounds(750, 70, 140, 40);
		panel1.add(rbrace3);

		razas.add(rbrace1);
		razas.add(rbrace2);
		razas.add(rbrace3);

		//Fotos de las respectivas razas
		
		ImageIcon img = new ImageIcon(DisplayMenu.class.getResource("/Images/Caos1.jpg"));
		JLabel imagen_raze1 = new JLabel (img);
		imagen_raze1.setBounds(50, 120, 200, 200);
		panel1.add(imagen_raze1);
		
		ImageIcon img2 = new ImageIcon(DisplayMenu.class.getResource("/Images/orkos.jpg"));	
		JLabel imagen_raze2 = new JLabel (img2);
		imagen_raze2.setBounds(420, 120, 200, 200);
		panel1.add(imagen_raze2);
		
		ImageIcon img3 = new ImageIcon(DisplayMenu.class.getResource("/Images/Space_Marines.jpg"));
		JLabel imagen_raze3 = new JLabel (img3);
		imagen_raze3.setBounds(750, 120, 200, 200);
		panel1.add(imagen_raze3);

	}

	public void crear_panel2() {
		JLabel selectClass = new JLabel("Select Class: ");
		selectClass.setBounds(10, 10, 100, 40);
		panel2.add(selectClass);

		//Boton primera clase
		rbclass1.setBounds(50, 70, 140, 40);
		panel2.add(rbclass1);

		//Boton segunda clase
		rbclass2.setBounds(420, 70, 140, 40);
		panel2.add(rbclass2);

		//Boton tercera clase
		rbclass3.setBounds(750, 70, 140, 40);
		panel2.add(rbclass3);

		clases.add(rbclass1);
		clases.add(rbclass2);
		clases.add(rbclass3);

		//Imagenes para las respectivas clases
		ImageIcon img = new ImageIcon(DisplayMenu.class.getResource("/Images/explorador.jpg"));
		JLabel imagen_class1 = new JLabel (img);
		imagen_class1.setBounds(50, 120, 200, 200);
		panel2.add(imagen_class1);
		
		ImageIcon img2 = new ImageIcon(DisplayMenu.class.getResource("/Images/mago.jpg"));
		JLabel imagen_class2 = new JLabel (img2);
		imagen_class2.setBounds(420, 120, 200, 200);
		panel2.add(imagen_class2);
		
		ImageIcon img3 = new ImageIcon(DisplayMenu.class.getResource("/Images/asalto.jpg"));
		JLabel imagen_class3 = new JLabel (img3);
		imagen_class3.setBounds(750, 120, 200, 200);
		panel2.add(imagen_class3);

	}

	public void crear_panel3() {
		//Creacion del textfield
		JLabel name = new JLabel("Name: ");
		name.setBounds(100, 150, 100, 40);
		panel3.add(name);

		JTextField nombre = new JTextField();
		nombre.setBounds(150, 150, 300, 40);
		panel3.add(nombre);
		
		//Boton para crear el personaje con un action para poder continuar y crear los objetos
		JButton botonCrearPersonaje = new JButton("Create Character");
		botonCrearPersonaje.setBounds(450, 150, 250, 40);
		panel3.add(botonCrearPersonaje);

		botonCrearPersonaje.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {

				double altura = Double.parseDouble(JOptionPane.showInputDialog("Character height (cm): "));
				
				//Eleccion de clases
				if(rbrace1.getModel() == razas.getSelection()) {
					System.out.println("Selected Race: Chaos Demons");
				}else if(rbrace2.getModel() == razas.getSelection()) {
					System.out.println("Selected Race: Orks");
				}else if(rbrace3.getModel() == razas.getSelection()) {
					System.out.println("Selected Race: Space Marines ");
				}

				//Eleccion de armas
				if(rbclass1.getModel() == clases.getSelection()) {
					System.out.println("Selected Class: Explorer");

					int x = JOptionPane.showOptionDialog(null, "Choose a weapon", "Warhammer40k", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Armas_Explorador, Armas_Explorador[0]);

					switch(x) {
					case 0:
						arma = "Has elegido el subfusil";
						break;
					case 1:
						arma = "Has elegido la daga";
						break;
					}

					Explorer explorador = new Explorer(nombre.getText(), altura, 10 ,10, arma);
					explorador.Datos();
				}else if(rbclass2.getModel() == clases.getSelection()) {
					System.out.println("Selected Class: Sorcerer");

					int x = JOptionPane.showOptionDialog(null, "Choose a weapon", "Warhammer40k", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Armas_Mago, Armas_Mago[0]);

					switch(x) {
					case 0:
						arma = "Has elegido el baston de fuego";
						break;
					case 1:
						arma = "Has elegido el baston del vacio";
						break;
					}

					Sorcerer mago = new Sorcerer(nombre.getText(), altura, 10 ,10, arma);
					mago.Datos();
				}else if(rbclass3.getModel() == clases.getSelection()) {
					System.out.println("Selected Class: Assault ");

					int x = JOptionPane.showOptionDialog(null, "Choose a weapon", "Warhammer40k", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, Armas_Asalto, Armas_Asalto[0]);

					switch(x) {
					case 0:
						arma = "Has elegido el fusdil de asalto";
						break;
					case 1:
						arma = "Has elegido la espada con hoja de sierra";
						break;
					}

					Assault asalto = new Assault(nombre.getText(), altura, 10 ,10, arma);
					asalto.Datos();
				}
				
				//Creacion del juego
				Game game = new Game("Warhammer 40k", 1200, 850);
				game.start();
				dispose();
				

			}
		});

		//Boton salir
		JButton salir = new JButton("Salir");
		salir.setBounds(800, 150, 100, 40);
		panel3.add(salir);

		salir.addActionListener(new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(null, "Seguro que desea salir?", "Atencion!", JOptionPane.YES_NO_OPTION);
				if(respuesta == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
	}
}
