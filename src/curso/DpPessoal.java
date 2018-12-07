package curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class DpPessoal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> func = new ArrayList<>();
		
			
		System.out.println("Informe a quantidade de Funcionarios para cadastrar: ");
		int qt = sc.nextInt();
		
		for (int i=1; i<=qt; i++) {
			System.out.println("Funcionario #" + i +": ");
			sc.nextLine();
			System.out.print("Codigo: ");
			int codigo = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			func.add(new Funcionarios(codigo, nome, salario));
		}
		
		
		System.out.println(func);
		System.out.println("-------------------------------------");
		
		System.out.println("Informe o codigo do Funcionario que recebera aumento de salario: ");
		int codigo = sc.nextInt();
		
		Funcionarios lista = func.stream().filter(x -> x.getCodigo() == codigo).findFirst().orElse(null);
		if (lista == null) {
			System.out.println("Funcionario Inexistente!");
		}
		else {
			System.out.print("Informe o percentual: ");
			double percent = sc.nextDouble();
			lista.aumentoSalario(percent);
		}
		
		System.out.println();
		System.out.println("Relação de Funcionarios:");
		for (Funcionarios obj : func) {
			System.out.println(obj);
		}
		
		
		
		
		sc.close();
	}
}
		



