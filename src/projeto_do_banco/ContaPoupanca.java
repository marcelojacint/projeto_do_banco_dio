package projeto_do_banco;

public class ContaPoupanca extends Conta {

	@Override
	public void extrato() {
		System.out.println("extrato conta poupança");
		this.extratoSimples();
		
	}

	

}
