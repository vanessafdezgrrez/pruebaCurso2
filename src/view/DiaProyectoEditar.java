package view;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import model.Proyecto;

public class DiaProyectoEditar extends JDialog{

	private static final long serialVersionUID = 1L;
	
	TextField editarNombreProyecto, editarPresupuestoProyecto, editarFechaInicioProyecto, editarFechaFinProyecto;
	
	public DiaProyectoEditar() {
		crearVentana();
		rellenarCuadros();
		setVisible(true);
	}

	private void rellenarCuadros() {
		Proyecto p = controller.CtrlProyectos.lstProyectos.get(controller.CtrlProyectos.indiceActivo);
		editarNombreProyecto.setText(p.getpNombre());
		editarPresupuestoProyecto.setText(p.getpPresupuesto().toString());
		editarFechaInicioProyecto.setText(p.getpFechaInicio());
		editarFechaFinProyecto.setText(p.getpFechaFin());
	}

	private void crearVentana() {
		setModal(true);

		setTitle("Editar Proyecto");
		setBounds(400,400,600,230);
		setLayout(null);
		
		Label pEditarNombre = new Label();
		pEditarNombre.setBounds(40,40,80,20);
		pEditarNombre.setText("Nombre:");
		add(pEditarNombre);
		
		editarNombreProyecto = new TextField();
		editarNombreProyecto.setBounds(150,40,400,20);
		add(editarNombreProyecto);
		
		Label pEditarPresupuesto = new Label();
		pEditarPresupuesto.setBounds(40,70,80,20);
		pEditarPresupuesto.setText("Presupuesto:");
		add(pEditarPresupuesto);
		
		editarPresupuestoProyecto = new TextField();
		editarPresupuestoProyecto.setBounds(150,70,400,20);
		add(editarPresupuestoProyecto);
		
		Label pEditarFechaInicio = new Label();
		pEditarFechaInicio.setBounds(40,100,80,20);
		pEditarFechaInicio.setText("Fecha Inicio:");
		add(pEditarFechaInicio);
		
		editarFechaInicioProyecto = new TextField();
		editarFechaInicioProyecto.setBounds(150,100,400,20);
		add(editarFechaInicioProyecto);
		
		Label pEditarFechaFin = new Label();
		pEditarFechaFin.setBounds(40,130,80,20);
		pEditarFechaFin.setText("Fecha Fin:");
		add(pEditarFechaFin);
		
		editarFechaFinProyecto = new TextField();
		editarFechaFinProyecto.setBounds(150,130,400,20);
		add(editarFechaFinProyecto);
		
		Button guardarEditarProyecto = new Button("Guardar");
		guardarEditarProyecto.setBounds(500,160,50,30);
		add(guardarEditarProyecto);
		guardarEditarProyecto.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.CtrlProyectos.guardarEditarProyecto(editarNombreProyecto.getText(), editarPresupuestoProyecto.getText(), editarFechaInicioProyecto.getText(), editarFechaFinProyecto.getText());
				dispose();
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
