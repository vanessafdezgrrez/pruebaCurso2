package model;

public class Trabajador {

	private String tDNI;
	private String tNombre;
	private String tApellidos;
	private String tGenero;
	
	public Trabajador() {
		super();
		this.tDNI = "";
		this.tNombre = "";
		this.tApellidos = "";
		this.tGenero = "";
	}
	
	public Trabajador(String tDNI, String tNombre, String tApellidos, String tGenero) {
		super();
		this.tDNI = tDNI;
		this.tNombre = tNombre;
		this.tApellidos = tApellidos;
		this.tGenero = tGenero;
	}

	public String gettDNI() {
		return tDNI;
	}

	public String gettNombre() {
		return tNombre;
	}

	public String gettApellidos() {
		return tApellidos;
	}

	public String istGenero() {
		return tGenero;
	}

	public void settDNI(String tDNI) {
		this.tDNI = tDNI;
	}

	public void settNombre(String tNombre) {
		this.tNombre = tNombre;
	}

	public void settApellidos(String tApellidos) {
		this.tApellidos = tApellidos;
	}

	public void settGenero(String tGenero) {
		this.tGenero = tGenero;
	}

	@Override
	public String toString() {
		return "Trabajador [tDNI=" + tDNI + ", tNombre=" + tNombre + ", tApellidos=" + tApellidos + ", tGenero="
				+ tGenero + "]";
	}
	
}
