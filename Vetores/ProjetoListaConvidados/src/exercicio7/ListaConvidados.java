package exercicio7;

import java.util.Scanner;
import java.util.ArrayList;

public class ListaConvidados {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> convidados = new ArrayList<>();
		
		int opcao;
		
		
		do {
			
			System.out.println(" 1- Adicionar convidado\n "
					+ "2- Alterar Convidado\n "
					+ "3- Remover convidado\n "
					+ "4- Procurar Convidado\n "
					+ "5- Exibir Convidados\n "
					+ "6- Encerrar");
			
			opcao = Integer.parseInt(leia.nextLine());
			
			switch (opcao) {
			case 1:
				System.out.println("Nome do Convidado: ");
				String nome = leia.nextLine();
				
				convidados.add(nome);
				break;
				
			case 2:
				System.out.println("Posição do convidado: ");
				int posicao = Integer.parseInt(leia.nextLine());
				
				System.out.println("Nome do convidado: ");
				String novoNome = leia.nextLine();
				
				convidados.set(posicao, novoNome);
				break;
				
			case 3:
				System.out.println("Nome do convidado: ");
				String nomeRemover = leia.nextLine();
				
				if (convidados.contains(nomeRemover)) {
					convidados.remove(nomeRemover);
				} else {
					System.out.println("Não encontrado");
				}
				break;
				
			case 4:
				System.out.println("Nome para procurar: ");
				String nomeProcurado = leia.nextLine();
				
				int posicaoEncontrada = convidados.indexOf(nomeProcurado);
				
				if (posicaoEncontrada >= 0) {
					System.out.println("Posição: " + posicaoEncontrada);
				} else {
					System.out.println("Não encontrado");
				}
				break;
			
			case 5:
				for (String convidado : convidados) {
					System.out.println(convidado);
				}
				break;
					
			case 6:
				System.out.println("Programa encerrado.");
				break;
				
			default:
				System.out.println("Opção inválida!!!");
			}
			
		} while (opcao != 6);

	}

}
