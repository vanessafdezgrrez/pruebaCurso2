package controller;

public class CtrlApp {

	public static void lanzarApp() {
		new view.FrmPrincipal();
	}

	public static void lanzarProyectos() {
		controller.CtrlProyectos.inicio();
	}

	public static void lanzarTrabajadores() {
		controller.CtrlTrabajadores.inicio();
	}

	public static void lanzarEquipos() {
		new view.FrmEquipos();
	}

}