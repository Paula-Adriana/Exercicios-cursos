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
		
		//Para fazer uma ´new pessoa´: pode ser como lá em cima sem passar parametro
		//ex: Pessoa p1 = new Pessoa(;
		//OU já passando parametros do construtor que foi feito + dados do endereço atraves do objeto criado p2.
		Pessoa p2 = new Pessoa("Carlos", 26, "000.000.000-00");
		p2.endereco.logradouro = "Silva Lima";
		p2.endereco.numero = 45;
		p2.endereco.complemento = "01";
		p2.endereco.cidade = "Curitiba";
		p2.endereco.estado = "PR";
		p2.endereco.CEP = "89230-125";
		
		System.out.printf("%s\n", p2.imprimirDadosPessoa('s'));
		
		Pessoa p3 = new Pessoa("Maria", 25, "000.000.000-00", "Avenida Souza", 45,
								"casa A", "Cuiabá", "MT", "89.562-00");
		
		System.out.printf("%s\n", p3.imprimirDadosPessoa('s'));
		
	}

}
