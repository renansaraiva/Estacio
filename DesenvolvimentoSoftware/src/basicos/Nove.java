package basicos;
//9. Imprimir se um n�mero � par ou �mpar

import java.util.Scanner;

public class Nove {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero: ");

		num = sc.nextInt();

		if((num % 2) == 0) {
			System.out.println("O n�mero " + num + " � par!");
		} else {
			System.out.println("O n�mero " + num + " � impar!");
		}

	}

}
