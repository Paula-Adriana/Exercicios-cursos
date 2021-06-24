package manipulacaoOperadores;
import java.math.*; //biblioteca do java
public class manipulacaoOperadores {

	public static void main(String[] args) {
		//x^2 +12x -13=0
		//2x^2 -16x -18 = 0
		
		double a, b, c;
		a = 1;
		b = 12;
		c = -13;
		double delta = 0;
		delta = (b*b) - (4*a*c);
		System.out.printf("O valor do delta é: %.0f\n", delta); //sem casa decimal %.0f
		
		double x_linha = 0;
		x_linha = (-b + Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x' é de %.0f\n", x_linha);
		
		double x_2linha = 0;
		x_2linha = (-b - Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x'' é de %.0f", x_2linha);
	
	}

}
