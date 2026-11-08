package s004_EjerciciosVarios;

public class Ejercicio5 {
	public static void main(String[] args) {
		System.out.println("------  TABLA DEL 5 ------");

		int n = 5;
		int[] resultados = new int[11];
		for (int i = 0; i < 11; i++) {
			resultados[i] = n * i;
			System.out.println(resultados[i]);
		}
	}
}
