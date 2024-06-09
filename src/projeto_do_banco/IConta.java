package projeto_do_banco;

public interface IConta { 
	
	/*não faz sentido colocar em uma interface public(redudancia),
	 *pois a mesma e abstrata ou seja os mtodos tem que ser public
	 */
	void sacar(double valor);
	 
	void depositar(double valor);
	 
	void transferir(double valor, Conta contaDestino);
	
	void extrato();

}
