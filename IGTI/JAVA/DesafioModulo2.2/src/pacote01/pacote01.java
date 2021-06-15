package pacote01;
import java.util.*;
import java.io.*;
public class pacote01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[50];
		int contNum = 0;
		char continuar = 'S';
		
		while (continuar == 'S' || continuar == 's') {
			System.out.printf("Digite o %dº numero:\n",contNum+1);
			numeros[contNum] = entrada.nextInt();
			contNum++;
			entrada.nextLine();
			System.out.println("Deseja continuar digitando números? (S - Sim / N - Não");
			continuar = entrada.nextLine().charAt(0);
		}
		try {
			FileWriter arq = new FileWriter("C:\\Users\\Paula\\Desktop\\Cursos\\IGTI\\JAVA\\DesafioModulo2.2\\saida.txt");
			PrintWriter gravarArquivo = new PrintWriter(arq);
			for (int i = 0; i < contNum; i++) {
				if (numeros[i] % 2 == 0 && numeros [i] > 10)
					gravarArquivo.printf("%d%n", numeros[i]);
			}
			arq.close();
			gravarArquivo.close();
			System.out.println("Sistema Finalizado.");	
		}
		catch (IOException e) {
			System.err.println("Erro granvando dados:" +e.getMessage());
			
		}
			

	}

}
