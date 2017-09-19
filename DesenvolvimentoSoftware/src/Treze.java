//13. Ler um número que representa o valor de uma conta de restaurante e a quantidade de pessoas,
//    imprimir o valor por pessoa

import java.util.Scanner;

public class Treze {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float valor;
		float pessoas;
		
		System.out.println("Digite o valor da conta: ");
		valor = sc.nextFloat();
		
		System.out.println("Digite o numero de pessoas: ");
		pessoas = sc.nextFloat();
		
		System.out.printf("Valor por pessoa: %.2f", valor/pessoas);
	
	}
	
}
