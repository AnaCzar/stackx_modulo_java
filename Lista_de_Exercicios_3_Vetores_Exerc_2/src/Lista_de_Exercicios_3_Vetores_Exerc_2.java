 /*Dado um vetor V = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10} criar um programa que 
 * efetua a soma dos valores e imprima o resultado. */

public class Lista_de_Exercicios_3_Vetores_Exerc_2 {

	public static int calcularSoma(int vetor[]) { //subrotina para calculo da soma dos itens do vetor
		int soma = 0;
		
		for(int i = 0 ; i < vetor.length; i++) {
			System.out.printf("A soma do %d + %d é igual a = ", soma, vetor[i]); // mostrar a cada loop o resultado paracial das somas
			soma = soma + vetor[i];
			System.out.printf("%d %n", soma); // totalizador de soma, para demonstrar a cada loop
			}
		 return soma;
	}
	
	public static void exibirSoma(int soma) {  //subrotina para demonstração da soma final
		System.out.printf("%d", soma);
	}
	
	public static int[] copiarVetor(int vetor[]){  //subrotina para realizar a cópia do vetor(indicado para realizar alterações qq em um vetor origem
		int copiaVetor[]= new int[vetor.length];  
		System.arraycopy(vetor, 0, copiaVetor, 0, vetor.length);
		return copiaVetor;
		}
	
	public static void processarMain() {  // void - chamando as sub-classes para execução dos cálculo
		int soma = 0;
		
		int vetor[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
		//System.out.println(vetor.length); (caso queira: metodo para chamada de contagem de indice)
		
		int copiaVetor[] = copiarVetor(vetor); 

		soma = calcularSoma(copiaVetor);
		exibirSoma(soma);

	}
	
	public static void main(String[] args) {
	
		processarMain();
		
		
		
		
		
		// outra forma, sem rotina e sem a copia do vetor(o que não é recomendado), usando printf
		
		/*for(int i = 0; i < copiaVetor.length; i++) {
			System.out.printf("A soma do %d + %d é igual a = ", soma, copiaVetor[i]); // ou print desta forma
			soma = soma + copiaVetor[i];
			System.out.printf("%d %n", soma);
			
		}
		
		System.out.printf("O valor total da soma dos itens do vetor é = %d", soma);*/
		
		// outra forma, sem rotina e sem a copia do vetor(o que não é recomendado), usando printf
		
		/*int v[] = {5, 10, 8, 4, 9, 16, 28, 40, 80, 10};
		int x = 0; 
		
		for(int i = 0; i < v.length; i++){     
			System.out.print("A soma do " + x + " + " + v[i] + " é igual a = ");
			x =(x + v[i]);
			System.out.println(x);
		}
		
		System.out.println("A soma de todos os números do vetor é = " + x );*/
		
	}

}
