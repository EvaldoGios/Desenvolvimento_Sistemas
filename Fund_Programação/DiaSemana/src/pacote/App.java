package pacote;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Digite um numero da semana: ");
			numero = leia.nextInt();
			
			if (numero < 1 || numero > 7) {
				System.out.println("Semana é de 1 a 7 dias pae");
			}
		} while (numero < 1 || numero > 7);
		
		
		
		switch (numero) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terça");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6: 
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Semana tem 7 dias pae");
		}

	}

}
