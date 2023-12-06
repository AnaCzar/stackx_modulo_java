import java.util.Scanner;

public class Tarefa_13_Altura_e_sexo_IF {
	/*Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule
	 *  e imprima seu peso ideal, utilizando as seguintes Fórmulas: para homens: (72.7 * Altura) – 58 para mulheres: (62.1 * Altura) – 44.7
	 */
	
	public static double calculoPesoIdealMasc(double altura){
		return (72.7 * altura) - 58;
	}
	
	public static double calculoPesoIdealFem(double altura){
		return (62.1 * altura) - 44.7;
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		double altura;
		int sexo;
		double peso;
		
		System.out.println("Digite a altura a ser calculada(em cm)");
		altura = leitor.nextDouble();
		System.out.println(altura);
		
		System.out.println("Digite o código do sexo a ser calculado: (1)Fem e (2)Masc");
		sexo = leitor.nextInt();
		System.out.println(sexo);
			
		
			if(sexo ==1) {
				peso = calculoPesoIdealFem(altura);
				System.out.println("O peso ideal para uma mulher, com "+ altura + " cm de altura é de " + peso + " kg.");
			}else if(sexo == 2) {
				peso = calculoPesoIdealMasc(altura);
				System.out.println("O peso ideal para um homem, com "+ altura + " cm de altura é de " + peso + " kg.");
			}else {
				System.out.println("Erro !!! Digite uma opção válida: 1 (Feminino) ou 2 (Masculino)");
			}
	}
}
