package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio04 {

	public static void main(String[] args) {
		int num1;// guardamos el primer numero
		int num2; // guardamos el segundo numero
		int numMenor;// guardaremos el menor de ambos numeros
		int numMayor; // guardaremos el mayor de ambos numeros
		int mcd = 0; // guardamos el maximo comun divisor

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);
		// le pedimos al usuario que introduzca dos números dos numeros
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();

		// Comprobamos que no son identicos
		if (num1 == num2) {
			System.out.println("Los números no pueden ser iguales.");
		} else {
			// Comprobamos cual de los numeros es el mayor y cual el menor.
			if (num1 < num2) {
				numMenor = num1;
				numMayor = num2;
			} else {
				numMenor = num2;
				numMayor = num1;
			}
			//
			for (int i = numMenor; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					if (i % j == 0 && numMayor % j == 0) {
						mcd = j;
						break;
					}
				}
				break;
			}
			System.out.println("El Máximo Común Divisor es " + mcd);
		}
		sc.close();
	}

}
