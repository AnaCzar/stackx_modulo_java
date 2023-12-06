import java.util.Scanner;

public class Tarefa_23_Numero_multiplo_de_3_IF {

	public static void main(String[] args) {
		/*Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3.*/
		
		Scanner leitor = new Scanner(System.in);
		
		int numerador;
		int denominador = 3;
		
		
		
		System.out.println("Digite o número(inteiro) que você deseja verificar se é múltiplo de " + denominador);
		numerador = leitor.nextInt();
		System.out.println(numerador);
		
			if(numerador%denominador == 0) {
				System.out.println("O número " + numerador + " é múltiplo de " + denominador);
			}else {
				System.out.println("O número " + numerador + " NÃO é múltiplo de " + denominador);
			}
	}
}
