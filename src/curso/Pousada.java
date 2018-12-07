package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.Locacao;

public class Pousada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Locacao[] ocupa = new Locacao[10];
		
				
		char resp = 's';
		do {
		
			System.out.print("Entre com o Nome: ");
			String nome = sc.nextLine();

			System.out.print("Entre com o email: ");
			String email = sc.nextLine();
		
			System.out.print("Escolha o quarto 0 a 9: ");
			int quarto = sc.nextInt();
		
			ocupa[quarto] = new Locacao(nome,email,quarto);
			
			System.out.print("Deseja Cadastrar outro? ");
			resp = sc.next().charAt(0);
			sc.nextLine();
			
		} while (resp != 'n');
		
		for (int i=0; i<ocupa.length; i++)
		if (ocupa[i] != null) {
			System.out.println("Quarto: " + i + ocupa[i]);
		}
		
		sc.close();
	}
}

			
	
		
	


