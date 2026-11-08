package s004_EjerciciosVarios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		String texto = sc.nextLine();
		int num = Integer.parseInt(texto);

		if (num % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		sc.close();
	}
}
