package organizadorDeVetores;

public class Testando {

	public static void main(String[] args) {
		GeradorDeVetores GV = new GeradorDeVetores(10);
		
		GV.popularVetorDeFormaInvertida();
		
		System.out.println(GV);
		
		OrganizadorQuickSort.OrganizarVetor(GV.getVetor());
		
		System.out.println(GV);

	}

}
