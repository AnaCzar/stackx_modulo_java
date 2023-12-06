import java.util.Scanner;

public class Tarefa_32_Valor_de_venda_IF {
	
	public static double calculoVenda(double valorCompra , double perLucro){
		return valorCompra * perLucro;
	}
	public static void main(String[] args) {
		/*Um comerciante calcula o valor de venda, tendo em vista a tabela a seguir:
		 * Valor da compra	Valor da venda
		 *  < 10,00	Lucro de 70%
		 *  >= 10,00 e < 30,00	Lucro de 50%
		 *  >= 30,00 e < 50,00	Lucro de 40%
		 *  >= 50,00	Lucro de 30%
		 *  Crie um programa que possa entrar com o valor da compra e imprimir o valor da venda.*/

		Scanner leitor = new Scanner(System.in);
		
		double valorCompra = 9.50;
		double percLucro = 1.70;
		
		System.out.println("Digite o valor de compra do produto");
		valorCompra = leitor.nextDouble();
		System.out.println(valorCompra);
		
			if(valorCompra < 10.00){
				percLucro = 1.70;
			}else if(valorCompra >= 50.00){
				percLucro = 1.30;
			}else if(valorCompra >= 30.00 && valorCompra < 50.00){
				percLucro = 1.40;
			}else {
				percLucro = 1.50;
			}
			
		System.out.println("O produto com valor de compra R$ " + valorCompra + " , tem o valor de venda R$ " + calculoVenda(valorCompra, percLucro));
		
		}
}
