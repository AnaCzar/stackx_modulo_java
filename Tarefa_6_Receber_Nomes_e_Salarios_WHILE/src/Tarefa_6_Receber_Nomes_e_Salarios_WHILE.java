import java.util.Scanner;

public class Tarefa_6_Receber_Nomes_e_Salarios_WHILE {

	public static void main(String[] args) {
		/*Tarefa_6_Receber_Nomes_e_Salarios_WHILE
		 * Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se que outro funcionário, João, tem salário equivalente
		 *  a um terço do salário de Carlos. Carlos aplicará seu salário integralmente na caderneta de poupança, que rende 2% ao mês, e João 
		 *  aplicará seu salário integralmente no fundo de renda fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade 
		 *  de meses necessários para que o valor pertencente a João iguale ou ultrapasse o valor pertencente a Carlos.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		double salarioCarlos;
		double percRendPoupanca = 0.02;
		double percRendRendaFixa = 0.05;
		int mes = 1;
		
		System.out.println("Digite o salário de Carlos");
		salarioCarlos = leitor.nextInt();
		System.out.println("O salário de Carlos é R$ = " + salarioCarlos);
		
		double salarioJoão = salarioCarlos/3;
		System.out.println("O salário de João é R$ "+ salarioJoão);
		
		double rendimTotCarlos = salarioCarlos *(1 + percRendPoupanca);
		System.out.println("O valor total de Carlos, no mês " + mes + " foi de R$ " + rendimTotCarlos);
		double rendimTotJoao = (salarioCarlos/3) * (1 + percRendRendaFixa);
		System.out.println("O valor total de João no mês " + mes + " foi de R$ " + rendimTotJoao);

		while(rendimTotCarlos > rendimTotJoao) {
			mes = mes+1;
			rendimTotCarlos = rendimTotCarlos * (1+ percRendPoupanca);
			rendimTotJoao = rendimTotJoao * (1 + percRendRendaFixa);
			}
		System.out.println("No mês " + mes + " O valor total de João(R$ " + rendimTotJoao + " ) superou/igualou o valor total de Carlos(R$ "
				+ rendimTotCarlos +" )");
		
	}

}
