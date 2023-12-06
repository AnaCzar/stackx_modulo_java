import java.util.Scanner;

public class Tarefa_9_Idade_para_voto_IF {
	/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano
	 *  (não é necessário considerar o mês em que ela nasceu).
	 */
	
	public static int calculoIdade(int anoAtual , int anoNasc) {
		return anoAtual - anoNasc ;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int anoNasc;
		int anoAtual = 2023;	
		
		System.out.println("Digite seu ano de nascimento");
		anoNasc = leitor.nextInt();
		System.out.println(anoNasc);
		System.out.println("Sua idade é " + calculoIdade(anoAtual, anoNasc)+" anos!!");
		
		if(calculoIdade(anoAtual, anoNasc)>=18 && calculoIdade(anoAtual, anoNasc)<=70) {
			System.out.println("Este ano, para você, o voto é obrigatório.");
		}else if(calculoIdade(anoAtual, anoNasc)<16) {
			System.out.println("Este ano, para você, o voto não é permitido.");
		}else{
			System.out.println("Este ano, para você, o voto é facultativo.");
		}
	}
}
