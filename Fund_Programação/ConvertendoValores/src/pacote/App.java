package pacote;

public class App {

	public static void main(String[] args) {
		
		String numero1 = "10";
		String numero2 = "5";
		String preco = "12.50";
		
		System.out.println("Soma: ");
		System.out.println(numero1 + numero2);
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		System.out.println("Soma: ");
		System.out.println(n1 + n2);
		
		System.out.println("Subtração: ");
		System.out.println(n1 - n2);
		
		System.out.println("Multiplicação: ");
		System.out.println(n1 * n2);
		
		Double.parseDouble(preco);
		
		double precoConvertido = Double.parseDouble(preco);
		
		System.out.println("Preco original: ");
		System.out.println(preco);
		
		System.out.println("Preço aumento: ");
		System.out.println(precoConvertido + 5);

	}

}
