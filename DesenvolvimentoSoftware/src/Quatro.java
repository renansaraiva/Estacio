//4. Fazer um programa que recebe uma String e um número e imprime a String lida a quantidade de vezes indicada pelo número lido
import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int num;
		
		System.out.println("Digite seu nome: ");
		System.out.println("Digite um numero: ");
		
		nome = sc.nextLine();
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			System.out.println(i + ": " + nome);
			
		}
		
		sc.close();
		
	}
	
}
