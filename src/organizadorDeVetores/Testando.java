package organizadorDeVetores;

public class Testando {

	public static void main(String[] args) {
		GeradorDeVetores GV = new GeradorDeVetores(30000);
		
		GV.popularVetorDeFormaOrdenada();
		
		System.out.println(GV);
		
		//OrganizadorQuickSort.OrganizarVetor(GV.getVetor());
		OrganizadorSelectionSort.OrganizarVetorSelectionSort(GV.getVetor());
		
		//System.out.println(GV);

	}

}
