import java.util.Scanner;

/* 7. Conjunto de valores (While) 
 * Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada.
 * Finalize a entrada de dados com um valor negativo ou zero.
 */

public class Tarefa_7_Conjunto_de_valores_WHILE {
	
	public static double calculoQuadrado(double valor1) {  
		return (valor1 * valor1);										 	
	}
	
	public static double calculoCubo(double valor1) {  
		return (valor1 * valor1 * valor1);										 	
	}
	
	public static double calculoRaizQuadr(double valor1) {  
		return Math.sqrt(valor1);									 	
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double num = 0.0;
		int i = 1;
			while(i>0) {
			System.out.println("Digite um numero para o cálculo (maior que zero)" + "\n");
			num = leitor.nextDouble();
			System.out.println(num);
				if(num<=0) {
					System.out.println("Fim do programa!!");
					break;
				}
			System.out.println("O quadrado de " + num + " é = " + calculoQuadrado(num) + "\n" + "O cubo de " + num + " é = " + calculoCubo(num) +
					"\n" +"A raiz quadrada de " + num + " é = " + calculoRaizQuadr(num) + "\n" );
			i++;				
		}
	}
}
