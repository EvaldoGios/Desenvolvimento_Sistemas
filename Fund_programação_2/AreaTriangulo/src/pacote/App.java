package pacote;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;
		
		do {
            System.out.print("Digite a base do triângulo: ");
            base = leia.nextDouble();

            System.out.print("Digite a altura do triângulo: ");
            altura = leia.nextDouble();

            if (base <= 0 || altura <= 0) {
                System.out.println("Erro! A base e a altura devem ser maiores que zero.");
                System.out.println("Digite os valores novamente.\n");
            }

        } while (base <= 0 || altura <= 0);

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

	}

}
