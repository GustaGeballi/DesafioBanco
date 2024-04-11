package conta;

import java.util.Random;
import cliente.Cliente;

public abstract class Conta implements InterConta{ //abstract para impedir que o usuario crie uma nova conta sem definir qual tipo de conta

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	Random random = new Random();
	
	private static final int AGENCIA_PADRAO = 1000;
	private static int SEQUENCIAL = 1000;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public void depositar(double valor){
		saldo += valor;
	}

	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	

}
