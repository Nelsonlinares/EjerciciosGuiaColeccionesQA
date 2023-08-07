package utilidades;

import java.util.Comparator;

import entidad.Pais;

public class Comparador {
	
	public static Comparator<Pais> ordenarAlfabetic = new Comparator<Pais>() {

		@Override
		public int compare(Pais p1, Pais p2) {
			return p1.getNombre().compareToIgnoreCase(p2.getNombre());
		}
	};
}
