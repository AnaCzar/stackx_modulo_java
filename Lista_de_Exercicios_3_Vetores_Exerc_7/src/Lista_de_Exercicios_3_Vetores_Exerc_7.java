// 07)	Criar um programa preencha um vetor de inteiros de 10 posições, via teclado. 
// Após o preenchimento do vetor, o programa deverá verificar quais são os elementos ímpares
// e gerar um novo vetor com esses elementos. Por fim, o programa deverá exibir na tela os dois vetores.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lista_de_Exercicios_3_Vetores_Exerc_7 {

	public static void main(String[] args) {
		
		Scanner leitor = gerarScanner();
		int vetorNum[] = criarVetor(10);
		
		try {
			digitarNumVetor(vetorNum, leitor);
		}
		catch(InputMismatchException e) {
			System.out.println("erro - digite somente números e/ou números inteiros");
		}
		
							
		int i2 = verificarQtdadeIndiceVetor2(vetorNum);
		int vetorNum2[] = criarVetor(i2);
		gerarConteudoVetor2(vetorNum, vetorNum2);
		System.out.println("O primeiro vetor (vetor 1)  = ");
		imprimirVetor(vetorNum);
		System.out.println("O segundo vetor (vetor 2) = ");
		imprimirVetor(vetorNum2);

		leitor.close();
	}

	// FUNCTIONS

	private static int[] criarVetor(int tamanho) {
		int vetor[] = new int[tamanho];
		return vetor;
	}

	private static Scanner gerarScanner() {
		return new Scanner(System.in);
	}

	private static void digitarNumVetor(int[] vetorNum, Scanner leitor) {
			
				for (int i = 0; i < vetorNum.length; i++) {
					System.out.println("Digite o " + (i + 1) + "º" + "numero inteiro");
					int num = leitor.nextInt();
					vetorNum[i] = num;
				}
	}


	private static int verificarQtdadeIndiceVetor2(int[] vetorNum) {
		int i2 = 0;
		for (int i = 0; i < vetorNum.length; i++) {
			if (vetorNum[i] % 2 != 0) {
				i2++;
			}
		}
		return i2;
	}

	private static void gerarConteudoVetor2(int[] vetorNum, int[] vetorNum2) {
		for (int i = 0, i2 = 0; i < vetorNum.length; i++) {
			if (vetorNum[i] % 2 != 0) {
				vetorNum2[i2] = vetorNum[i];
				i2++;
			}
		}
	}

	private static void imprimirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
