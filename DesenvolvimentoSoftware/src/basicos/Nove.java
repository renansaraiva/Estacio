package basicos;
//9. Imprimir se um número é par ou ímpar

import java.util.Scanner;

public class Nove {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero: ");

		num = sc.nextInt();

		if((num % 2) == 0) {
			System.out.println("O número " + num + " é par!");
		} else {
			System.out.println("O número " + num + " é impar!");
		}

	}

}
