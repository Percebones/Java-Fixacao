package arraySomas;

public class Arrays {

	public static void main(String[] args) {
		int soma = 0;
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

		for (int i : numeros) {
			soma = soma +  numeros[i - 1];
			System.out.println("Soma: " + soma);
		}
	}

}
