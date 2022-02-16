package ocp;

public class TesteOCP {

	public static void main(String[] args) {
		
		TabelaDePreco tabela1 = new TabelaDePrecoAVista();
		ServicoDeFrete entrega1 = new Frete();
		
		 CalculadoraDePrecos calculadora1 = new CalculadoraDePrecos(tabela1, entrega1);
		 double preco1 = calculadora1.calcula(new Produto("Notebook", 1200.0, "minas gerais"));
		 
		 System.out.println(preco1);
		 
		 TabelaDePreco tabela2 = new TabelaDePrecoAPrazo();
		 ServicoDeFrete entrega2 = new Frete();
		 
		 CalculadoraDePrecos calculadora2 = new CalculadoraDePrecos(tabela2, entrega2);
		 double preco2 = calculadora2.calcula(new Produto("Monitor 21'", 719.0, "sao paulo"));
		 
		 System.out.println(preco2);
	}

}
