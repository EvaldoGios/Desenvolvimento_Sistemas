package academia;

public class Principal {

	public static void main(String[] args) {
		
		AlunoAcademia aluno1 = new AlunoAcademia("Ana", 17, 60, 1.65);
		AlunoAcademia aluno2 = new AlunoAcademia("Bruno", 25, 80, 1.80);
		
		aluno1.exibirDados();
		
		System.out.println();
		
		aluno2.exibirDados();
		
		aluno2.peso = 78;
		
		System.out.println();
		
		aluno2.exibirDados();

	}

}
