package exceçãoPersonalizada;

public class Conta {
	double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void saque(double valor) throws SaldoInsuficienteException {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de " + valor + " Realizado" );
		} else {
			throw new SaldoInsuficienteException("Saldo Incificiente");
		}
	}

}
