package organizadorDeVetores;

import java.util.Scanner;

public class Init {

	private static Scanner entradaprincipal = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("=========================================================== ");
		System.out.println(" ");
		System.out.println("Escolha: ");
		System.out.println(" ");
		System.out.println(" 1 - Vetor Aleatorio ");
		System.out.println(" 2 - Vetor Invertido");
		System.out.println(" 3 - Vetor Ordenada");
		int escolhavetor = entradaprincipal.nextInt();

		System.out.println(" ");
		System.out.println("=========================================================== ");
		System.out.println(" ");
		System.out.println("Tamanho do vetor: ");
		int tamanhodovetor = entradaprincipal.nextInt();

		GeradorDeVetores GV = new GeradorDeVetores(tamanhodovetor);

		if (escolhavetor == 1) {
			GV.popularVetorDeFormaAleatoria();
		} else if (escolhavetor == 2) {
			GV.popularVetorDeFormaInvertida();
		} else if (escolhavetor == 3) {
			GV.popularVetorDeFormaOrdenada();
		} else {
			System.out.println("Porra escolha uma opção direito");
		}

		menu(GV.getVetor());

	}

	public static void menu(int[] vetorDeInteiros) {

		System.out.println(" ");
		System.out.println("=========================================================== ");
		System.out.println(" ");
		System.out.println("Escolha: ");
		System.out.println(" ");
		System.out.println(" 1 - QuickSort ");
		System.out.println(" 2 - SelectSort ");
		System.out.println(" 3 - Voltar ");
		int opcaodeordenacao = entradaprincipal.nextInt();
		System.out.println(" ");
		System.out.println(" ");

		if (opcaodeordenacao == 1) {
			OrganizadorQuickSort.OrganizarVetor(vetorDeInteiros);
		} else if (opcaodeordenacao == 2) {
			OrganizadorSelectionSort.OrganizarVetorSelectionSort(vetorDeInteiros);
		} else if (opcaodeordenacao == 3) {
			main(null);
		} else {
			System.out.println("Porra escolha uma opção direito.");
		}

		menu(vetorDeInteiros);

	}

}
