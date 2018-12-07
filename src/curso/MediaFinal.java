package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class MediaFinal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Alunos aluno = new Alunos();
		
		System.out.println("Digite  Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite  Nota do trimestre 1: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Digite  Nota do trimestre 2: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Digite  Nota do trimestre 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Nome do Aluno: " + aluno.nome);
		System.out.println("Nota Final: " + String.format("%.2f",aluno.notaFinal));
		System.out.println(aluno.verify());
		System.out.println(aluno.gap);
		
		
/*		String ver = aluno.verify();
		
		if (ver = "APROVADO") {
				System.out.println(aluno.verify());
		}
		else	{
			System.out.println(aluno.verify());
		} */
}
		
}