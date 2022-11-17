package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		/**
		 * las pruebas realizadas son: 5, 3, 7, 25, 10, 0 ---> 5 numeros, 2 fallos
		 */
		int num;// Es el número introducido por el usuario.
		int contNum = 0; // Cuenta los numeros introducidos
		int contFi = 0; // Cuenta los fallos, osea los numeros mas pequeños
		int limite; // Se le asigna el ultimo numero introducido como limite

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número.
		System.out.println("Introduzca un numero:");
		num = sc.nextInt();

		// Asignamos como limite el número.
		limite = num;

		// Mientras sea distinto de cero se seguira pidiendo un número.
		while (num != 0) {
			// Se aumenta el contador por cada numero introducido que no sea 0
			contNum++;
			// Si el nuevo numero es menor al anterior se dira que es un error y se aumenta
			// el contador
			if (num < limite) {
				System.out.println("El numero es menor.");
				contFi++;
			}
			// Se asigna el nuevo numero como limite y se pide otro
			limite = num;
			System.out.println("Introduzca un numero:");
			num = sc.nextInt();
		}
		System.out.println("El total de numeros introducidos es " + contNum);
		System.out.println("El total de fallos es " + contFi);
		sc.close();
	}
}
