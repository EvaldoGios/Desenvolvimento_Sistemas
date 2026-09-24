package pacote;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public ContaBancaria() {
		this.numeroConta = 0;
		this.nomeCliente = "";
		this.saldo = 0;
	}

	public int getNumeroConata() {
		return numeroConta;
	}

	public void setNumeroConata(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
	
	public void exibirDados() {
		System.out.println("Número da Conta: " + numeroConta);
		System.out.println("Nome: " + nomeCliente);
		System.out.printf("Saldo: %.2f%n", saldo);
	}
	
	public double depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return saldo;
		} else {
			System.out.println("Valor Inválido!!!");
			return saldo;
		}
	}
	
	public double sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo = saldo - valor;
			return saldo;
		} else {
			System.out.println("Valor Inválido!!!");
			return saldo;
		}
	}
	
	public double consultarSaldo() {
		System.out.println("Saldo dispinível: " + saldo);
		return saldo;
	}

}
