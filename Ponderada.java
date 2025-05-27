package lista02;

import java.util.Scanner;

public class Ponderada {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua 1°nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("O peso da 1°nota:");
		int peso1 = sc.nextInt();
		System.out.println("Digite o valor da 2°nota: ");
		float nota2 = sc.nextFloat(); 
		System.out.println("O peso da  2°nota: ");
		int peso2 = sc.nextInt();
		System.out.println("Digite o valor da sua 3°nota:");
		float nota3 = sc.nextFloat();
		System.out.println("O peso da  3°nota: ");
		int peso3 = sc.nextInt();
		System.out.println("A nota ponderada é: ");
		sc.close();
	}
	
}
