package pacotePrincipal;

public class Pessoa {
	
	int idade; //Atributos ou propriedades representados por variaveis 
	double altura;
	double peso;
	String nome;
	
	//metodo é representado por um nome e (). Dentro dos () irão os atributos se quiser
	//retornará um tipo string mas pode ser qq tipo
	String imprimirDados() {
		return "Nome: " + nome + " \nIdade: " + Integer.toString(idade) + 
				" \nPeso: " + Double.toString(peso) + " \nAltura: " + Double.toString(altura);
		
	}
	//ex de outro método
	int retornarAnoNascimento() {
		return 2021 - idade;
	}
}
//Aqui foi criada toda a classe PESSOA. Com seus atributos e métodos