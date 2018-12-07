package entities;

public class Locacao {
	private String nome;
	private String email;
	private int quarto;
	
	public Locacao(String nome, String email, int quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String toString() {
		return "Locacao [nome=" + nome + ", email=" + email + "]";
	}
	
	
	 
}
