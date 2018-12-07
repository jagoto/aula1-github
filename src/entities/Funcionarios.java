package entities;

public class Funcionarios {
	private Integer codigo;
	private String nome;
	private Double salario;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(Integer codigo, String nome, Double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentoSalario(double percent) {
		salario += salario * percent / 100;
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public String toString() {
		return "[codigo=" 
				+ codigo 
				+ ", nome=" 
				+ nome 
				+ ", salario=" 
				+ salario + "]";
	}
	
	
	
}
