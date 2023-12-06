import java.util.Scanner;

public class Tarefa_25_Credito_para_alunos_IF {
	public static double calculovalorMaxParcelas(double salarioBruto,double percMaxSalario) {
		return salarioBruto * percMaxSalario;
	}
	
	public static double calculoValorParcela(double valorEmprest , int numParcelas ) {
		return valorEmprest/ numParcelas;
	}

	public static void main(String[] args) {
		/* A StackX abriu uma linha de crédito para os alunos. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
		 * Fazer um programa que permita entrar com o salário bruto, o valor do empréstimo e o número de parcelas e informar o
		 * valor da parcela e se o empréstimo pode ou não ser concedido. Caso o empréstimo não possa ser concedido, informar ainda 
		 * o valor máximo da prestação.
		 */

		Scanner leitor = new Scanner(System.in);
		
		double salarioBruto = 0.0;
		double valorEmprest = 0.0; 
		int numParcelas = 1; 
		double perMaxSalario = 0.3;
		double valorParcela = 1; 
		double valorMaxParcelas = 1; 
		
		System.out.println("Digite o valor do emprestimo ");
		valorEmprest = leitor.nextDouble();
		System.out.println(valorEmprest);
				
		System.out.println("Digite o numero de parcelas do emprestimo ");
		numParcelas = leitor.nextInt();
		System.out.println(numParcelas);
		
		System.out.println("Digite o salário Bruto ");
		salarioBruto = leitor.nextDouble();
		System.out.println(salarioBruto);
		
			
		
			if(calculoValorParcela(valorEmprest, numParcelas)>calculovalorMaxParcelas(salarioBruto, perMaxSalario)) {
				System.out.println("O valor da parcela do empréstimo = R$ " + calculoValorParcela(valorEmprest, numParcelas) + 
				" superou o percentual máximo do empréstimo = R$ " + calculovalorMaxParcelas(salarioBruto, perMaxSalario) + " em R$ " + 
				(calculoValorParcela(valorEmprest, numParcelas) - calculovalorMaxParcelas(salarioBruto, perMaxSalario) + "\n"+
				"Portanto o empréstimo NÃO poderá ser concedido!"));
			}else {
				System.out.println("O valor da parcela do empréstimo = R$ " + calculoValorParcela(valorEmprest, numParcelas) + 
				" é menor que o percentual máximo do empréstimo = R$ " + calculovalorMaxParcelas(salarioBruto, perMaxSalario) + " em R$ " + 
				(calculovalorMaxParcelas(salarioBruto, perMaxSalario)-(calculoValorParcela(valorEmprest, numParcelas)) + "\n"+
				"Portanto o empréstimo poderá ser concedido!"));
			}
	}
}
