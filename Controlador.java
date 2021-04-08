package es.studium.Monomios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Monomio monomio;
	Vista vista;
	
	Controlador(Vista v, Monomio m)
	{
		this.vista = v;
		this.monomio = m;
		// Añadir Listeners
		this.vista.ventana.addWindowListener(this);
		this.vista.unMonomio.addWindowListener(this);
		this.vista.dosMonomios.addWindowListener(this);
		
		this.vista.btnAceptarUno.addActionListener(this);
		this.vista.btnAceptarDos.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		if(this.vista.unMonomio.isActive())
		{
			this.vista.unMonomio.setVisible(false);
		}
		else if (this.vista.dosMonomios.isActive())
		{
			this.vista.dosMonomios.setVisible(false);
		}
		else
		{
			System.exit(0);
		}
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
}
