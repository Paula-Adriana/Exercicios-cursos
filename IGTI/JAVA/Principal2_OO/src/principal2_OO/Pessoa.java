package principal2_OO;

public class Pessoa {

	int idade; 
	String CPF;
	String nome;
	dadosEndereco endereco; //é toda a classe dadosEndereço
	
	//criar o objeto endereço: dentro da classe com "construtor" com o mesmo nome da classe
	//é um método (nao retorna nada) e instancia o objeto endereço
	//construtor sem nenhum parametro
	Pessoa() {
		endereco = new dadosEndereco();//instanciei o objeto endereço da classe dadosEndereco
	}
	
	//Também podemos fazer um construtor que já receba os dados pessoais por parâmetro
	//escreve - aqui e mais no codigo principal
	Pessoa(String name, int age, String id) {
		nome = name;
		idade = age;
		CPF = id;
		endereco = new dadosEndereco(); //criar o endereço para nao ficar nulo.
	}
	//Construtor já com os dados pessoais + de endereço
	//escreve-se + aqui e menos no codigo principal
	Pessoa(String name, int age, String id, String street, int number, String compl, String city, String UF,
			String code) {
		nome = name;
		idade = age;
		CPF = id;
		endereco = new dadosEndereco(); //criar o endereço para nao ficar nulo.
		endereco.logradouro = street;
		endereco.numero = number;
		endereco.complemento = compl;
		endereco.cidade = city;
		endereco.estado = UF;
		endereco.CEP = code;
	}
	
	
	String imprimirDadosPessoa(char imprimirEndereco) {
		if (imprimirEndereco == 'N' || imprimirEndereco == 'n')
			return "Nome: " + nome + " \nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF;
		else
			return "Nome: " + nome + " \nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF + "\n" +
			endereco.imprimirDadosEndereco();
	}
}
