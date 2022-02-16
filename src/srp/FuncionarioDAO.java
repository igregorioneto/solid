package srp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO {
	
	public void salva(Funcionario funcionario) throws Exception {
		ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
		connectionDAO.setDbms("mysql");
		connectionDAO.setServerName("localhost");
		connectionDAO.setPortNumber("8080");
		connectionDAO.setDbName("mock");
		
		try(
			Connection connection = connectionDAO.createConnection();
			Statement stmt = connection.createStatement();
			) {
			
			String sql = "insert into funcionario (id, nome, salario) values (" + funcionario.getId() + "," +
					funcionario.getNome() + "," + funcionario.getSalario() + ")";
			
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			throw new SQLException(e);
		}
	}

}
