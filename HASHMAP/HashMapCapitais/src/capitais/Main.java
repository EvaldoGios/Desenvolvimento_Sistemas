package capitais;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> capitais = new HashMap<>();
		
		Scanner leia = new Scanner(System.in);
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		
		System.out.println("Digite um nome de Estado: ");
		String nomeEstado = leia.nextLine();
		
		if (capitais.containsKey(nomeEstado)) {
			String nome = capitais.get(nomeEstado);
			System.out.println("Estado encontrado: " + nome);
		} else {
			System.out.println("Estado não encontrado.");
		}
		
		leia.close();

	}

}
