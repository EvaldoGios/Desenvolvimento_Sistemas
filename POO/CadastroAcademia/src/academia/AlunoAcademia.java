package academia;

public class AlunoAcademia {
	
	String nome;
	int idade;
	double peso;
	double altura;
	
	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	boolean ehMenorDeIdade() {
		return this.idade < 18;
	}
	
	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}
	
	void exibirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Peso: " + this.peso);
		System.out.println("Altura: " + this.altura);
		
		if (ehMenorDeIdade() == false) {
			System.out.println("Tem direito a desconto? Não");
		} else {
			System.out.println("Tem direito a desconto? Sim");
		}
		
		System.out.println("IMC: " + calcularIMC());
	}

}
