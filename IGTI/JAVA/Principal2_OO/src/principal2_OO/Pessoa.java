package principal2_OO;

public class Pessoa {

	int idade; 
	String CPF;
	String nome;
	dadosEndereco endereco; //� toda a classe dadosEndere�o
	
	//criar o objeto endere�o: dentro da classe com "construtor" com o mesmo nome da classe
	//� um m�todo (nao retorna nada) e instancia o objeto endere�o
	//construtor sem nenhum parametro
	Pessoa() {
		endereco = new dadosEndereco();//instanciei o objeto endere�o da classe dadosEndereco
	}
	
	//Tamb�m podemos fazer um construtor que j� receba os dados pessoais por par�metro
	//escreve - aqui e mais no codigo principal
	Pessoa(String name, int age, String id) {
		nome = name;
		idade = age;
		CPF = id;
		endereco = new dadosEndereco(); //criar o endere�o para nao ficar nulo.
	}
	//Construtor j� com os dados pessoais + de endere�o
	//escreve-se + aqui e menos no codigo principal
	Pessoa(String name, int age, String id, String street, int number, String compl, String city, String UF,
			String code) {
		nome = name;
		idade = age;
		CPF = id;
		endereco = new dadosEndereco(); //criar o endere�o para nao ficar nulo.
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
