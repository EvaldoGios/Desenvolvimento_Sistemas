package pacote;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		while (numero > 0) {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			System.out.println("Valor digitado: " + numero);
			System.out.println("Quadrado do número: " + (numero * numero));
			System.out.println("Cubo do número: " + (numero * numero * numero));
			System.out.println("Raiz quadrada do número: ");
		}

	}

}
