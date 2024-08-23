
public class Main {
	
	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setNome("João");
		
		
		Conta corrente = new ContaCorrente(joao);
		corrente.depositar(1000);
		corrente.sacar(100);
		
		Conta poupanca = new ContaPoupanca(joao);
		
		corrente.transferir(300, poupanca);
		
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
		
}
}
