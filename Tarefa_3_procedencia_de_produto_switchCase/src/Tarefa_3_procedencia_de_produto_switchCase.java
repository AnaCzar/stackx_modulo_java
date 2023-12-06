import java.util.Scanner;

public class Tarefa_3_procedencia_de_produto_switchCase {

	public static void main(String[] args) {
		
		/*Faça um programa que receba o preço de um produto e seu código de origem e mostre sua procedência. A procedência obedece à 
		 * tabela a seguir.*/
		
		Scanner leitor = new Scanner(System.in);
		
		double precoProd;
		int codOrigem;
		
				
		System.out.println("Qual o Preço do produto?");
		precoProd = leitor.nextDouble();
		System.out.println(precoProd);
		
		System.out.println("Qual o codigo de origem do produto?");
		codOrigem = leitor.nextInt();
		System.out.println(codOrigem);

				
		
		switch (codOrigem){
		case 1:
			System.out.println("O produto tem o valor de R$ " + precoProd + " é proveniente da região "+ "Sul");
			break;
		case 2:
			System.out.println("O produto tem o valor de R$ " + precoProd + " é proveniente da região "+ "Norte");
			break;
		case 3:
			System.out.println("O produto tem o valor de R$ " + precoProd + " é proveniente da região "+ "Leste");
			break;
		case 4:
			System.out.println("O produto tem o valor de R$ " + precoProd + " é proveniente da região "+ "Oeste");
			break;
		case 5 | 6:
			System.out.println("O produto tem o valor de R$ " + precoProd + " é proveniente da região "+ "Nordeste");
			break;
		case 7 | 8 |9:
			System.out.println("O produto tem o valor de R$ " + precoProd + " é proveniente da região "+ "Sudeste");
			break;
		default:
			System.out.println("O produto tem o valor de R$ " + precoProd + " não tem cadastrado de região de origem");
			break;
	}
			
		
		
	}

}
