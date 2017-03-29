package trabalhoContasBanco;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface ProcessadorDeArquivosStream {
	
	public List<String> lerLinhasDoArquivo(InputStream ArquivoASerLido);
	
	public void escreveLinhasNoArquivo(List<String> dados, OutputStream ArquivoASerGravado);
	
	public void copiaArquivo(InputStream arquivoRecebedor, OutputStream arquivoGravador);
}
