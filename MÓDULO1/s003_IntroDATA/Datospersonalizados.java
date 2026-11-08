package s003_IntroDATA;

import java.util.Scanner;

public class Datospersonalizados {
	private static Scanner sc = new Scanner(System.in);
	private static String nombre = null;
	private static int edad = 0;
	private static double altura = 0;
	private final static double ALTURAMEDIA = 1.76;
	private static String asignatura = null;
	private static double nota = 0;

	private static void pedirDatos() {
		System.out.println("Introduce nombre");
		nombre = sc.nextLine();
		
		System.out.println("Introduce edad");
		edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduce altura");
		altura = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduce asignatura");
		asignatura = sc.nextLine();
		
		System.out.println("Introduce nota");
		nota = sc.nextDouble();
		
		sc.close();
	}

	private static void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		
		System.out.println("Edad: " + edad);

		System.out.println(edad >= 18 ? "Es mayor de edad" : "Es menor de edad");

		System.out.println("Altura: " + altura);

		System.out.println(altura > ALTURAMEDIA ? "Tienes una altura superior a la media" : "Tienes una altura menor a la media");

		System.out.println("Asignatura: " + asignatura);

		System.out.println("Nota: " + nota);

		System.out.println(nota >= 5 ? "Aprobado" : "Suspenso");
	}

	public static void main(String[] args) {
		pedirDatos();
		mostrarDatos();
	}

}
