public class Principal {
	public static void main (String [] args) {
		Leao x = new Leao ();
		Urso y = new Urso ();
		Urso z = new Urso ();
		Tigre t = new Tigre();
		x.setNome("Simba");
		y.setNome("Balu");
		z.setNome("Zé Colméia");
		t.setNome("Richard Parker");
		System.out.println(x.equals(y));
		System.out.println(y.equals(z));
		x.rugir();
		z.encontrarLeonardo();
	}
}

public class Leao extends Animal {
	public void rugir () {
		System.out.println(getNome() + " rugiu!");
}

public class Urso extends Animal {
	public void encontrarLeonardo () {
		System.out.println(getNome () + " encontrou o Leonardo DiCaprio!");
}

public class Tigre extends Animal {
	
}

public class Arara extends Animal {
	
}

public class Animal {
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	private double tamanho;
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
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
}
