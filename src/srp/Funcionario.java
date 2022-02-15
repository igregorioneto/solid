package srp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double salario;
	private Connection connection;
	
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

	public Double calculaSalario() {
		return this.salario - (this.salario * 0.225);
	}
	
	public void salva() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa?useSSL=false", "root", ""); 
		Statement stmt = this.connection.createStatement();
		String sql = "insert into funcionario (id, nome, salario) values (" + this.id + "," +
				this.nome + "," + this.salario + ")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			System.out.println("Funcionario inserido com sucesso.");
		}else if (rs == 0){
			System.out.println("Nenhum funcionario inserido.");
		}
	}
	

}
