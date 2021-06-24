package pacoteExemplo;

public class aula2_6 {

	public static void main(String[] args) {
		String nome, nome2;
		nome = "José da Silva";
		nome2 = "Maria Clara Silva";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		System.out.println("A variavel nome tem " + tamanhoDoNome + " caracteres.");
		System.out.println("A variavel nome2 tem " + tamanhoDoNome2 + " caracteres.");
		
		int total = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas variáveis é: " + total + ".");
		
		String concatenandoNomes = nome.concat(nome2);
		System.out.println(concatenandoNomes);
		
		String nomeSemA = nome.replace('a', '9'); //trocou todos os As por 9
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(0, 11); //vai escrever os 11 primeiros caracteres
		System.out.println(somenteNome);

	}

}
