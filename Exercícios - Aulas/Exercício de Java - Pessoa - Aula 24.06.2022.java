public class Principal {
	public static void main (String [] args) {
		Pessoa p1 = new Pessoa ("Gabriel", 18);
		System.out.println("Nome da pessoa: " + p1.getNome() + "\nIdade da pessoa: " + p1.getIdade());
		p1.setNome ("Marcelo");
		System.out.println("Nome da pessoa: " + p1.getNome() + "\nIdade da pessoa: " + p1.getIdade());
	}
}

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa () {
	}
	
	public Pessoa (String N, int A) {
		System.out.println("Criando um objeto da classe 'Pessoa'...");
		setNome(N);
		setIdade(A);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Alterando/Inserindo o nome da pessoa para " + nome + "...");
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		System.out.println("Alterando/Inserindo a idade da pessoa para " + idade + "...");
		this.idade = idade;
	}

}
