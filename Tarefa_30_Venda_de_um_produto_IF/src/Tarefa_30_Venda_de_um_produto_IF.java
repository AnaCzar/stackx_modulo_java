import java.util.Scanner;

public class Tarefa_30_Venda_de_um_produto_IF {
	
	public static double calculoVenda(double valorCompra , double perLucro){
		return valorCompra * perLucro;
	}
	public static void main(String[] args) {
		/*Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00; caso contrário,
		 *  o lucro será de 30%. Desenvolva um programa que dado o valor do produto, imprimir o valor de venda.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		double valorCompra = 30.00;
		double percLucro = 1.30;
		
		System.out.println("Digite o valor de compra do produto");
		valorCompra = leitor.nextDouble();
		System.out.println(valorCompra);
		
			if(valorCompra < 20.00) {
				percLucro = 1.45;
			}else{
			}	
		System.out.println("O produto com valor de compra R$ " + valorCompra + " , tem o valor de venda R$ " + calculoVenda(valorCompra, percLucro));
			
		
	}

}
