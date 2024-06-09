package projeto_do_banco;

public class ContaCorrente extends Conta {

	@Override
	public void extrato() {
		System.out.println("extrato conta corrente");
		super.extratoSimples();
		
	}

	

}
