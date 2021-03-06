import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta b = new Conta();
		Scanner leitor = new Scanner (System.in);
		c.criar (c);
		b.criar(b);
		c.transferir(c,b);
		System.out.println("Quanto quer sacar?\n");
		double valor = leitor.nextDouble();
		if (c.sacar(valor)) {
			System.out.println("Liberando " + valor + "R$\n");
		}
		else {
			System.out.println("Saldo insuficiente.\n");
		}
	}
}
public class Conta {
	private String nomeCliente;
	private double saldo;
	private Scanner leitor = new Scanner (System.in);
	public boolean sacar (double valor) {
		if (valor > saldo) {
			return false;
		}
		else {
			saldo = saldo - valor;
			return true;
		}
	}
	public void depositar (double valor) {
		saldo += valor;
	}
	public void criar (Conta c) {
		System.out.println("Insira o nome.\n");
		c.nomeCliente = leitor.nextLine();
		System.out.println("Insira o saldo.\n");
		c.saldo = leitor.nextDouble();
	}
	public void transferir (Conta c, Conta b) {
		System.out.println("Quanto " + c.nomeCliente + " deseja transferir para " + b.nomeCliente + "?");
		double transferencia = leitor.nextDouble();
		c.saldo = c.saldo - transferencia;
		b.saldo = b.saldo + transferencia;
		System.out.println("Saldo da conta de " + c.nomeCliente + ": " + c.saldo + "\nSaldo da conta de " + b.nomeCliente + ": " + b.saldo);
	}
}
