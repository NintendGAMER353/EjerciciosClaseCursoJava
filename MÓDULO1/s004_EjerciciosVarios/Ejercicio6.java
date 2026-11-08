package s004_EjerciciosVarios;

public class Ejercicio6 {
	public static void main(String[] args) {
		int suma = 0;
		int i = 1;

		while (i <= 10) {
			suma += i;
			i++;
		}

		System.out.println("La suma de los 10 primeros números es de " + suma);
	}
}
