package s004_EjerciciosVarios;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 4;

		while (num != 0) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();

			if (num < 0) {
				System.out.println("Número negativo");
			} else if (num > 0) {
				System.out.println("Número positivo");
			}
		}
		System.out.println("Cero");

		sc.close();

	}
}
