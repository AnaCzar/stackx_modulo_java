import java.util.Scanner;

public class Tarefa_14_Poligono_IF {
	/*Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). 
	 * Calcular e imprimir o seguinte:Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área 
	 * Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
	 * Se o número de lados for igual a 5 escrever PENTÁGONO.
	 * Obs: O foco aqui é a lógica com o comando de controle IF, demais conhecimentos envolvidos pesquise mais.*/
	
	public static double calculoAreaTriangulo(double medidaLado) {
		return (Math.pow(medidaLado,2)*Math.sqrt(3))/4;
	}
	public static double calculoAreaQuadrado(double medidaLado) {
		return Math.pow(medidaLado,2);
	}
	
	public static void main(String[] args) {
 		
		Scanner leitor = new Scanner(System.in);
		
		int numLadoPoligono = 1;
		double medidaLado;
		double areaPoligono;
		
		
		while(numLadoPoligono<3 | numLadoPoligono>5){
				System.out.println("Digite a quantidade de lados do poligono regular(somente: 3 ou 4 ou 5)");
				numLadoPoligono = leitor.nextInt();
				System.out.println(numLadoPoligono);
			}
		
		System.out.println("Digite a medida do lado do poligono regular(em cm)");
		medidaLado = leitor.nextInt();
		System.out.println(medidaLado);
		
			if(numLadoPoligono == 3) {
				areaPoligono = calculoAreaTriangulo(medidaLado);
				System.out.println("Poligono de " + numLadoPoligono +" lados é o triângulo e sua área é = "+ areaPoligono);
			}else if(numLadoPoligono == 4) {
				areaPoligono = calculoAreaQuadrado(medidaLado);
				System.out.println("Poligono de " + numLadoPoligono +" lados é o quadrado e sua área é = "+ areaPoligono);
			}else{
				System.out.println("Poligono de " + numLadoPoligono +" lados é o pentágono");
			}
	}
}
