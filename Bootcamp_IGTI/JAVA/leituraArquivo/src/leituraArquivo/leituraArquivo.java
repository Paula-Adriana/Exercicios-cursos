package leituraArquivo;
import java.io.BufferedReader; //biblioteca para ler arquivo
import java.io.FileReader; //biblioteca para ler arquivo
import java.io.IOException;

public class leituraArquivo {

	public static void main(String[] args) {

		
		
		try { //objetos de leitura do arquivo
			FileReader arquivo = new FileReader("C:\\Users\\Paula\\Desktop\\Cursos\\IGTI\\JAVA\\leituraArquivo\\Arquivo.txt"); //sempre \\
			BufferedReader lerArquivo = new BufferedReader (arquivo);
			
			String linha; //variavel que vai guardar cada linha do arquivo lido.
			linha = lerArquivo.readLine(); //lê a primeira linha			
			
			while (linha != null) { //enquanto a linha for diferente de nulo (null ultima linha lida sem nada para ler) quer dizer que tem linhas a ler
				String[] dadosCliente = new String[5];//array que guardará os dados do cliente
				dadosCliente = linha.split(";");//dividirá o texto pelos ; existente, separando dados
				
				System.out.printf("Código do cliente: %s.\n" +
								"Nome do cliente: %s.\n" +
								"Endereço: %s.\n" +
								"Estado: %s.\n" +
								"Estado civil: %s.\n", dadosCliente[0], dadosCliente[1],
												  dadosCliente[2], dadosCliente[3], dadosCliente[4]);
			
				linha = lerArquivo.readLine();//ler proxima linha
				System.out.println(" ");//gera um espaço entre os arrays
			}
			lerArquivo.close(); //fechar arquivo depois de ler (boa pratica)
			arquivo.close();
			} catch (IOException e){ //'e' variavel
				System.out.println("Erro lendo dados: " + e.getMessage());
			
		}
	}

}
