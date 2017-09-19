//8. Ler dois números e imprimir a soma

import java.util.Scanner;

public class Oito {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float num1, num2;

		System.out.println("Digite o primeiro numero: ");
		System.out.println("Digite o segundo numero: ");

		num1 = sc.nextFloat();
		num2 = sc.nextFloat();

		System.out.println("Soma: " + (num1 + num2));

	}
	
}
