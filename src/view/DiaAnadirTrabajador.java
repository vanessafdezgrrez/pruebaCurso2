package view;

import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import model.Trabajador;

public class DiaAnadirTrabajador extends JDialog {

	private static final long serialVersionUID = 1L;
	
	List listaTrabajadores = new List();
	
	/*Hay que cargar la lista de trabajadores previamente*/
	
	public DiaAnadirTrabajador() {
		crearVentana();
		cargarDatos();
		setVisible(true);
	}

	private void cargarDatos() {
		for (Trabajador t:controller.CtrlTrabajadores.lstTrabajadores) {
			listaTrabajadores.add(t.gettDNI() + ": " + t.gettApellidos() + ", " + t.gettNombre());
		}
	}

	private void crearVentana() {
		setTitle("Aņadir Trabajador");
		setResizable(false);
		setLayout(null);

		Dimension tamaņoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((tamaņoPantalla.width - 300) / 2, (tamaņoPantalla.height - 200) / 2, 300, 200);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);
			}
		});
		
		//List listaTrabajadores = new List();
		listaTrabajadores.setBounds(20,20,250,130);
		
		add(listaTrabajadores);
	}
}
