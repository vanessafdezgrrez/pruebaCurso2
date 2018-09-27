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

import model.Trabajador;

public class FrmTrabajadores extends Frame {

	private static final long serialVersionUID = 1L;

	List lstTrab;
	Button btnNuevo, btnBorrar, btnEditar, btnInfo;
	Label DNITrabajador = new Label();
	Label nombreTrabajador = new Label();
	Label apellidosTrabajador = new Label();
	Label generoTrabajador = new Label();;

	public FrmTrabajadores() {
		crearFrame();
		rellenarFrame();
	}

	private void crearFrame() {
		setTitle("Trabajadores");
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

		lstTrab = new List();
		lstTrab.setBounds(30, 30, 220, 200);

		btnNuevo = new Button("Nuevo");
		btnNuevo.setBounds(40, 250, 40, 20);
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DiaTrabajadorNuevo();
				rellenarFrame();
			}
		});

		btnBorrar = new Button("Borrar");
		btnBorrar.setBounds(90, 250, 40, 20);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlTrabajadores.indiceActivo = lstTrab.getSelectedIndex();
				controller.CtrlTrabajadores.borrar();
				rellenarFrame();
			}
		});

		btnEditar = new Button("Editar");
		btnEditar.setBounds(140, 250, 40, 20);
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlTrabajadores.indiceActivo = lstTrab.getSelectedIndex();
				new DiaTrabajadorEditar();
				rellenarFrame();
			}
		});

		btnInfo = new Button("info");
		btnInfo.setBounds(190, 250, 40, 20);
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlTrabajadores.indiceActivo = lstTrab.getSelectedIndex();
				new DiaTrabajadorInfo();
			}
		});

		add(lstTrab);
		add(btnNuevo);
		add(btnBorrar);
		add(btnEditar);
		add(btnInfo);

		setVisible(true);
	}
	
	private void rellenarFrame() {
		lstTrab.removeAll();
		for (Trabajador t : controller.CtrlTrabajadores.lstTrabajadores) {
			lstTrab.add(t.gettNombre());
		}
	}
}
