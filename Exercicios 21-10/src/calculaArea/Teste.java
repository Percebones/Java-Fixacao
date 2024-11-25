package calculaArea;

public class Teste {

	public static void main(String[] args) {

		Circulo a = new Circulo(15);
		Retangulo b = new Retangulo(5,5);
		System.out.println("Area do Retangulo " + b.calcularArea());
		System.out.println("Area do Circulo " +a.calcularArea());
	}

}
