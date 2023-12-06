	/*Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.*/
import java.util.Scanner;

public class Tarefa_28_Idade_completa_IF {

	
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);	
	
	int anoNasc;
	int mesNasc;
	int diaNasc;
	int calcMes;
	int calcAno;
	int calcDia;
	int anoAtual = 2023;
	int mesAtual = 11;
	int diaAtual = 22;
	
	
	System.out.println("Digite seu ano de nascimento");
	anoNasc = leitor.nextInt();
	System.out.println(anoNasc);
	
	System.out.println("Digite seu mês de nascimento");
	mesNasc = leitor.nextInt();
	System.out.println(mesNasc);
	
	System.out.println("Digite o dia de seu nascimento");
	diaNasc = leitor.nextInt();
	System.out.println(diaNasc);
	
	calcAno = anoAtual - anoNasc;
	calcMes = mesAtual - mesNasc;
	calcDia = diaAtual - diaNasc;
	
		if(calcMes<0) {    //mes a ocorrer (-)
			calcAno = calcAno - 1;  
		}else if (calcMes == 0){ //mes atual
			if(calcDia < 0) { //dia a ocorrer (-)
				calcAno = calcAno - 1;
			}else{				// dia passado ou dia de hj
		     }
		}else{                     //mes já passado
		}
		System.out.println("Você tem " + calcAno + " anos!!");
	}
}
