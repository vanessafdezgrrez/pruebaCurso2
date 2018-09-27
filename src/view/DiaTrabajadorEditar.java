package view;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import model.Trabajador;

public class DiaTrabajadorEditar extends JDialog {

	private static final long serialVersionUID = 1L;

TextField editarDNITrabajador, editarNombreTrabajador, editarApellidosTrabajador, editarGeneroTrabajador;
	
	public DiaTrabajadorEditar() {
		crearVentana();
		rellenarCuadros();
		setVisible(true);
	}

	private void rellenarCuadros() {
		Trabajador t = controller.CtrlTrabajadores.lstTrabajadores.get(controller.CtrlTrabajadores.indiceActivo);
		editarDNITrabajador.setText(t.gettDNI());
		editarNombreTrabajador.setText(t.gettNombre());
		editarApellidosTrabajador.setText(t.gettApellidos());
		editarGeneroTrabajador.setText(t.istGenero());
	}

	private void crearVentana() {
		setModal(true);

		setTitle("Editar Trabajador");
		setBounds(400,400,600,230);
		setLayout(null);
		
		Label tEditarDNI = new Label();
		tEditarDNI.setBounds(40,40,80,20);
		tEditarDNI.setText("DNI:");
		add(tEditarDNI);
		
		editarDNITrabajador = new TextField();
		editarDNITrabajador.setBounds(150,40,400,20);
		add(editarDNITrabajador);
		
		Label tEditarNombre = new Label();
		tEditarNombre.setBounds(40,70,80,20);
		tEditarNombre.setText("Nombre:");
		add(tEditarNombre);
		
		editarNombreTrabajador = new TextField();
		editarNombreTrabajador.setBounds(150,70,400,20);
		add(editarNombreTrabajador);
		
		Label tEditarApellidos = new Label();
		tEditarApellidos.setBounds(40,100,80,20);
		tEditarApellidos.setText("Apellidos:");
		add(tEditarApellidos);
		
		editarApellidosTrabajador = new TextField();
		editarApellidosTrabajador.setBounds(150,100,400,20);
		add(editarApellidosTrabajador);
		
		Label tEditarGenero = new Label();
		tEditarGenero.setBounds(40,130,80,20);
		tEditarGenero.setText("Género:");
		add(tEditarGenero);
		
		editarGeneroTrabajador = new TextField();
		editarGeneroTrabajador.setBounds(150,130,400,20);
		add(editarGeneroTrabajador);
		
		Button guardarEditarTrabajador = new Button("Guardar");
		guardarEditarTrabajador.setBounds(500,160,50,30);
		add(guardarEditarTrabajador);
		guardarEditarTrabajador.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.CtrlTrabajadores.guardarEditarTrabajador(editarDNITrabajador.getText(), editarNombreTrabajador.getText(), editarApellidosTrabajador.getText(), editarGeneroTrabajador.getText());
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
