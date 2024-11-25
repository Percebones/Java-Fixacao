package veiculoAcelera;

public class Moto implements Veiculo {

	@Override
	public void acelerar() {
		System.out.println("A moto esta acelerando");
	}

	@Override
	public void frear() {
		System.out.println("A moto esta freiando");
	}

}
