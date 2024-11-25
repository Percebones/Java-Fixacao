package listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterador {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(5);
		lista.add(3);
		lista.add(12);
		lista.add(10);
		lista.add(19);

		Iterator<Integer> it = lista.iterator();
        
		
		while (it.hasNext()) {
			int numero = it.next();
			if (numero < 10) {
				System.out.println(numero + " Removido");
				it.remove();
		}
		
		
		}
		System.out.println();
		for (Integer integer : lista) {
			System.out.println(integer + " Ficou");
		}
	}

}
