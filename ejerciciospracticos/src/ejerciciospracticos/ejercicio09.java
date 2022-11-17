package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio09 {

	public static void main(String[] args) {
		/**
		 * las pruebas realizadas son: 123456789 ---> tiene 9 cifras
		 */
		int num; // Número introducido por el usuario.
		int contador = 0;// Contador de cifras.

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número.
		System.out.println("Introduzca un numero: ");
		num = sc.nextInt();

		// Comprobamos que el numero no es negativo
		if (num <= 0) {
			System.out.println("El numero no puede ser negativo");
		} else {
			// mientra s el numero tenga cifras, no sea igual a cero,
			// se ira dividiendo entre 10, osea quitandole una cifra, y aumentando el
			// contador
			while (num != 0) {
				num /= 10;
				contador++;
			}
			System.out.println("El numero tiene " + contador + " cifras.");
		}
		// Cerramos el Scanner.
		sc.close();
	}

}
