import java.util.Scanner;


public class Tarefa_4_Salario_Bruto_IF {
	
	public static double calculoSalLiq(double x , double y){
		return (x - (x*y));
	}

	public static void main(String[] args) {
		/* Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, calcule e mostre o valor a receber. Sabe-se que este 
		é composto pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.*/
	
	Scanner leitor = new Scanner(System.in);
			
	double salarioBruto = 0.0;
	double valorReceber;
	double gratifica;
	double imposto = 0.07;
	double salarioLiq = calculoSalLiq(salarioBruto, imposto);
	
	
	System.out.println("Digite o valor do salário bruto");
	salarioBruto = leitor.nextDouble();
	System.out.println(salarioBruto);
	
	if (salarioBruto>901.00) {
		gratifica = 35.00;
	}else if (salarioBruto<350.00) {
		gratifica = 100.00; 
	}else if(salarioBruto>=351.00 && salarioBruto<=600.00) {
		gratifica = 75.00;
	}else {
		gratifica = 50.00;
	}
	salarioLiq = calculoSalLiq(salarioBruto, imposto);
	valorReceber = salarioLiq + gratifica;
	System.out.println("O valor do salário bruto informado é de  = R$ " + salarioBruto + "\n" + "Deduzido o salário do imposto(Salario liquido) = R$ " + salarioLiq + "\n"+
			"O valor da gratificação é de = R$ " + gratifica + "\n" + "O valor total a receber do funcionário é de = R$ " +  valorReceber);
	
	}	
	
}
