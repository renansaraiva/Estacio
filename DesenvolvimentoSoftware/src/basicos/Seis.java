package basicos;
//6. Ler dois números e imprimir o maior

import java.util.Scanner;

public class Seis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		System.out.println("Digite o segundo numero: ");
		
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é maior!");
		} else if (num2 > num1) {
			System.out.println("O número " + num2 + " é maior!");
		} else {
			System.out.println("Os números são iguais!");
		}
		
	}
	
}
