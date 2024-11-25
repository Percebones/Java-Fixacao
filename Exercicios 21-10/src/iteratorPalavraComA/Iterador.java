package iteratorPalavraComA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterador {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Abacaxi");
		lista.add("Abacate");
		lista.add("Carro");
		lista.add("Predio");
		lista.add("Moto");
		Iterator<String> it = lista.iterator();
		
		System.out.println("Lista antes da remocao");
		for (String item : lista) {
            System.out.println(item);
        }
		System.out.println();
		
		while (it.hasNext()) {
			String palavra = it.next();
			if (palavra.startsWith("A") || palavra.startsWith("a")) {
				System.out.println(palavra + " Removida");
				it.remove();
			}
		}
		System.out.println();
		System.out.println("Lista pós remocao");
		for (String item : lista) {
            System.out.println(item);
        }
	}

}
