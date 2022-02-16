package srp;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	private Cargo cargo;
	
	public Funcionario() {}
	
	public Funcionario(Integer id, String nome, Double salario, Cargo cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
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

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}
	
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", cargo=" + cargo + "]";
	}

}
