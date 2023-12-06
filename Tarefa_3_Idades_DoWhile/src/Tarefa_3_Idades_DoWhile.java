import java.util.Scanner;

public class Tarefa_3_Idades_DoWhile {

	public static void main(String[] args) {
		/* Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero. */
		
		Scanner leitor = new Scanner(System.in);
		
		int idade;
		double somaIdades = 0;
		int i = 1;
		double mediaIdades;
		
		
		
		do {
			System.out.println("Digite a " + i + "º idade para cálculo da média");
			idade = leitor.nextInt();
			System.out.println(idade);
			somaIdades = somaIdades + idade;
			i++;
		}while (idade !=0);
		
		mediaIdades = somaIdades/(i-2);
		System.out.println("A média das idades digistas é :" + mediaIdades);
	}
}
		
	