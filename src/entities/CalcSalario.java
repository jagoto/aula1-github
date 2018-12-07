package entities;

public class CalcSalario {
	public String nome;
	public double salarioBruto;
	public double impostos;

	
	public double salarioLiquido() {
		return salarioBruto - impostos;
	}
	
	public void aumentoSalario(double aumento) {
		salarioBruto += (salarioBruto * aumento/100);
	}
	
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());

	}
	
	}
	
	
