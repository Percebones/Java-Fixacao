package calculaArea;

public class Circulo implements Forma {
	int area;
	int raio;
	double pi = 3.14;

	public Circulo( int raio) {
		super();
		this.raio = raio;
	}

	public int calcularArea() {
		area = (int) (pi * (Math.pow(raio, 2)));
		return area;
	}

}
