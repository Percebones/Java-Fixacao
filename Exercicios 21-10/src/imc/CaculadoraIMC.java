package imc;

import java.util.Scanner;

public class CaculadoraIMC {

	public static void main(String[] args) throws Exception {

		float peso = 0;
		float altura = 0;
		float imc = 0;
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Informe seu peso Ex: 90,0");
			peso = entrada.nextFloat();

			System.out.println("Informe sua altura Ex: 1,70");
			altura = entrada.nextFloat();
		} catch (Exception e) {
			System.out.println("Formato Inserido errado");
			throw new Exception();
		}
		entrada.close();

		try {
			imc = (float) (peso / (Math.pow(altura, 2)));
		} catch (Exception e) {
			System.out.println("Calculo deu erro");
			throw new Exception();
		}

		System.out.println("IMC: " + imc);
		if (imc <= 18.5) {
			System.out.println("Peso: Abaixo do Normal");
		} else if (imc >= 18.6 & imc < 24.9) {
			System.out.println("Peso: Normal");
		} else if (imc >= 25.0 & imc <= 29.9 ) {
			System.out.println("Peso: Sobrepeso");
		}else if (imc >= 30.0 & imc <= 34.9 ) {
			System.out.println("Peso: Obesidade I");
		}else if (imc >= 35.0 & imc <= 39.9 ) {
			System.out.println("Peso: Obesidade II");
		}else if (imc >= 40.0 ) {
			System.out.println("Peso: Obesidade III");
		}

	}

}
