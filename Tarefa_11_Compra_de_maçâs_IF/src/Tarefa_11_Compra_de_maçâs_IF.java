import java.util.Scanner;

public class Tarefa_11_Compra_de_maçâs_IF {

	public static void main(String[] args) {
		/*
		 * As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia
		 *  o número de maçãs compradas, calcule e escreva o valor total da compra.
		 */
	
				
		Scanner leitor = new Scanner(System.in);
		
		double valorVarejoMaca = 0.30;
		double valorAtacadoMaca = 0.25;
		int quantidadeMaca;
		double valorTotal;
		
		System.out.println("Digite a quantidade de maçãs que deseja");
		quantidadeMaca = leitor.nextInt();
		System.out.println(quantidadeMaca);
		
			if(quantidadeMaca<12 && quantidadeMaca>0){
				valorTotal = valorVarejoMaca*quantidadeMaca;
				System.out.println("Para a quantidade de maçãs = " + quantidadeMaca + " o valor total da compra é de R$ "
				+ valorTotal + "(R$ " + valorVarejoMaca + " cada).");
			}else if(quantidadeMaca>=12) {
				valorTotal = valorAtacadoMaca*quantidadeMaca;
				System.out.println("Para a quantidade de maçãs = " + quantidadeMaca + " o valor total da compra é de R$ "
				+ valorTotal+ "(R$ " + valorAtacadoMaca + " cada).");
			}else {
				System.out.println("Digite uma quantidade válida(maior que zero)");
			}
	}
}