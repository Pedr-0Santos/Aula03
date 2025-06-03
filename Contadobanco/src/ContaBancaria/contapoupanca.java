package ContaBancaria;

public class contapoupanca extends Conta{

	public contapoupanca() {
		super();
		
	}

	public contapoupanca(String n, int num, double v) {
		super(n, num, v);
		
	}
	
	public void reajustar(double percent) {
		double reajuste = this.getSaldo() * percent;
		this.depositar(reajuste);
	}

}
