package model;

public class Proyecto {
	
	private String pNombre;
	private Double pPresupuesto;
	private String pFechaInicio;
	private String pFechaFin;
	
	public Proyecto() {
		super();
		this.pNombre = "";
		this.pPresupuesto = 0.0;
		this.pFechaInicio = "";
		this.pFechaFin = "";
	}
	
	public Proyecto(String pNombre, Double pPresupuesto, String pFechaInicio, String pFechaFin) {
		super();
		this.pNombre = pNombre;
		this.pPresupuesto = pPresupuesto;
		this.pFechaInicio = pFechaInicio;
		this.pFechaFin = pFechaFin;
	}

	public String getpNombre() {
		return pNombre;
	}

	public Double getpPresupuesto() {
		return pPresupuesto;
	}

	public String getpFechaInicio() {
		return pFechaInicio;
	}

	public String getpFechaFin() {
		return pFechaFin;
	}

	public void setpNombre(String pNombre) {
		this.pNombre = pNombre;
	}

	public void setpPresupuesto(Double pPresupuesto) {
		this.pPresupuesto = pPresupuesto;
	}

	public void setpFechaInicio(String pFechaInicio) {
		this.pFechaInicio = pFechaInicio;
	}

	public void setpFechaFin(String pFechaFin) {
		this.pFechaFin = pFechaFin;
	}

	@Override
	public String toString() {
		return "Proyecto [pNombre=" + pNombre + ", pPresupuesto=" + pPresupuesto + ", pFechaInicio=" + pFechaInicio
				+ ", pFechaFin=" + pFechaFin + "]";
	}
	
}
