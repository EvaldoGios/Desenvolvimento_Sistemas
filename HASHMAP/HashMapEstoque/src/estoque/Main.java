package estoque;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Integer> estoque = new HashMap<>();
		
		Scanner leia = new Scanner(System.in);
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		for (Map.Entry<String, Integer> estq : estoque.entrySet()) {
			System.out.println("Produto: " + estq.getKey()
			+ " | Quantidade: " + estq.getValue()
			);
		}
		
		System.out.println("Digite o nome do Produto para mostrar a quantidade: ");
		String produtoQuantidade = leia.nextLine();
		
		if (estoque.containsKey(produtoQuantidade)) {
			int quantidade = estoque.get(produtoQuantidade);
			System.out.println("Quantidade em estoque: " + quantidade + "\n");
		} else {
			System.out.println("Produto não encontrado.\n");
		}
		
		estoque.put("Mouse", 14);
		
		estoque.remove("Notebook");
		
		for (Map.Entry<String, Integer> estq : estoque.entrySet()) {
			System.out.println("Produto: " + estq.getKey()
			+ " | Qauntidade: " + estq.getValue()
			);
		}
		
		leia.close();

	}

}
