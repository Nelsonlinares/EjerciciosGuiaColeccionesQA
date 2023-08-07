package service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import entidad.Pais;
import utilidades.Comparador;

public class PaisService {

	private TreeSet<Pais> conjuntoPais;
	private Scanner sc;

	public PaisService() {
		this.conjuntoPais = new TreeSet<Pais>(Comparador.ordenarAlfabetic);
		this.sc = new Scanner(System.in);
	}
	
	public Pais crearPais() {
		System.out.println("Creando un país");
		System.out.println("Ingrese el nombre del país");
		String nombre = sc.next();
		Pais pais = new Pais(nombre);
		return pais;
	}
	
	public void agregarPais() {
		String resp = "";
		conjuntoPais.add(crearPais());
		System.out.println("Desea ingresar otro país? (S/N)");
		resp = sc.next();
		if (resp.equalsIgnoreCase("S")) {
			agregarPais();
		}else {
			System.out.println("Muchas gracias!");
		}
	}
	
	public void mostrarPais() {
		for (Pais pais : conjuntoPais) {
			System.out.println(pais);
		}
	}
	
	public void eliminarPais() {
		Iterator<Pais> it = conjuntoPais.iterator();
		System.out.println("Escriba el país que desea eliminar");
		String paisAEliminar = sc.next();
		boolean valida = false;
		while (it.hasNext()) {
			Pais p = it.next();
			if (p.getNombre().equalsIgnoreCase(paisAEliminar)) {
				it.remove();
				valida = true;
			}
		}
		if (valida) {
			mostrarPais();
		}else {
			System.out.println("Este país no se encuentra en la lista");
		}
	}
}
