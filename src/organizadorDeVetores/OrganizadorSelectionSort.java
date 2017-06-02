package organizadorDeVetores;

public class OrganizadorSelectionSort {

	private long tempoDeExecucao;
	private int contadorDeComparacao;
	private int contadorDeTrocas;

	public static void OrganizarVetorSelectionSort(int[] vetorDeInteiros) {
		OrganizadorSelectionSort OSS = new OrganizadorSelectionSort();
		OSS.tempoDeExecucao = System.currentTimeMillis();
		OSS.doSelectionSort(vetorDeInteiros);
		OSS.tempoDeExecucao = System.currentTimeMillis() - OSS.tempoDeExecucao;

		System.out.println("O Tempo para organizar o vetor foi de: " + OSS.tempoDeExecucao + " milisegundos.\n"
				+ "A quantidade de trocas foi de: " + OSS.contadorDeTrocas + " trocas.\n"
				+ "A quantidade de comparações foi de: " + OSS.contadorDeComparacao + " comparações.");

	}

	public OrganizadorSelectionSort() {
		this.contadorDeComparacao = 0;
		this.contadorDeTrocas = 0;
	}

	public int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++){
				if (arr[j] < arr[index]){
					index = j;
				}
				contadorDeTrocas++;
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
			
			contadorDeComparacao++;
		}
		
		return arr;
	}

	public long getNumerodeTrocas() {
		return contadorDeTrocas;
	}

	public long getNumerodeComparacoes() {
		return contadorDeComparacao;
	}

}
