import java.util.Scanner;

public class Tarefa_17_Triangulo_IF {

	public static void main(String[] args) {
		/*Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
		 * Sendo que:
		 * Triângulo Equilátero: possui os 3 lados iguais.
		 * Triângulo Isóscele: possui 2 lados iguais.
		 * Triângulo Escaleno: possui 3 lados diferentes.
		 */ 
		
		Scanner leitor = new Scanner(System.in);
		
		double medPrimLado = 0.0;
		double medSegLado = 0.0;
		double medTercLado = 0.0;
		
		while(medPrimLado <= 0.0) {
		System.out.println("Digite a medida do primeiro lado do triângulo(somente maior que zero)");
		medPrimLado = leitor.nextDouble();
		System.out.println(medPrimLado);
		}
		
		while(medSegLado <= 0.0) {
		System.out.println("Digite a medida do segundo lado do triângulo(somente maior que zero)");
		medSegLado = leitor.nextDouble();
		System.out.println(medSegLado);
		}
		
		while(medTercLado <= 0.0) {
		System.out.println("Digite a medida do terceiro lado do triângulo(somente maior que zero)");
		medTercLado = leitor.nextDouble();
		System.out.println(medTercLado);
		}
		
			if(medPrimLado == medSegLado && medSegLado== medTercLado) {
				System.out.println("O triângulo de medidas : "+ medPrimLado + " ," + medSegLado + " e " + medTercLado + " " + " é um Equilátero.");
			}else if(medPrimLado != medSegLado && medSegLado != medTercLado && medPrimLado != medTercLado) {
				System.out.println("O triângulo de medidas : "+ medPrimLado + " ," + medSegLado + " e " + medTercLado + " " +" é um Escaleno.");
			}else {
				System.out.println("O triângulo de medidas : "+ medPrimLado + " ," + medSegLado + " e " + medTercLado + " " + " é um Isóceles.");
			}
	}
}
