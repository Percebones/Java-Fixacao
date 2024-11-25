package calculaArea;

public class Retangulo implements Forma {
	int area;
	int lado;
	int altura;

	
	
	
	public Retangulo(int lado, int altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}




	@Override
	public int calcularArea() {
		area = lado * altura;
		return area;
	}

}
