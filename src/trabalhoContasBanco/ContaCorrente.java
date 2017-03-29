package trabalhoContasBanco;

public class ContaCorrente {
	
	private int cod;
	private double saldo;
	private Cliente cliente;
	
	public ContaCorrente(int cod, double saldo, Cliente cliente) {
		this.cod = cod;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void addCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public void depositar(double valor){
		if(valor > 0){
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor){
		if(valor > 0){
			this.saldo -= valor;
		}
	}
	
	@Override
	public String toString() {
		return "Codigo: "+this.getCod()+" Saldo: "+this.getSaldo()+" "+this.getCliente().toString();
	}
}
