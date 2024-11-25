package leitorDados;

import java.util.Scanner;

public class Leitor {

	public static void main(String[] args) {
		String nome;
		int idade;
		float altura;
		boolean cnh = false;
		Scanner a = new Scanner(System.in);

		System.out.println("Insira seu nome");
		nome = a.next();

		System.out.println("Insira idade");
		idade = a.nextInt();

		System.out.println("Insira sua altura");
		altura = a.nextFloat();

		System.out.println("Tem cnh? Sim ou Não");
		String c = a.next();
		
		if (c.contains("Sim") || c.contains("sim") ) {
			cnh = true;
		} else {
			cnh = false;
		}
		
		System.out.println(
				"\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nCNH: " + (cnh ? "Possui" : "Não Possui"));

	}

}
