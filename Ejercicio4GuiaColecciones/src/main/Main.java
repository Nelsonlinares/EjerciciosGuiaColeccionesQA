package main;

import services.PeliculaService;

public class Main {

	public static void main(String[] args) {
		PeliculaService pS = new PeliculaService();
		pS.agregarPeli();
		pS.ordenarPeliDesc();
		pS.ordenarPeliTitulo();
		pS.ordenarPeliDirector();
	}

}
