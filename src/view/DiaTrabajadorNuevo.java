package view;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class DiaTrabajadorNuevo extends JDialog {

	private static final long serialVersionUID = 1L;

	public static TextField DNITrabajador = new TextField();
	public static TextField trabajadorNombre = new TextField();
	public static TextField trabajadorApellidos = new TextField();
	public static TextField trabajadorGenero = new TextField();

	public DiaTrabajadorNuevo() {
		crearDialogo();
		setVisible(true);
	}

	private void crearDialogo() {
		setModal(true);
		
		setTitle("Nuevo Trabajador");
		setBounds(400, 400, 600, 230);
		setLayout(null);
		
		Label tDNI = new Label();
		tDNI.setBounds(40, 40, 80, 20);
		tDNI.setText("DNI:");
		add(tDNI);

		//TextField DNITrabajador = new TextField();
		DNITrabajador.setBounds(150, 40, 400, 20);
		add(DNITrabajador);

		Label tNombre = new Label();
		tNombre.setBounds(40, 70, 80, 20);
		tNombre.setText("Nombre:");
		add(tNombre);

		//TextField trabajadorNombre = new TextField();
		trabajadorNombre.setBounds(150, 70, 400, 20);
		add(trabajadorNombre);

		Label tApellidos = new Label();
		tApellidos.setBounds(40, 100, 80, 20);
		tApellidos.setText("Apellidos:");
		add(tApellidos);

		//TextField trabajadorApellidos = new TextField();
		trabajadorApellidos.setBounds(150, 100, 400, 20);
		add(trabajadorApellidos);

		Label tGenero = new Label();
		tGenero.setBounds(40, 130, 80, 20);
		tGenero.setText("Género:");
		add(tGenero);

		//TextField trabajadorGenero = new TextField();
		trabajadorGenero.setBounds(150, 130, 400, 20);
		add(trabajadorGenero);

		Button guardar = new Button("Guardar");
		guardar.setBounds(500, 160, 50, 30);
		add(guardar);
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.CtrlTrabajadores.guardar();
				DNITrabajador.setText("");
				trabajadorNombre.setText("");
				trabajadorApellidos.setText("");
				trabajadorGenero.setText("");
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
