package curso;

import java.util.Locale;
import java.util.Scanner;
import entities.ContaCorrente;

public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente cc;
		
		System.out.print("Entre com do numero da Conta: ");
		int conta = sc.nextInt();

		sc.nextLine();
		System.out.print("Entre com o Nome do Correntista: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja realizar um deposito inicial? (S/N) : ");
		char sn = sc.next().charAt(0);
		
		if (sn == 's') {
			System.out.print("Informe o valor do deposito inicial: ");
			double depIni = sc.nextDouble();
			cc =  new ContaCorrente(conta,nome,depIni);
		}
		else {
			cc = new ContaCorrente(conta,nome);
		}
		System.out.println("Conta Aberta com sucesso!");
		System.out.println("Dados da Conta:");
		System.out.println(cc);
		
		System.out.print("Ente com o valor do deposito: ");
		double deposito = sc.nextDouble();
		cc.deposito(deposito);
		System.out.println(cc);
		
		System.out.print("Ente com o valor do Saque: ");
		double valorSaque = sc.nextDouble();
		cc.saque(valorSaque);
		System.out.println(cc);
		
		sc.close();
				
	}

}
