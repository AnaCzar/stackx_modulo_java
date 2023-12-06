


public class Tarefa_26_Numeros_negativos_IF {

	public static void main(String[] args) {
		/*Desenvolva um programa que dados três números inteiros, informe quantos são negativos.*/

		int x = -3;
		int y = 15;
		int z = -1;
		int i = 0;
		
			if(x<0) {
				i =i+1;
			}else {
				i =i ;
			}
			
			if(y<0) {
				i=i+1;
			}else {
				i=i;
			}
			
			if(z<0) {
				i =i+1;
			}else {
				i=i;
			}
			System.out.println("Existem " + i +" numero(s) negativo(s)");
	}
}
