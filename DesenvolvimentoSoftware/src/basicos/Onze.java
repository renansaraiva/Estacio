package basicos;
//11. Ler dois números e imprimir o primeiro elevado ao segundo

import java.util.Scanner;

public class Onze {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double resultado;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();

		resultado = Math.pow(num1, num2);
		System.out.println("O numero " + num1 + " elevado a " + num2 + " é: " + resultado);

	}

}
