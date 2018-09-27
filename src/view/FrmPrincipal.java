package view;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmPrincipal extends Frame{

	private static final long serialVersionUID = 1L;

	static TextField nombreProyecto = new TextField();
	static TextField presupuestoProyecto = new TextField();
	static TextField fechaInicioProyecto = new TextField();
	static TextField fechaFinProyecto = new TextField();

	static Label infoNombreProyecto = new Label();
	static Label infoPresupuestoProyecto = new Label();
	static Label infoFechaInicioProyecto = new Label();
	static Label infoFechaFinProyecto = new Label();
	static TextField editarNombreProyecto = new TextField();
	static TextField editarPresupuestoProyecto = new TextField();
	static TextField editarFechaInicioProyecto = new TextField();
	static TextField editarFechaFinProyecto = new TextField();
	
	public FrmPrincipal() {
		crearFrame();
	}
	
	private void crearFrame() {
		setTitle("EMPRESA");
		int anchoVentana = 300;
		int altoVentana = 330;
		Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((tamañoPantalla.width-anchoVentana)/2,(tamañoPantalla.height-altoVentana)/2,anchoVentana,altoVentana);
		
		MenuBar barraMenu = new MenuBar();
		
		Menu base = new Menu("BASE");
		MenuItem proyectos = new MenuItem("Proyectos");
		proyectos.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.CtrlApp.lanzarProyectos();
			}
		});
		MenuItem trabajadores = new MenuItem("Trabajadores");
		trabajadores.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.CtrlApp.lanzarTrabajadores();
			}
		});
		MenuItem salir = new MenuItem("Salir");
		salir.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				salir();
			}
		});
		
		Menu gestion = new Menu("GESTIÓN");
		MenuItem equipos = new MenuItem("EQUIPOS");
		equipos.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.CtrlApp.lanzarEquipos();	
			}
		});
		
		base.add(proyectos);
		base.add(trabajadores);
		base.addSeparator();
		base.add(salir);
		
		gestion.add(equipos);
		
		barraMenu.add(base);
		barraMenu.add(gestion);
		
		setMenuBar(barraMenu);			
		
		setResizable(false);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent arg0) {
				salir();
			}
		});
		
	}
	
	public static void salir() {
		System.exit(0);
	}
}