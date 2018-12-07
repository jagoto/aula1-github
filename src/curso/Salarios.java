package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcSalario;

public class Salarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalcSalario calc = new CalcSalario();
		
		
		System.out.println("Digite o Nome Salario Bruto e Impostos: ");
		calc.nome = sc.nextLine();
		calc.salarioBruto = sc.nextDouble();
		calc.impostos = sc.nextDouble();
		
		calc.salarioLiquido();
		System.out.println();
		System.out.println("Salario Liquido: " + calc);

		
		System.out.println("Informe o percentual de aumento do Salario: " );
		double aumento = sc.nextDouble();
		
		calc.aumentoSalario(aumento);
		
		System.out.println();
		System.out.println("Salario Liquido Atualizado:  " + calc);
		
		sc.close();

	}

}
