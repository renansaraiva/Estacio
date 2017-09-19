//10. Ler dois números e uma String com um operador e imprimir o resultado da operação

import java.util.Scanner;

public class Dez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String operador;

		System.out.println("Digite o operador: ");
		operador = sc.nextLine();
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();

		if(operador.equals("/")) {
			System.out.println("Resultado: " + (num1/num2));
		} else if (operador.equals("*")) {
			System.out.println("Resultado: " + (num1*num2));
		} else if (operador.equals("+")) {
			System.out.println("Resultado: " + (num1+num2));
		} else if (operador.equals("-")) {
			System.out.println("Resultado: " + (num1-num2));
		}

	}
	
}
