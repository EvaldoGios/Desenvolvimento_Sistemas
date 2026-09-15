package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> tarefas = new ArrayList<>();
		
		String tarefa;
		String continuar;
		int contador = 0;
		
		do {
			System.out.println("Digite uma tarefa: ");
			tarefa = leia.nextLine();
			
			tarefas.add(tarefa);
			
			contador++;
			
			System.out.println("Deseja adicionar outra tarefa? (s/n)");
			continuar = leia.nextLine();		
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println();
		System.out.println("Tarefas cadastradas: ");
		
		for (String tarefaCadastradas : tarefas) {
			System.out.println(tarefaCadastradas);
		}
		
		System.out.println();
		System.out.println("Tarefas Cadastadas: " + contador);
		
		leia.close();
		
	}

}
