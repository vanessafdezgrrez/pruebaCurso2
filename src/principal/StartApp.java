package principal;

public class StartApp {

	public static void main(String[] args) {
		StartApp start = new StartApp();
		start.inicio();
	}

	private void inicio() {
		controller.CtrlApp.lanzarApp();
	}

}