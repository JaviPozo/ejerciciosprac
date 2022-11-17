package ejerciciospracticos;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// Definimos las variables
		int segundos, minutos, horas;
		int incremento;
		int segundosTotal;
		
		// Creamos Scanner para que pueda leer el teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca las horas.
		System.out.println("Introduzca las horas: ");
		horas = sc.nextInt();

		// Le pedimos al usuario que introduzca los minutos
		System.out.println("Introduzca los minutos: ");
		minutos = sc.nextInt();

		// Le pedimos al usuario que introduzca los segundos
		System.out.println("Introduzca los segundos: ");
		segundos = sc.nextInt();

		// Le pedimos al usuario que introduzca el incremento en segundos
		System.out.println("Introduzca el incremento de segundos: ");
		incremento = sc.nextInt();

		if (horas > 23 || minutos > 59 || segundos > 59 || horas < 0 || minutos < 0 || segundos < 0) {
		} else {
			segundosTotal = segundos + incremento;
			while (segundosTotal > 59) {
				segundosTotal -= 60;
				minutos++;
			}
			while (minutos > 59) {
				minutos = minutos - 60;
				horas++;

				if (horas > 23) {
					horas = 0;
				}
			}
			System.out.println(horas + ":" + minutos + ":" + segundosTotal);
		}

		// Cerramos el Scanner
		sc.close();

	}

}
