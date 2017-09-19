import java.math.BigDecimal;
import java.util.Scanner;

//12. Ler três números e calcular uma regra de 3

public class Doze {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float num1, num2, num3;
		float resultado;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		num3 = sc.nextInt();

		resultado = ((num2 * num3) / num1);
		
		System.out.println("Resultado: " + resultado);
	
	}
	
}
