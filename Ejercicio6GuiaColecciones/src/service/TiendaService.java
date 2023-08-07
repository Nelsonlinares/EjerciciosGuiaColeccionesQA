package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entidad.Producto;

public class TiendaService {

	private HashMap<String,Double> listaProductos;
	private Scanner sc;

	public TiendaService() {
		this.listaProductos = new HashMap<String, Double>();
		this.sc = new Scanner(System.in);
	}
	
	public void menu() {
		boolean continuar = true;
		while(continuar == true) {
		System.out.println("------- MENU -------");
		System.out.println("1.- Crear y agregar producto al inventario");
		System.out.println("2.- Mostrar el inventario");
		System.out.println("3.- Modificar precio");
		System.out.println("4.- Eliminar producto");
		System.out.println("5.- Salir");
		int opc = sc.nextInt();
		switch (opc) {
		case 1:
			agregarProducto(crearProducto());
			break;
		case 2:
			mostrarInventario();
			break;
		case 3:
			modificarPrecio();
			break;
		case 4:
			eliminarProducto();
			break;
		case 5:
			System.out.println("Muchas gracias!");
			continuar = false;
			break;
		default:
			System.out.println("Ingrese una opción válida");
			break;
		}
		}
	}
	
	public Producto crearProducto() {
		System.out.println("Vamos a crear un producto");
		System.out.println("Ingrese el nombre del producto");
		String nombre = sc.next();
		System.out.println("Ingrese el precio del producto");
		Double precio = sc.nextDouble();
		Producto p = new Producto(nombre, precio);
		return p;
	}
	
	public void agregarProducto(Producto p) {
		listaProductos.put(p.getNombre(),p.getPrecio());
		System.out.println("El producto se ha agregado exitosamente");
	}
	
	public void mostrarInventario() {
		for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
            System.out.println(producto.getKey()+" ="+producto.getValue());
        }
	}
	
	public void modificarPrecio() {
		System.out.println("Ingrese el producto al cual desea modificar su precio");
		String nombre = sc.next();
		boolean valida = false;
		for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
            if (producto.getKey().equalsIgnoreCase(nombre)) {
				System.out.println("Ingrese su nuevo precio");
				Double precioNuevo = sc.nextDouble();
				producto.setValue(precioNuevo);
				valida = true;
			}
            if(valida) {
            	System.out.println("El precio ha sido modificado exitosamente");
            	mostrarInventario();
            }else {
            	System.out.println("El producto no está en nuestros registros");
            }
        }
	}
	
	public void eliminarProducto() {
		System.out.println("Ingrese el nombre del producto que desea eliminar");
		String productoEliminado = sc.next();
		boolean valida = false;
		for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
            if (producto.getKey().equalsIgnoreCase(productoEliminado)) {
				listaProductos.remove(productoEliminado);
				valida = true;
			}
		}
            if(valida) {
            	System.out.println("El producto ha sido eliminado exitosamente");
            	mostrarInventario();
            }else {
            	System.out.println("El producto no está en nuestros registros");
            }
	}
}
