package moedas;

import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {

		double valor;
		double dolar;
		double valorConvertido;
		Scanner a = new Scanner(System.in);
		System.out.println("Quanto esta o dolar? Ex: 5,69");
		dolar = a.nextDouble();
		System.out.println("Quanto quer converter Ex: 30,0");
		valor = a.nextDouble();
		
		valorConvertido = valor / dolar;
		System.out.println("Valor em dolar: " + valorConvertido);
		
	}

}
