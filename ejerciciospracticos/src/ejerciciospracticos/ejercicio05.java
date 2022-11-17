package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio05 {

	public static void main(String[] args) {
		int num1;// Las dos primeras variables son los número inroducidos por el ususario;
		int num2;
		int numMenor;
		int numMayor = 0;
		int mcm;

		// Creamos el Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca los dos números
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Los números no pueden ser iguales");
		} else {
			if (num1 < num2) {
				numMenor = num1;
				numMayor = num2;
			} else {
				numMenor = num2;
				numMayor = num1;
			}

			for (int i = numMenor; i >= 1; i--) {
				for (int j = i; j >= 1; j--) {
					if (i % j == 0 && numMayor % j == 0) {
						numMayor = j;
						break;
					}
				}
				break;
			}
			mcm = (num1 / numMayor) * num2;
			System.out.println("El Mínimo Común Múltiplo es " + mcm);
		}
		// Cerramos el Scanner
		sc.close();
	}

}
