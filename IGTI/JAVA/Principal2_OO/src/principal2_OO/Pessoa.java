package principal2_OO;

public class Pessoa {

	int idade; 
	String CPF;
	String nome;
	dadosEndereco endereco; //é toda a classe dadosEndereço
	
	//criar o objeto endereço: duas formas: dentro da classe com "construtor" e possui o mesmo nome da classe
	//é um método mas nao retorna nada
	Pessoa() {
		endereco = new dadosEndereco();
	}
	
	String imprimirDadosPessoa(char imprimirEndereco) {
		if (imprimirEndereco == 'N' || imprimirEndereco == 'n')
			return "Nome: " + nome + " \nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF;
		else
			return "Nome: " + nome + " \nIdade: " + Integer.toString(idade) + "\nCPF: " + CPF + "\n" +
			endereco.imprimirDadosEndereco();
	}
}
