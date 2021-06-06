package gravacaoArquivo;

import java.io.FileWriter;//se colocar somente java.io.*; já vem todo o pacote  
import java.io.IOException;
import java.io.PrintWriter;

public class gravacaoArquivo {

	public static void main(String[] args) {
		try {
			FileWriter arquivo = new FileWriter("C:\\Users\\Paula\\Desktop\\Cursos\\IGTI\\JAVA\\gravacaoArquivo\\saidaDados.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for (int i = 0; i < 1000; i++) {
				gravarArquivo.printf("Valor de i: %d.%n", i);
			}
			gravarArquivo.close();
			arquivo.close();
			
		} catch (IOException e){
			System.out.println("Ocorreu um erro ao gravar arquivo: " + e.getMessage());
		}
		System.out.println("Fim da execução");

	}

}
