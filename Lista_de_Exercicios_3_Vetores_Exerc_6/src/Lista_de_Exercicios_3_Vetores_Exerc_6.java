// 06)	Dado um vetor V = {56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9}, 
// criar um programa que leia um número e informe na tela quantas vezes este número foi encontrado no vetor.

public class Lista_de_Exercicios_3_Vetores_Exerc_6 {

	public static void main(String[] args) {
		int vetorOrigem[] = { 56, 48, 9, 48, 60, 13, 24, 27, 13, 56, 85, 9, 48, 55, 9 };
		int vetorCopia[] = copiarVetorOrigem(vetorOrigem);
		int numProcura = 48; 	// entrar aqui com o valor a procurar
		int contador = acionarContador(vetorCopia, numProcura);
		imprimirContador(contador, numProcura);
	}

	public static int[] copiarVetorOrigem(int vetorOrigem[]) {
		int vetorCopia[] = new int[vetorOrigem.length];
		System.arraycopy(vetorOrigem, 0, vetorCopia, 0, vetorOrigem.length);
		return vetorCopia;
	}

	public static int acionarContador(int vetorCopia[], int numProcura) {
		int contador = 0;
		int i = 0;
		while (i < vetorCopia.length) {
			if (vetorCopia[i] == numProcura) {
				contador++;
			} else {
				contador = contador + 0;
			}
			i++;
		}

		return contador;
	}

	public static void imprimirContador(int contador, int numProcura) {
		System.out.printf("O número de vezes que o " + numProcura + " aparece no vetor é = " + contador);
	}
}