package model;

import java.util.Scanner;

public class CalcularF extends Thread{
	
	@Override
	public void run() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Calcular el factorial de un numero");
		System.out.print("Digite su numero: ");
		long factorial = 1;
		int numero = leer.nextInt();
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		System.out.println("El factorial es: " + factorial);
		leer.close();
	}

}
