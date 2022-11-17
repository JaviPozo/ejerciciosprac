package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		/**
		 * las pruebas realizadas son: 12 1 22 333 4444 55555 666666 7777777 88888888 999999999
		 */

		int num;// Es el número introducido por el usuario.

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un valor
		System.out.println("Introduzca un valor: ");
		num = sc.nextInt();

		// recorremos cada numero desde 1 hasta n imprimiendo cada numero las veces de
		// su valor
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}

}
