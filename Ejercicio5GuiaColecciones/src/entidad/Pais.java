package entidad;

public class Pais {

	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + "]";
	}
}
