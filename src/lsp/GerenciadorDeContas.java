package lsp;

public class GerenciadorDeContas {

	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void rende(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa);
	}
	
	public void saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException("Saldo insuficiente.");
		}
	}
	
}
