//14. Ler dois números que representam os valores dos catetos de um triângulo retângulo e
//    imprimir o valor da hipotenusa (a2 = b2 + c2)

import java.util.Scanner;

public class Catorze {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float lado1, lado2;
		double hipotenusa;
		
		System.out.println("Digite o valor do primeiro cateto: ");
		lado1 = sc.nextFloat();
		
		System.out.println("Digite o valor do segundo cateto: ");
		lado2 = sc.nextFloat();
		
		hipotenusa = Math.hypot(lado1, lado2);
		
		System.out.printf("Valor da hipotenusa: %.2f", hipotenusa);
	
	}
	
}
