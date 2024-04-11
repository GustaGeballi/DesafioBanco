package conta;

public interface InterConta{

	void transferir(double valor, Conta contaDestino);

	void depositar(double valor);
	
	void sacar(double valor);
			
	void imprimirExtrato();
	
}
