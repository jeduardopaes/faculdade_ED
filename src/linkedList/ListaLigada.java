package linkedList;

public class ListaLigada {
	
	private Celula primeira;
	private Celula ultima;
	private static int quantidade = 0;
	
	
	public String toString(){
		
		String lista = "Lista [";
		
		Celula celula;
		
		celula = this.primeira;
		
		do{
			
			lista += celula.getElemento()+", ";
			
			celula = celula.getProxima();
			
			
		}while(celula != null);
		
		return lista+"]";
		
	}
	
	
	public void adicionaUltima(Celula celula){
		
		if(this.quantidade == 0){
			
			this.primeira = celula;
			this.ultima = celula;
			
		}else{
			
			Celula antigoUltimo = this.ultima;
			this.ultima = celula;
			antigoUltimo.setProxima(this.ultima);
			
		}
		
		this.quantidade++;
			
	}
	
	
	public int getQuantidade(){
		return quantidade;
	}

	
	public boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.quantidade;
	}
	
	
	
	public static void main(String[] args) {
		
		ListaLigada listaLigada = new ListaLigada();
		
		String nome1 = "Jose";
		String nome2 = "Mathaus";
		String nome3 = "Bernardo";
		String nome4 = "Xunior";
		String nome5 = "ultimo";
		
		
		Celula celula1 = new Celula(nome1);
		Celula celula2 = new Celula(nome2);
		Celula celula3 = new Celula(nome3);
		Celula celula4 = new Celula(nome4);
		Celula celula5 = new Celula(nome5);
		
		
		
		listaLigada.adicionaUltima(celula1);
		listaLigada.adicionaUltima(celula2);
		listaLigada.adicionaUltima(celula3);
		listaLigada.adicionaUltima(celula4);
		listaLigada.adicionaUltima(celula5);
		
		System.out.println(listaLigada.toString());
		
		System.out.println(listaLigada.getQuantidade());
	}

	
}
