package pacoteAula2_4;

public class classeAula2_4 {

	public static void main(String[] args) {
		
		int nota = 20;
		char tipoAluno = 'B';
		double horasCursadas = 2.5;
		boolean aprovado = true;
		
		System.out.println("Nota: " + nota);
		System.out.println("Tipo de aluno: " + tipoAluno);
		System.out.println("Horas Cursadas: " + horasCursadas); //println quebra a linha
		System.out.println("Aprovado: " + aprovado);
		
		nota = 30; //nao é necessario declarar com o tipo da variavel novamente
		tipoAluno = 'G';
		horasCursadas = 4.0;
		aprovado = false;
		
		System.out.println("Nota: " + nota);
		System.out.println("Tipo de aluno: " + tipoAluno);
		System.out.println("Horas Cursadas: " + horasCursadas); //println quebra a linha
		System.out.println("Aprovado: " + aprovado);
	}

}
