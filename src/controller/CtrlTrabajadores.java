package controller;

import java.util.ArrayList;
import java.util.List;

import model.Trabajador;

public class CtrlTrabajadores {

	public static List <Trabajador> lstTrabajadores = new ArrayList <Trabajador>();
	
	public static int indiceActivo;

	public static void inicio() {
		if(lstTrabajadores.isEmpty()) {
			cargarListaDeTrabajadores();
		}
		new view.FrmTrabajadores();
	}
	
	public static void cargarListaDeTrabajadores() {
		lstTrabajadores.add(new Trabajador("47342285M", "Fernández Gutiérrez", "Vanessa", "Mujer"));
		lstTrabajadores.add(new Trabajador("14321785F", "Caraballo Estévez", "Agustín", "Hombre"));
		lstTrabajadores.add(new Trabajador("00000000X", "Caraballo Fernández", "Kato", "Hombre"));
	}
	
	public static void borrar() {
		if (indiceActivo >= 0) {
			lstTrabajadores.remove(indiceActivo);
		}
	}
	
	public static void guardar() {
		Trabajador t = new Trabajador();
		t.settDNI(view.DiaTrabajadorNuevo.DNITrabajador.getText());
		t.settNombre(view.DiaTrabajadorNuevo.trabajadorNombre.getText());
		t.settApellidos(view.DiaTrabajadorNuevo.trabajadorApellidos.getText());
		t.settGenero(view.DiaTrabajadorNuevo.trabajadorGenero.getText());
		controller.CtrlTrabajadores.lstTrabajadores.add(t);
	}

	public static void guardarEditarTrabajador(String DNI, String nombre, String apellidos, String genero) {
		Trabajador t = new Trabajador(DNI, nombre, apellidos, genero);
		lstTrabajadores.set(indiceActivo,t);
	}
}
