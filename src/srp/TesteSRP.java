package srp;

import java.sql.SQLException;

import org.mockito.Mockito;

public class TesteSRP {

	public static void main(String[] args) throws SQLException {
		
		FuncionarioDAO daoFalso = Mockito.mock(FuncionarioDAO.class);
		
		Funcionario funcionario = new Funcionario(1, "Mariana", 4000, Cargo.DESENVOLVEDOR_SENIOR);

		double salarioCalculado = funcionario.calculaSalario();
		
		daoFalso.salva(funcionario);
	}

}
