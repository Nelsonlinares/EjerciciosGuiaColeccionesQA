package entidad;

import java.util.HashSet;
import java.util.Scanner;

public final class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;
	
	public Libro() {
	}

	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPrestados="
				+ ejemplaresPrestados + "]";
	}
	
	public boolean prestamo(HashSet<Libro> lista) {
		boolean valida = false;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al menú de préstamo");
		System.out.println("Ingrese el nombre del libro");
		String libroBuscado = sc.next();
		for (Libro libro : lista) {
		if(libro.titulo.equalsIgnoreCase(libroBuscado)) {
			if (libro.getEjemplaresPrestados()>0) {
				libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
				valida = true;
			}
		}
		}
		if (valida) {
			System.out.println("El libro ha sido prestado existosamente");
		}else {
			System.out.println("El libro ingresado no se encuentra en la biblioteca o no tenemos ejemplares disponibles");
		}
		return valida;
	}
	
	public boolean devolucion(HashSet<Libro> lista) {
		boolean valida = false;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al menú de devolución");
		System.out.println("Ingrese el nombre del libro");
		String libroBuscado = sc.next();
		for (Libro libro : lista) {
		if(libro.titulo.equalsIgnoreCase(libroBuscado)) {
			if (libro.getEjemplaresPrestados()>0) {
				libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
				valida = true;
			}
		}
		}
		if (valida) {
			System.out.println("El libro ha sido devuelto existosamente");
		}else {
			System.out.println("El libro ingresado no se encuentra en la biblioteca o no tenemos ejemplares disponibles");
		}
		return valida;
	}
}
