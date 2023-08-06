package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
		System.out.println("Ingrese un número");
		numero = sc.nextInt();
		if (numero != -99) {
			listaNumeros.add(numero);	
		}else {
			System.out.println("El número de valores leídos son: "+listaNumeros.size());
			double suma = 0;
			double promedio = 0;
			for (Integer numeros : listaNumeros) {
				suma += numeros;
			}
			promedio = suma/listaNumeros.size();
			System.out.println("La suma de los valores es: "+suma);
			System.out.println("El promedio de los valores es: "+promedio);
			System.out.println("Algortimo finalizado");
		}
		}while(numero != -99);
	}

}
