package s004_EjerciciosVarios;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		double area = 0;

		System.out.println("Introduce el valor de la base");
		base = sc.nextDouble();

		while (base <= 0) {
			System.out.println("Valor no válido. Introduce un valor positivo");
			base = sc.nextDouble();
		}

		System.out.println("Introduce el valor de la altura");
		altura = sc.nextDouble();

		while (altura <= 0) {
			System.out.println("Valor no válido. Introduce un valor positivo");
			altura = sc.nextDouble();
		}

		System.out.println("");
		area = base * altura;
		System.out.println("El área del rectángulo es de " + area + " centímetros");

		sc.close();
	}
}
