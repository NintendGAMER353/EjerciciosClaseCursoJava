package s004_EjerciciosVarios;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado = 0;
		double area = 0;

		System.out.println("Introduce el valor del lado");
		lado = sc.nextDouble();

		while (lado <= 0) {
			System.out.println("Valor no válido. Introduce un valor positivo");
			lado = sc.nextDouble();
		}

		System.out.println("");
		area = lado * lado;
		System.out.println("El área del cuadrado es de " + area + " centímetros");

		sc.close();

	}
}
