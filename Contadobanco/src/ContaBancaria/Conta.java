package ContaBancaria;

public class Conta {
	
	private int numero;
	private String nome_titular;
	private double saldo;
	
	public Conta() {
		this.nome_titular = "Sem Nome";
		this.numero = 000;
		this.saldo = 0.0;
	}
	
	public Conta(String n, int num, double v) {
		this.nome_titular = n;
		this.numero = num;
		this.saldo = v;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("\n\nDepósito REALIZADO com sucesso!");
		System.out.printf("\nCliente: %s", this.nome_titular);
		System.out.printf("\nSaldo atual: %.2f", this.saldo);
	}
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			System.out.println("\n\nSaque NÃO REALIZADO!");
			System.out.println("Saldo insuficiente!");
			System.out.printf("\nCliente: %s", this.nome_titular);
			System.out.printf("\nSaldo atual: %.2f", this.saldo);
			return false; // saldo insuficiente
		}else {
			this.saldo = this.saldo - valor;
			System.out.println("\n\nSaque REALIZADO com sucesso!");
			System.out.printf("\nCliente: %s", this.nome_titular);
			System.out.printf("\nSaldo atual: %.2f", this.saldo);
			return true;			
		}
	}
	
	
	public void imprimeDados() {
		System.out.printf("\n\nDADOS DO CLIENTE %s", this.getNome_Titular());
		System.out.printf("\nNUMERO DA CONTA: %d", this.getNumero());
		System.out.printf("\nSaldo: %.2f", this.getSaldo());
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNome_Titular(String nome) {
		this.nome_titular = nome;
	}
	public String getNome_Titular() {
		return this.nome_titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
