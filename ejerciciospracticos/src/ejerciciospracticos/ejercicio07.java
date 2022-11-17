package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		/**
		 * las pruebas realizadas son: 5 1 11 121 1331 14641 15 20 15 6 1
		 */

		int num;// Número introducido por el usuario.
		int aux;// Número auxiliar.

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la altura.
		System.out.println("¿Que altura desea que tenga la pirámide de Tartaglia?: ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			aux = 1;
			System.out.print(aux + " ");
			for (int j = 0; j < i; j++) {
				aux = aux * (i - j) / (j + 1);
				System.out.print(aux + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
