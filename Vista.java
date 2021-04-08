package es.studium.Monomios;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;

public class Vista
{
	Frame ventana = new Frame("Monomios");
	
	Dialog unMonomio = new Dialog(ventana, "Un Monomio");
	Dialog dosMonomios = new Dialog(ventana, "Dos Monomios");
	
	MenuBar menuBar = new MenuBar();
	Menu mnuArchivo = new Menu("Archivo");
	Menu mnuOperar = new Menu("Operar");
	MenuItem mniSalir = new MenuItem("Salir");
	MenuItem mniCambiar = new MenuItem("Cambiar Signo");
	MenuItem mniSumar = new MenuItem("Sumar");
	MenuItem mniRestar = new MenuItem("Restar");
	MenuItem mniMultiplicar = new MenuItem("Multiplicar");
	MenuItem mniDerivar = new MenuItem("Derivar");
	
	Label lblUno = new Label("Primer Monomio");
	Label lblDos = new Label("Segundo Monomio");
	Label lblx1 = new Label(" x ");
	Label lblx2 = new Label(" x ");
	Label lblx3 = new Label(" x ");
	Label lblUnico = new Label("Monomio");
	
	TextField txtValor = new TextField(5);
	TextField txtGrado = new TextField(5);
	TextField txtUnResultado = new TextField(10);
	TextField txtValorUno = new TextField(5);
	TextField txtGradoUno = new TextField(5);
	TextField txtValorDos = new TextField(5);
	TextField txtGradoDos = new TextField(5);
	TextField txtResultado = new TextField(5);
	
	Button btnAceptarUno = new Button("Cambiar signo");
	Button btnAceptarDos = new Button("Suma");
	
	public Vista()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.setSize(300,150);
		ventana.setVisible(true);
	}
}
