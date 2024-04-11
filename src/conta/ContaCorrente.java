package conta;

import cliente.Cliente;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("--- Extrato da Conta Corrente ---");
		super.imprimirInfos();
		
	}

}
