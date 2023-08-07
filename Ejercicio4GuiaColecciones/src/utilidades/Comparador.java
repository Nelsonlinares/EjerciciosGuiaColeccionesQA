package utilidades;

import java.util.Comparator;

import entidad.Pelicula;

public class Comparador {
	
	public static Comparator<Pelicula> ordenarDuracionDesc = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			Double p2Duracion = p2.getDuracion();
			Double p1Duracion = p1.getDuracion();
			return p2Duracion.compareTo(p1Duracion);
		}	
	};
	
	public static Comparator<Pelicula> ordenarDuracionAsc = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			Double p2Duracion = p2.getDuracion();
			Double p1Duracion = p1.getDuracion();
			return p1Duracion.compareTo(p2Duracion);
		}	
	};
	
	public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
		}	
	};
	
	public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {

		@Override
		public int compare(Pelicula p1, Pelicula p2) {
			return p1.getDirector().compareToIgnoreCase(p2.getDirector());
		}	
	};
	
}
