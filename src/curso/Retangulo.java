package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.CalcRetangulo;

public class Retangulo {
	static double base;
	static double altura;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CalcRetangulo calc  = new CalcRetangulo();
		System.out.print("Entre com as medidas do Retangulo: Base e Altura: ");
		calc.base = sc.nextDouble();
		calc.altura = sc.nextDouble();
		
		System.out.println("Area do Retangulo: " + calc.area());
		
		System.out.println("Perimetro do Retangulo: " + calc.perimetro());
		
		System.out.println("Diagonal do Retangulo: " + calc.diagonal());
			
	
		sc.close();

	}

}
