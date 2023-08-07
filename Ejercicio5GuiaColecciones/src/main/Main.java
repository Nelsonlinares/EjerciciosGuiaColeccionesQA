package main;

import service.PaisService;

public class Main {

	public static void main(String[] args) {
		
		PaisService pS = new PaisService();
		pS.agregarPais();
		pS.mostrarPais();
		pS.eliminarPais();
	}

}
