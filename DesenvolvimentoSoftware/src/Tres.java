//3. Fazer um programa que recebe uma String do usuário e imprime 10 vezes
import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usuario;
		
		System.out.println("Digite seu nome: ");
		
		usuario = sc.nextLine();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(i + ":" + usuario);
			
		}
		
		sc.close();
	}
	
}
