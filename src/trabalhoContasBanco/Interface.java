package trabalhoContasBanco;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface {
	
	private List<ContaCorrente> contas;
	private Scanner scan;
	
	public Interface() {
		contas = new ArrayList<ContaCorrente>();
	}
	
	public void menuPrincipal(){
		int opcao = 0;
		this.scan = new Scanner(System.in);
		do{
			System.out.print("Digite uma opção: \n1-Pesquisar Conta\n2-Listar Contas\n3-Importar Contas\n4-Sair");
			opcao = this.scan.nextInt();
			switch (opcao){
			case 1:
				ContaCorrente contaEncontrada = pesquisarContaCorrente();
				System.out.println(contaEncontrada.toString());
				break;
			case 2:
				listarContas();
				break;
			case 3:
				importarContasDoArquivo();
				break;
			case 4:
				break;
			default:
				System.err.println("Opção Inválida");
				break;
			}
		}while(opcao != 4);
		
		this.scan.close();
	}
	
	
	public ContaCorrente pesquisarContaCorrente(){
		
		int codConta = 0;
		ContaCorrente contaEncontrada = null;
		this.scan = new Scanner(System.in);
		do{
			System.out.print("Digite o código da conta: ");
			codConta = this.scan.nextInt();
			
			for(ContaCorrente conta : contas){
				if(conta.getCod() == codConta){
					contaEncontrada = conta;
					return contaEncontrada;
				}
			}
		}while(contaEncontrada != null);
		
		this.scan.close();
		
		return null;	
	}

	public void listarContas(){
		for(ContaCorrente conta : this.contas){
			System.out.println(conta.toString());
		}
	}
	
	public void importarContasDoArquivo(){
		ManipulaArquivos manupuladorDeArquivos = new ManipulaArquivos();
		
		List<String> dados = manupuladorDeArquivos.lerLinhasDoArquivo(new File("resources/dados.txt"));
		
		for(String linha : dados){
			String[] dado = linha.split(";");
			Cliente cliente = new Cliente(dado[1]);
			this.contas.add(new ContaCorrente(Integer.parseInt(dado[0]), Double.parseDouble(dado[2]), cliente));
		}
		
	}
	
	public static void main(String[] args) {
		
		Interface i = new Interface();
		
		i.menuPrincipal();
		
	}
	
}
