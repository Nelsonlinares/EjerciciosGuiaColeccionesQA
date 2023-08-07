package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entidad.Pelicula;
import utilidades.Comparador;

public class PeliculaService {

	private List<Pelicula> listaPeli;

	public PeliculaService() {
		this.listaPeli = new ArrayList<>();
	}

	public List<Pelicula> getListaPeli() {
		return listaPeli;
	}

	public void setListaPeli(List<Pelicula> listaPeli) {
		this.listaPeli = listaPeli;
	}
	
	public Pelicula crearPelicula() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos a crear una película");
		System.out.println("Ingrese el título");
		String titulo = sc.next();
		System.out.println("Ingrese el director");
		String director = sc.next();
		System.out.println("Ingrese la duración (en horas)");
		double duracion = sc.nextDouble();
		Pelicula peli = new Pelicula(titulo, director, duracion);
		return peli;
	}
	
	public void agregarPeli() {
		String resp = "";
		Scanner sc = new Scanner(System.in);
		listaPeli.add(crearPelicula());
		System.out.println("Desea agregar otra película? (S/N)");
		resp = sc.next();
		if (resp.equalsIgnoreCase("S")) {
			agregarPeli();
		}else {
			System.out.println("Muchas gracias!");
		}
	}
	
	public void mostrarPeli() {
		for (Pelicula pelicula : listaPeli) {
			System.out.println(pelicula);
		}
	}
	
	public void mostrarPeliUnaHora() {
		for (Pelicula pelicula : listaPeli) {
			if (pelicula.getDuracion()>1) {
			System.out.println(pelicula);
			}
		}
	}
	
	public void ordenarPeliDesc() {
		Collections.sort(listaPeli,Comparador.ordenarDuracionDesc);
		mostrarPeli();
	}
	
	public void ordenarPeliAsc() {
		Collections.sort(listaPeli,Comparador.ordenarDuracionAsc);
		mostrarPeli();
	}
	
	public void ordenarPeliTitulo() {
		Collections.sort(listaPeli,Comparador.ordenarTitulo);
		mostrarPeli();
	}
	
	public void ordenarPeliDirector() {
		Collections.sort(listaPeli,Comparador.ordenarDirector);
		mostrarPeli();
	}
	
}
