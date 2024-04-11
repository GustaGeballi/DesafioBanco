package app;

import conta.ContaCorrente;
import conta.Conta;
import conta.ContaPoupanca;
import cliente.Cliente;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Gustavo");
	
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
