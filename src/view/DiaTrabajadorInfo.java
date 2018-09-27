package view;

import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import model.Trabajador;

public class DiaTrabajadorInfo extends JDialog {

	private static final long serialVersionUID = 1L;

Label infoDNITrabajador, infoNombreTrabajador, infoApellidosTrabajador, infoGeneroTrabajador;
	
	public DiaTrabajadorInfo() {
		crearVentana();
		rellenarCuadros();
		setVisible(true);
	}
	
	private void rellenarCuadros() {
		Trabajador t = controller.CtrlTrabajadores.lstTrabajadores.get(controller.CtrlTrabajadores.indiceActivo);
		infoDNITrabajador.setText(t.gettDNI());
		infoNombreTrabajador.setText(t.gettNombre());
		infoApellidosTrabajador.setText(t.gettApellidos());
		infoGeneroTrabajador.setText(t.istGenero());
	}

	private void crearVentana() {
		setModal(true);

		setTitle("Info Trabajador");
		setBounds(400, 400, 600, 200);
		setLayout(null);
		
		Label tInfoDNI = new Label();
		tInfoDNI.setBounds(40, 40, 80, 20);
		tInfoDNI.setText("DNI:");
		add(tInfoDNI);

		infoDNITrabajador = new Label();
		infoDNITrabajador.setBounds(150, 40, 400, 20);
		add(infoDNITrabajador);

		Label tInfoNombre = new Label();
		tInfoNombre.setBounds(40, 70, 80, 20);
		tInfoNombre.setText("Nombre:");
		add(tInfoNombre);

		infoNombreTrabajador = new Label();
		infoNombreTrabajador.setBounds(150, 70, 400, 20);
		add(infoNombreTrabajador);

		Label tInfoApellidos = new Label();
		tInfoApellidos.setBounds(40, 100, 80, 20);
		tInfoApellidos.setText("Apellidos:");
		add(tInfoApellidos);

		infoApellidosTrabajador = new Label();
		infoApellidosTrabajador.setBounds(150, 100, 400, 20);
		add(infoApellidosTrabajador);

		Label tInfoGenero = new Label();
		tInfoGenero.setBounds(40, 130, 80, 20);
		tInfoGenero.setText("Género:");
		add(tInfoGenero);

		infoGeneroTrabajador = new Label();
		infoGeneroTrabajador.setBounds(150, 130, 400, 20);
		add(infoGeneroTrabajador);
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		});		
	}
}
