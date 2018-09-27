package view;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import model.Proyecto;

public class FrmProyectos extends Frame {

	private static final long serialVersionUID = 1L;

	List lstProy;
	Button btnNuevo, btnBorrar, btnEditar, btnInfo;
	Label infoNombreProyecto = new Label();
	Label infoPresupuestoProyecto = new Label();
	Label infoFechaInicioProyecto = new Label();
	Label infoFechaFinProyecto = new Label();;

	public FrmProyectos() {
		crearFrame();
		rellenarFrame();
	}

	private void crearFrame() {
		setTitle("Proyectos");
		setResizable(false);
		setLayout(null);

		Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((tamañoPantalla.width - 280) / 2, (tamañoPantalla.height - 300) / 2, 280, 300);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);
			}
		});

		lstProy = new List();
		lstProy.setBounds(30, 30, 220, 200);

		btnNuevo = new Button("Nuevo");
		btnNuevo.setBounds(40, 250, 40, 20);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DiaProyectoNuevo();
				rellenarFrame();
			}
		});

		btnBorrar = new Button("Borrar");
		btnBorrar.setBounds(90, 250, 40, 20);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlProyectos.indiceActivo = lstProy.getSelectedIndex();
				controller.CtrlProyectos.borrar();
				rellenarFrame();
			}
		});

		btnEditar = new Button("Editar");
		btnEditar.setBounds(140, 250, 40, 20);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlProyectos.indiceActivo = lstProy.getSelectedIndex();
				new DiaProyectoEditar();
				rellenarFrame();
			}
		});

		btnInfo = new Button("info");
		btnInfo.setBounds(190, 250, 40, 20);
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlProyectos.indiceActivo = lstProy.getSelectedIndex();
				new DiaProyectoInfo();
			}
		});

		add(lstProy);
		add(btnNuevo);
		add(btnBorrar);
		add(btnEditar);
		add(btnInfo);

		setVisible(true);
	}
	
	private void rellenarFrame() {
		lstProy.removeAll();
		for (Proyecto p : controller.CtrlProyectos.lstProyectos) {
			lstProy.add(p.getpNombre());
		}
	}
}