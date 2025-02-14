package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agenciia, int tipo, String titular, float saldo, float limite) {
		super(numero, agenciia, tipo, titular, saldo);
		this.limite = limite;

	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() <valor ) {
			System.out.println("/n Saldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return false;
	}
	
	
	
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
	
}


	