package projeto_do_banco;

public class Main {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		System.out.println("depósito na conta corrente");
		conta.depositar(100);
		System.out.println(conta.getSaldo());
		Conta conta2 = new ContaPoupanca();
		conta.transferir(conta.getSaldo(), conta2);
		System.out.println("saldo depois da tranferencia");
		System.out.println(conta.getSaldo());
		System.out.println("saldo conta poupança depois da transferencia");
		System.out.println(conta2.getSaldo());
		conta.extrato();
		conta2.extrato();

	}

}
