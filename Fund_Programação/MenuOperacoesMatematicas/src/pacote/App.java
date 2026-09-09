package pacote;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, opcao;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("\n1 = Calcular média");
		System.out.println("2 = Subtrair o menor número do maior");
		System.out.println("3 = multiplicar os números");
		System.out.println("4 = Dividir o primeiro número pelo segundo");
		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Média: " + (numero1 + numero2) / 2);
			break;
		case 2:
			if (numero1 > numero2) System.out.println(numero1 - numero2);
			 else System.out.println("Subtração: " + (numero2 - numero1));
			break;
		case 3:
			System.out.println("Multiplicação: " + (numero1 * numero2));
			break;
		case 4:
			if (numero2 != 0) System.out.println("Divisão: " + (numero1 / numero2));
			break;
		default:
			System.out.println("Opção Inválida!!!");
		}

	}

}
