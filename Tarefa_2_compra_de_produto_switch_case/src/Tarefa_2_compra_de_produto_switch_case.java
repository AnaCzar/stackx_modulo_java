import java.util.Scanner;


public class Tarefa_2_compra_de_produto_switch_case {

	public static void main(String[] args) {
		
		/*Faça um programa que receba:
		O código do produto comprado; e
		A quantidade comprada do produto.
		Calcule e mostre:
		O preço unitário do produto comprado, seguindo a Tabela abaixo;
		O preço total da nota;
		O valor do desconto, seguindo a Tabela abaixo e aplicado sobre o preço total da nota; e
		O preço final da nota depois do desconto.
		tab.jpg */
		
		Scanner leitor = new Scanner(System.in);
		
		int grupoProd;
		int codProd;
		int qtdadeProd;
		double vlrProd; 
		double vlrTotalProd;
		double vlrTotalNota;
		double percDesc;
		
		vlrProd = 0.00 ;
		
		System.out.println("Digite o código do Grupo de Produto" + "\n" + "Grupo 1 (codigo de produto de 1 a 10)" + "\n" + "Grupo 2 (codigo de produto de 11 a 20)" 
		+ "\n" + "Grupo 3 (codigo de produto de 21 a 30)" + "\n"+ "Grupo 4 (codigo de produto de 31 a 40)" + "\n"); 
		grupoProd = leitor.nextInt();
		System.out.println(grupoProd);
		
		switch (grupoProd) {
		
		case 1: 
			vlrProd = 10.00;
			System.out.println("O valor do produto é R$ " + vlrProd);
						
			break;	

		case 2: 
			vlrProd = 15.00;
			System.out.println("O valor do produto é R$ " + vlrProd);
						
			break;	

		case 3:
			vlrProd = 20.00;
			System.out.println("O valor do produto é R$ " + vlrProd);	
						
			break;

		case 4: 
			vlrProd = 30.00;
			System.out.println("O valor do produto é R$ " + vlrProd);
						
			break;

		default:
			System.out.println("Codigo de grupo não cadastrado");
			
			break;
		}
		
		System.out.println("Qual a quantidade de produtos desejada?");
		leitor.nextLine();
		qtdadeProd = leitor.nextInt();
		System.out.println(qtdadeProd);
				
		vlrTotalProd = vlrProd * qtdadeProd;

		if(grupoProd == 1 && vlrTotalProd < 250.00 ) {
			vlrTotalNota = (vlrTotalProd) - (vlrTotalProd * 0.05);
			System.out.println("O valor total de produtos é de R$ " + vlrTotalProd  + ". E O valor total da NF é de R$ "+ vlrTotalNota);
		}
 		else if(grupoProd == 2 &&  vlrTotalProd >=250.00 && vlrTotalProd <=500.00) { 
			vlrTotalNota = (vlrTotalProd) - (vlrTotalProd * 0.10);
			System.out.println("O valor total de produtos é de R$ " + vlrTotalProd  + ". E O valor total da NF é de R$ "+ vlrTotalNota);
		}
		else if(grupoProd == 3 && vlrTotalProd > 50.00) { 
			vlrTotalNota = (vlrTotalProd) - (vlrTotalProd * 0.15);
			System.out.println("O valor total de produtos é de R$ " + vlrTotalProd  + ". E O valor total da NF é de R$ "+ vlrTotalNota);
		}
		else {
			vlrTotalNota = vlrTotalProd;
		System.out.println("O valor total de produtos é de R$ " + vlrTotalProd  + ". E O valor total da NF é de R$ "+ vlrTotalNota);
		}	
		
	}
}
	
		
				
	