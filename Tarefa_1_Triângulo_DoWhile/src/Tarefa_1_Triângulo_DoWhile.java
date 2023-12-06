import java.util.Scanner;

public class Tarefa_1_Triângulo_DoWhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double baseTriangulo;
		double alturaTriangulo;
		double areaTriangulo;
		
		
		
		do {
			System.out.println("Qual é a medida da base do triângulo?(considere apenas números maiores que zero)");
			baseTriangulo = leitor.nextDouble();
			System.out.println(baseTriangulo);
		} while(baseTriangulo <=0);
			
		
		
		do {
			System.out.println("Qual é a medida da altura do triângulo?(considere apenas números maiores que zero)");
			leitor.nextLine();
			alturaTriangulo = leitor.nextDouble();
			System.out.println(alturaTriangulo);
		} while(alturaTriangulo <=0);
				
		
		areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
		System.out.println("A área do triangulo é "+ areaTriangulo);	
	}
	
	

}
