// Dado um vetor V = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0}, 
 // criar um programa que efetua a média dos valores e imprima o resultado. 

public class Lista_de_Exercicios_3_Vetores_Exerc_3 {
	
	public static double calcularMedia(double vetor[]) { 
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 0 ; i < vetor.length; i++) {
			System.out.printf("A soma do %.3f + %.3f é igual a = ", soma, vetor[i]); // mostra a cada loop a composição da soma de cada iten
			soma = soma + vetor[i];
			System.out.printf("%.3f %n", soma); // resultado de cada soma(parcial), para demonstrar a cada loop
			media = soma/(i+1);
			System.out.printf("Media parcial = %.3f %n", media); // resultado de cada média(parcial)
		}
		return media; 
	}
	
	public static void exibirMedia(double media) {  
		System.out.printf("A Média geral é = %.3f", media); // demonstrador de media geral
	}
	
	public static double[] copiarVetor(double vetor[]){  // copia do vetor, para utilizar nos cálculos
		double copiaVetor[]= new double[vetor.length];  
		System.arraycopy(vetor, 0, copiaVetor, 0, vetor.length);
		return copiaVetor;
		}
	
	public static void processarMain1() {  // centro de processamento
		double media = 0.0;
		
		double vetor[] = {85.0, 105.0, 40.0, 90.0, 35.0, 65.0, 33.0, 22.0, 19.0, 50.0};
		double copiaVetor[] = copiarVetor(vetor); 

		media = calcularMedia(copiaVetor);
		exibirMedia(media);

	}
	
	public static void main(String[] args) {
		processarMain1();
	}

}
