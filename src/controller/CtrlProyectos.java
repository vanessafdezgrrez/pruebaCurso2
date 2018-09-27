package controller;

import java.util.ArrayList;
import java.util.List;

import model.Proyecto;

public class CtrlProyectos {
	
	
	public static List<Proyecto> lstProyectos = new ArrayList<Proyecto>();
	public static int indiceActivo;

	public static void inicio() {
		if(lstProyectos.isEmpty()) {
			cargarListaDeProyectos();
		}
		new view.FrmProyectos();
	}

	public static void cargarListaDeProyectos() {
		lstProyectos.add(new Proyecto("Primer proyecto", 100.0,"qwe","asd"));
		lstProyectos.add(new Proyecto("Segundo proyecto", 200.0,"qwe","asd"));
		lstProyectos.add(new Proyecto("Tercer proyecto", 160.0,"qwe","asd"));
		lstProyectos.add(new Proyecto("Cuarto proyecto", 150.0,"qwe","asd"));
	}

	public static void borrar() {
		if (indiceActivo >= 0) {
			lstProyectos.remove(indiceActivo);
		}
	}

	public static void guardarProyectoNuevo(String nombreProyecto, String presupuestoProyecto, String fechaInicioProyecto, String fechaFinProyecto) {
		Proyecto p = new Proyecto(nombreProyecto, Double.parseDouble(presupuestoProyecto), fechaInicioProyecto, fechaFinProyecto);
		lstProyectos.add(p);
	}

	public static void guardarEditarProyecto(String nombre, String presupuesto, String fechaInicio, String fechaFin) {
		Proyecto p = new Proyecto(nombre, Double.parseDouble(presupuesto), fechaInicio, fechaFin);
		lstProyectos.set(indiceActivo,p);
		
	}

}