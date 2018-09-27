package view;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class DiaProyectoNuevo extends JDialog {

	private static final long serialVersionUID = 1L;

	public DiaProyectoNuevo() {
		crearVentana();
		setVisible(true);
	}

	private void crearVentana() {
		setModal(true);
		
		setTitle("Nuevo Proyecto");
		setBounds(400, 400, 600, 230);
		setLayout(null);
		
		Label pNombre = new Label();
		pNombre.setBounds(40, 40, 80, 20);
		pNombre.setText("Nombre:");
		add(pNombre);

		TextField nombreProyecto = new TextField();
		nombreProyecto.setBounds(150, 40, 400, 20);
		add(nombreProyecto);

		Label pPresupuesto = new Label();
		pPresupuesto.setBounds(40, 70, 80, 20);
		pPresupuesto.setText("Presupuesto:");
		add(pPresupuesto);

		TextField presupuestoProyecto = new TextField();
		presupuestoProyecto.setBounds(150, 70, 400, 20);
		add(presupuestoProyecto);

		Label pFechaInicio = new Label();
		pFechaInicio.setBounds(40, 100, 80, 20);
		pFechaInicio.setText("Fecha Inicio:");
		add(pFechaInicio);

		TextField fechaInicioProyecto = new TextField();
		fechaInicioProyecto.setBounds(150, 100, 400, 20);
		add(fechaInicioProyecto);

		Label pFechaFin = new Label();
		pFechaFin.setBounds(40, 130, 80, 20);
		pFechaFin.setText("Fecha Fin:");
		add(pFechaFin);

		TextField fechaFinProyecto = new TextField();
		fechaFinProyecto.setBounds(150, 130, 400, 20);
		add(fechaFinProyecto);

		Button guardarProyecto = new Button("Guardar");
		guardarProyecto.setBounds(500, 160, 50, 30);
		add(guardarProyecto);
		guardarProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlProyectos.guardarProyectoNuevo(nombreProyecto.getText(), presupuestoProyecto.getText(),
						fechaInicioProyecto.getText(), fechaFinProyecto.getText());
				setVisible(false);
			}
		});
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});	
	}
}
