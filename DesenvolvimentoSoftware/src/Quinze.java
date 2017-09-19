//15. Ler dois números e dizer quanto o segundo representa em percentual do primeiro.

import java.util.Scanner;

public class Quinze {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float num1, num2;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		num2 = sc.nextFloat();
		
		System.out.println(num1 + "% de " + num2 + "é: " + (num1/num2));
	
	}
	
}
