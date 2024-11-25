package produtoNaoEncontrado;

import java.util.HashMap;
import java.util.Map;

public class BuscaProduto {

	Map<Integer, String> produtos;

	public static void main(String[] args) {
		BuscaProduto sistema = new BuscaProduto();
		sistema.SistemaBuscaProduto();
		try {
			System.out.println(sistema.buscarProduto(1));
			System.out.println(sistema.buscarProduto(4));
		} catch (ProdutoNaoEncontradoException e) {
			System.err.println(e.getMessage());
		}
	}

	void SistemaBuscaProduto() {
		produtos = new HashMap<>();

		produtos.put(1, "Notebook");
		produtos.put(2, "Smartphone");
		produtos.put(3, "Fone de Ouvido");
	}

	private String buscarProduto(int i) throws ProdutoNaoEncontradoException {
		if (!produtos.containsKey(i)) {
			throw new ProdutoNaoEncontradoException("Produto de Id " + i + " Não Encontrado");
		}
		return "Produto \"" + produtos.get(i) + "\" de Id " + Integer.toString(i) + " Encontrado" ;
	}

}
