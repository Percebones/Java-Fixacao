package exceçãoPersonalizada;

public class Teste {

	public static void main(String[] args) {

		Conta a = new Conta(1000.00);
		
		try {
			a.saque(1000.00);
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
		
	}

}
