package lista02;

import java.util.Scanner;

public class Trianguloarea {

             public static double calcularPerimetro(double a, double b, double c) {
	         return a + b + c;
}
             public static double calcularAreaHero(double a, double b, double c) {
                 double s = (a + b + c) / 2; 
                 return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}	
             public static void main(String[]args) {    
            	 Scanner scanner = new Scanner(System.in);
            	 
            	 System.out.println("Escolha o tipo de cálculo: ");
            	 System.out.println("Perímetro e área usando base e altura");
            	 System.out.println("Perímetro e área usando os t");
             }
	                                                               	
}
