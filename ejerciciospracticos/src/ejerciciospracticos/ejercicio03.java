package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		/**
		 * las pruebas realizadas son: 4 * * * * * * * * * *
		 */

		int num; // Es el número introducido por el usuario. que se convertira en la base y la
					// altura

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la base y altura.
		System.out.print("Introduzca una valor para el triangulo: ");
		num = sc.nextInt();
		// declaramos el for que nos recorrera la altura
		for (int i = 1; i <= num; i++) {
			// declaramos un for para imprimir los espacios y otro para imprimir el caracter
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
