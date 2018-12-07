package entities;

public class ContaCorrente {

	
	private int conta;
	private String nome;
	private double saldo;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(int conta, String nome, double saldo) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public ContaCorrente(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double valorSaque) {
		this.saldo -= valorSaque + 5.00;
		
	}

	public int getConta() {
		return conta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	public String toString() {
		return "Conta: "
				+conta
				+". Nome: "
				+nome
				+", Saldo: $ "
				+String.format("%.2f", saldo);
	}
}
