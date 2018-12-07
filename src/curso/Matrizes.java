package curso;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com o numero de Linas e Colunas da Matriz: ");
		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		
		int[] [] matriz = new int[linhas][colunas];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe o numero que deseja pesquisar: ");
		int num = sc.nextInt();
		int i = 0;
		int j = 0;
		for (i=0; i<matriz.length; i++) {
			System.out.println();
			for (j=0; j<matriz[i].length; j++) {
				
				if (matriz[i][j] == num) {
					System.out.println("Posição " + i +"," + j +":");
					if ((j-1) >= 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					} 
					if ((j+1) < colunas) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if ((i-1) >= 0) {
						System.out.println("Acima: " + matriz[i-1][j]);
					} 
					if ((i+1) < linhas) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
			}
		}
		
		
	}
	}
}
