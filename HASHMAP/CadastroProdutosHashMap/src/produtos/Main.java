package produtos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Integer, Produto> produtos = new HashMap<>();
		
		Scanner leia = new Scanner(System.in);
		
		produtos.put(1, new Produto (
			"Macaxeira", 14.25, 67));
		
		produtos.put(2, new Produto (
				"Tung Tung", 67.69, 14));
		
		produtos.put(3, new Produto (
				"Farmei Aura", 66.66, 96));
		
		produtos.put(4, new Produto (
				"Aura+Ego", 77.77, 3));
		
		for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
			System.out.println("Código: " + entry.getKey() + " | ");
			entry.getValue().exibir();
		}
		
		System.out.println("\nDigite um código de usuário: ");
		int codigo = leia.nextInt();
		
		if (produtos.containsKey(codigo)) {
			Produto produtoEncontrado = produtos.get(codigo);
			
			System.out.println("Nome: " + produtoEncontrado.getNome());
			System.out.println("Preco: " + produtoEncontrado.getPreco());
			System.out.println("Quantidade: " + produtoEncontrado.getQuantidade());
		} else {
			System.out.println("Produto não encontrado.");
		}
		
		leia.close();

	}

}
