package curso;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.conversorMoeda;

public class CompraDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a cotação do Dólar: ");
		double cotacao = sc.nextDouble();
		System.out.println("Entre com a quantidade de Dólares: ");
		double quant = sc.nextDouble();
		double valor = quant * cotacao;
		
		
		System.out.printf("Quantidade: %.2f%n", quant);
		System.out.printf("Cotação: %.2f%n", cotacao);
		System.out.printf("Quantidade: %.2f%n", conversorMoeda.dolarReal(valor));
		System.out.printf("IOF: %.2f%n", conversorMoeda.dolarReal(valor)-(quant * cotacao));
		sc.close();
	}
}
