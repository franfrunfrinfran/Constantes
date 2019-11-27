package es.studium.Constantes;

import java.util.Scanner;

public class Constantes {
	public static void main(String[] args) {
		
		int a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribir un número entero");
		a=teclado.nextInt();
		System.out.println("Escribir un segundo número ");
		b=teclado.nextInt();
		
		if (a<b) {
			System.out.println("La suma vale "+(a+b));
	
		}
		else {
			System.out.println("El producto vale "+(a*b));
		}
		teclado.close();
	}

}
