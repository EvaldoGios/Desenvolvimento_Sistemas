package pacote;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		do {
			System.out.println("Digite um nome: ");
			nome = input.nextLine();
			
			nomes.add(nome);
			
			System.out.println("Deseja adicionar outro nome? (s/n): ");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println();
		System.out.println("Nomes cadastrados: ");
		
		for (String nomeCadastrado : nomes) {
			System.out.println(nomeCadastrado);
		}
		
		input.close();
	}

}
