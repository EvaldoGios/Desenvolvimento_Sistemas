package pacote;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = leia.nextInt();
		
		if (numero1 > 20) {
			System.out.println("Maior que 20");
		} else if (numero1 == 20) {
			System.out.println("Igual a 20");
		} else {
			System.out.println("Menor que 20");
		}
	}

}
