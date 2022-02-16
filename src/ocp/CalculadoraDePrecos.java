package ocp;

public class CalculadoraDePrecos {
	
	public double calcula(Produto produco) {
		Frete frete = new Frete();
		double desconto = 0d;
		
		switch(1) {
	        case 1:
	        	System.out.println("Venda à vista");
	        	TabelaDePrecoAVista tabela1 = new TabelaDePrecoAVista();
	        	desconto = tabela1.calculaDesconto(produto.getValor());
	        	break;
	        case 2:
	        	System.out.println("Venda à prazo");
	        	TabelaDePrecoAPrazo tabela2 = new TabelaDePrecoAPrazo();
	        	desconto = tabela2.calculaDesconto(produto.getValor());
	        	break;
	    }
		
		double valorFrete = frete.calculaFrete(produto.getEstado());
		return produto.getValor() * (1 - desconto) + valorFrete;
	}
}
