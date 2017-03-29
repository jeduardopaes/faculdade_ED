package trabalhoContasBanco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ManipulaArquivosComStream implements ProcessadorDeArquivosStream {

	@Override
	public List<String> lerLinhasDoArquivo(InputStream arquivoASerLido) {
		List<String> dados = new ArrayList<String>();
		
		try(BufferedReader leitorDeArquivo = new BufferedReader(new InputStreamReader(arquivoASerLido))){
			String linha = leitorDeArquivo.readLine();
			
			while(linha != null){
				dados.add(linha);
				linha = leitorDeArquivo.readLine();
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return dados;
	}

	@Override
	public void escreveLinhasNoArquivo(List<String> dados, OutputStream arquivoASerGravado) {
		try(BufferedWriter escritorDoArquivo = new BufferedWriter(new OutputStreamWriter(arquivoASerGravado))){
			int numeroDeLinhas = 0;
			
			for(String linha : dados){
				if(numeroDeLinhas++ > 0){
					escritorDoArquivo.newLine();
				}
				escritorDoArquivo.write(linha);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

	@Override
	public void copiaArquivo(InputStream arquivoRecebedor, OutputStream arquivoGravador) {
		List<String> dados = lerLinhasDoArquivo(arquivoRecebedor);
		escreveLinhasNoArquivo(dados, arquivoGravador);
	}

}
