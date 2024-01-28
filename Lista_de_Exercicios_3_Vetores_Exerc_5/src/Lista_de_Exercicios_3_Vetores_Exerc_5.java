// Dado um vetor V = {91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50}, criar um programa
// a que receba um número pelo teclado, verifique e imprima na tela se este número existe no vetor.

import java.util.Scanner;

public class Lista_de_Exercicios_3_Vetores_Exerc_5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int vetor[] = { 91, 10, 50, 89, 45, 80, 2, 45, 3, 105, 95, 13, 26, 49, 50 };
		int copiaVetor[] = copiarVetor(vetor);
		int numDigitado = solicitarRetornarDados(leitor);
		boolean existe = verificarNumeroNoVetor(copiaVetor, numDigitado);

		retornarVerificacao(existe);

		leitor.close();
	}
	
	
	// FUNCTIONS

	public static int[] copiarVetor(int vetor[]) {
		int copiaVetor[] = new int[vetor.length];
		System.arraycopy(vetor, 0, copiaVetor, 0, vetor.length);
		return copiaVetor;
	}
	public static int solicitarRetornarDados (Scanner leitor) { 
		int numDigitado = 0;	
		
		System.out.print("Digite um número inteiro para conferência: ");
		numDigitado = leitor.nextInt();
		return numDigitado;
	}

	public static boolean verificarNumeroNoVetor(int copiaVetor[], int numDigitado) {
		boolean existe = false;
				
		for (int i = 0; i < copiaVetor.length; i++) {
			if (copiaVetor[i] == numDigitado) {
				existe = true;
			}
		}
		return existe;
	}
	
	public static void retornarVerificacao (boolean existe) {
		if (existe == true) {
			System.out.println("o número digitado existe no vetor.");
		}else{
			System.out.println("o número digitado: NÃO existe no vetor.");
		}
	}
}
