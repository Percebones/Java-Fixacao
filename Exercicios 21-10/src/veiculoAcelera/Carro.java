package veiculoAcelera;

public class Carro implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("O carro esta acelerando");
	}

	@Override
	public void frear() {
		System.out.println("O carro esta freiando");
	}

}
