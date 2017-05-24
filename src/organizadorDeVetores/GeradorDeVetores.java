package organizadorDeVetores;

public class GeradorDeVetores {

	public int[] vetor;
	public int tamanhoMaximo;
	
	public GeradorDeVetores(int tamanhoDoVetor){
		this.tamanhoMaximo = tamanhoDoVetor;
		this.vetor = new int[tamanhoDoVetor];
	}
	
	
	public void popularVetorDeFormaOrdenada(){
		
		for(int i=0;i<vetor.length;i++){
			vetor[i] = i;
		}
		
	}
	
	public void popularVetorDeFormaInvertida(){
		int j=0;
		for(int i=tamanhoMaximo-1;i>=0;i--){
			vetor[j] = i;
			j++;
		}
		
	}
	
	public void popularVetorDeFormaAleatoria(){
		
		for(int i=0;i<vetor.length;i++){
			vetor[i] = (int) (Math.random()*tamanhoMaximo);
		}
		
	}
	
	public int[] getVetor(){
		return this.vetor;
	}
	
	
	@Override
	public String toString() {
		String vetorTexto = "";
		for(int i=0;i<vetor.length;i++){
			vetorTexto += vetor[i] + "\n";
		}
		
		return vetorTexto;
	}
	
}
