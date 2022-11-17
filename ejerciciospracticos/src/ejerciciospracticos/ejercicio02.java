package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// Definimos las variables.
		int num; // Número introducido por el usuario.
		int contadorPrimos = 0; // Las vueltas que da por cada número y comprobar si es primo.
		boolean primo = true; // Sirve para identificar si es primo o no.

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número "n".
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();

		for (int i = num; i > 1; i--) {
			primo = true;
			for (int j = i - 1; j >= 2; j--) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo != false) {
				System.out.println(i + " es primo.");
				contadorPrimos++;
			}
		}

		System.out.println("Hay " + contadorPrimos + " numeros primos.");

	}

}
