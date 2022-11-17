package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio010 {

	public static void main(String[] args) {
		/**
		 * las prueabas realizadas son: 12321 ---> es capicua 12345 ---> no es capicua
		 */
		int num; // Guardaremos el número para despues compararlo con el inverso
		int aux; // Le asignamos el valor de n e iremos modificandolo para pasarle las cifras el
					// inverso
		int cifra; // Guardamos cada cifra que le vamos quitando al aux
		int inverso = 0; // Iremos introduciendo el valor de n cifra por cifra desde atras hacia delante

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número.
		System.out.println("Introduzca un numero:");
		num = sc.nextInt();

		// Le asignamos a aux el valor de n para no modificarlo directamente en n y
		// perderlo
		aux = num;
		// Mientras el numero no se quede sin cifras, osea valga 0, irle
		// asignando a cifra la ultima cifra del numero e interoduciendola en la
		// variable inverso
		while (aux != 0) {
			cifra = aux % 10;
			aux /= 10;
			inverso = (inverso * 10) + cifra;
		}
		// Comparar ambas variables para saber si el número es capicua
		if (inverso == num) {
			System.out.println("El numero es capicua.");
		} else {
			System.out.println("El numero no es capicua.");
		}
		sc.close();
	}

}
