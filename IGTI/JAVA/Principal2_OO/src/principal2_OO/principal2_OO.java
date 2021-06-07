package principal2_OO;
import java.util.*;
public class principal2_OO {

	public static void main(String[] args) {
		// Depois de criar duas classes (dadosEndereço e Pessoa)
		//instanciar o objeto pessoa.
		
		Pessoa p1 = new Pessoa();//classe pessoa sem argumento
		Scanner entNumerico = new Scanner(System.in);//classe scanner feita por outra pessoa com argumento
		Scanner entCaracter = new Scanner(System.in);
		char imprimirEndereco;
		
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumerico.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF = entCaracter.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.endereco.logradouro = entCaracter.nextLine();
		
		System.out.println("Digite o número: ");
		p1.endereco.numero = entNumerico.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.endereco.complemento = entCaracter.nextLine();
		
		System.out.println("Digite a cidade: ");
		p1.endereco.cidade = entCaracter.nextLine();
		
		System.out.println("Digite o estado: ");
		p1.endereco.estado = entCaracter.nextLine();
		
		System.out.println("Digite o CEP: ");
		p1.endereco.CEP = entCaracter.nextLine();
		
		System.out.println("Deseja imprimir os dados com o endereço:");
		imprimirEndereco = entCaracter.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimirDadosPessoa(imprimirEndereco));
		
	}

}
