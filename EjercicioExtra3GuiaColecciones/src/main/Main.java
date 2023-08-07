package main;

import java.util.HashSet;
import java.util.Scanner;

import entidad.Libro;

public class Main {

	public static void main(String[] args) {
		HashSet<Libro> listaLibro = new HashSet<Libro>();
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		do {
			System.out.println("Vamos a crear un libro");
			System.out.println("Ingrese el título del libro");
			String titulo = sc.next();
			System.out.println("Ingrese el autor del libro");
			String autor = sc.next();
			System.out.println("Ingrese el número de ejemplares del libro");
			int ejemplares = sc.nextInt();
			System.out.println("Ingrese el número de ejemplares prestados del libro");
			int ejemplaresP = sc.nextInt();
			Libro libro = new Libro(titulo, autor, ejemplares, ejemplaresP);
			listaLibro.add(libro);
			System.out.println("Deseas ingresar otro libro? (S/N)");
			String resp = sc.next();
			if (resp.equalsIgnoreCase("N")) {
				salir = true;
			}
		}while(!salir);
	
	}
}