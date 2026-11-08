package s004_EjerciciosVarios;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int n1 = 2;
		int n2 = 4;
		int resultado = 0;

		// Menú selección
		System.out.println(" ---- ELIGE UNA OPCIÓN ----");
		System.out.println(" 1 --> Suma");
		System.out.println(" 2 --> Resta");
		System.out.println(" 3 --> Multiplicación");
		System.out.println(" 4 --> División");
		System.out.println("");
		x = sc.nextInt();
		System.out.println("");

		switch (x) {
		case 1:
			resultado = n1 + n2;
			System.out.println("Suma: " + resultado);
			break;
		case 2:
			resultado = n1 - n2;
			System.out.println("Resta: " + resultado);
			break;
		case 3:
			resultado = n1 * n2;
			System.out.println("Multiplicación: " + resultado);
			break;
		case 4:
			resultado = n1 / n2;
			System.out.println("División : " + resultado);
			break;
		}

		sc.close();
	}
}
