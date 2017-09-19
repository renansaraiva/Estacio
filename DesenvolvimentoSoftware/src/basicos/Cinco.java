package basicos;
//5. Ler um número e imprimir o seu quadrado
import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		System.out.println("Quadrado: " + numero*numero);
		
		sc.close();
		
	}
	
}
