package view;

import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import model.Proyecto;

public class DiaProyectoInfo extends JDialog {

	private static final long serialVersionUID = 1L;
	
	Label infoNombreProyecto, infoPresupuestoProyecto, infoFechaInicioProyecto, infoFechaFinProyecto;
	
	public DiaProyectoInfo() {
		crearVentana();
		rellenarCuadros();
		setVisible(true);
	}
	
	private void rellenarCuadros() {
		Proyecto p = controller.CtrlProyectos.lstProyectos.get(controller.CtrlProyectos.indiceActivo);
		infoNombreProyecto.setText(p.getpNombre());
		infoPresupuestoProyecto.setText(p.getpPresupuesto().toString());
		infoFechaInicioProyecto.setText(p.getpFechaInicio());
		infoFechaFinProyecto.setText(p.getpFechaFin());
	}

	private void crearVentana() {
		setModal(true);

		setTitle("Info Proyecto");
		setBounds(400, 400, 600, 200);
		setLayout(null);
		
		Label pInfoNombre = new Label();
		pInfoNombre.setBounds(40, 40, 80, 20);
		pInfoNombre.setText("Nombre:");
		add(pInfoNombre);

		infoNombreProyecto = new Label();
		infoNombreProyecto.setBounds(150, 40, 400, 20);
		add(infoNombreProyecto);

		Label pInfoPresupuesto = new Label();
		pInfoPresupuesto.setBounds(40, 70, 80, 20);
		pInfoPresupuesto.setText("Presupuesto:");
		add(pInfoPresupuesto);

		infoPresupuestoProyecto = new Label();
		infoPresupuestoProyecto.setBounds(150, 70, 400, 20);
		add(infoPresupuestoProyecto);

		Label pInfoFechaInicio = new Label();
		pInfoFechaInicio.setBounds(40, 100, 80, 20);
		pInfoFechaInicio.setText("Fecha Inicio:");
		add(pInfoFechaInicio);

		infoFechaInicioProyecto = new Label();
		infoFechaInicioProyecto.setBounds(150, 100, 400, 20);
		add(infoFechaInicioProyecto);

		Label pInfoFechaFin = new Label();
		pInfoFechaFin.setBounds(40, 130, 80, 20);
		pInfoFechaFin.setText("Fecha Fin:");
		add(pInfoFechaFin);

		infoFechaFinProyecto = new Label();
		infoFechaFinProyecto.setBounds(150, 130, 400, 20);
		add(infoFechaFinProyecto);
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});		
	}
}
