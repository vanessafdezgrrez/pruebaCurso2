package view;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Proyecto;

public class FrmEquipos extends Frame {

	Choice proyectos = new Choice();
	
	private static final long serialVersionUID = 1L;

	public FrmEquipos() {
		crearFrame();
		cargarDatos();
		setVisible(true);
	}

	private void cargarDatos() {
		if(controller.CtrlProyectos.lstProyectos.isEmpty()) {
			controller.CtrlProyectos.cargarListaDeProyectos();
		}
		for (Proyecto p:controller.CtrlProyectos.lstProyectos) {
			proyectos.add(p.getpNombre());
		}
	}

	private void crearFrame() {
		setTitle("EQUIPOS");
		setResizable(false);
		setLayout(null);

		Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((tamañoPantalla.width - 500) / 2, (tamañoPantalla.height - 350) / 2, 500, 350);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);
			}
		});
		
		//Choice proyectos = new Choice();
		proyectos.setBounds(20,40,200,30);
		add(proyectos);
		
		DefaultTableModel modelo = new DefaultTableModel();
		JTable tablaTrabajadoresCargos = new JTable (modelo);
		
		add(tablaTrabajadoresCargos);

		Button btnAnadir = new Button("Añadir");
		btnAnadir.setBounds(40, 300, 40, 20);
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DiaAnadirTrabajador();
			}
		});

		Button btnEliminar = new Button("Borrar");
		btnEliminar.setBounds(90, 300, 40, 20);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});

		Button btnEditar = new Button("Editar");
		btnEditar.setBounds(140, 300, 40, 20);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DiaEditarCargo();
			}
		});

		add(btnAnadir);
		add(btnEliminar);
		add(btnEditar);
		
	}
}
