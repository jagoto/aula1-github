package entities;

public class Alunos {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double gap;
	public double notaFinal;
	
	
	public String verify() {
		notaFinal = nota1 + nota2 + nota3;
		if (notaFinal < 60) {
			gap = 60 - notaFinal;
			return "REPROVADO";
		}
		else	{
			return "APROVADO";
		}
			
	}
	
}
