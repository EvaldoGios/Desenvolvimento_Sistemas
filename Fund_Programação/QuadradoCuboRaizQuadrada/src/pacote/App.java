package pacote;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		double raiz;
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			raiz = Math.sqrt(numero);
			
			if (numero <= 0) {
				System.out.println("Erro!!! Precisa ser maior que 0!!!\n");
			} else {
				System.out.println("Valor digitado: " + numero);
				System.out.println("Quadrado do número: " + (numero * numero));
				System.out.println("Cubo do número: " + (numero * numero * numero));
				System.out.println("Raiz quadrada do número: " + Math.round(raiz));
			}
		} while (numero > 0);

	}

}
