package s004_EjerciciosVarios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int valor1 = 0;
		int valor2 = 0;
		int suma = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Introduce un entero: ");
			valor1 = sc.nextInt();

			System.out.println("Introduce otro entero: ");
			valor2 = sc.nextInt();

			suma = valor1 + valor2;
			System.out.println("Suma " + suma);

		} catch (InputMismatchException e) {
			System.err.println("No has introducido un entero");

			sc.close();
		}
	}
}
