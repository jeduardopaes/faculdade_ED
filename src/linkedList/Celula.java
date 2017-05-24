package linkedList;

public class Celula {
	
	private String elemento;
	
	private Celula proxima;
	
	public Celula( Celula celula, String nome ){
		this.proxima = celula;
		this.elemento = nome;
	}
	
	public Celula( String nome ){
		this.elemento = nome;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula celula) {
		this.proxima = celula;
	}

	public String getElemento() {
		return elemento;
	}
	
	
	
	
}
