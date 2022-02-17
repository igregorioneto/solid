package isp;

public class TesteISP {

	public static void main(String[] args) {

		Vendedor vendedor = new Vendedor(3000, 52);
		System.out.println(vendedor);
		
		Funcionario desenvolvedorSoftware = new Desenvolvedor("Mariana", 4000);
		System.out.println(desenvolvedorSoftware);

	}

}
