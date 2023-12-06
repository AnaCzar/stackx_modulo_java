import java.util.Scanner;

public class Tarefa_2_idade_e_peso_IF {

	public static void main(String[] args) {
		/* Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir, verifique
		e mostre em qual grupo de risco essa pessoa se encaixa.*/
		
		Scanner leitor = new Scanner(System.in);
		
		double peso;
		int idade;
		int risco;
		
		System.out.println("Digite seu peso atual(em kg)");
		peso = leitor.nextDouble();
		System.out.println(peso);
		
		System.out.println("Digite sua idade atual(em anos completos)");
		idade = leitor.nextInt();
		System.out.println(idade);
		
		if (peso>90) {
			if(idade>50) {
				risco = 1;					
			}else if(idade<20) {
				risco = 7;
			}else {
				risco = 4;
			}
		}
		else if (peso<60) {
			if(idade>50) {
				risco = 3;					
			}else if(idade<20) {
				risco = 9;
			}else {
				risco = 6;
			}
		}
		else {
			if(idade>50) {
				risco = 2;					
			}else if(idade<20) {
				risco = 8;
			}else {
				risco = 5;
			}
		}

		
		System.out.println("Para a idade = " + idade + " anos e peso = " + peso + " kg, a classe de risco é :" + risco);
	}

}
