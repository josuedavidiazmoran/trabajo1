package controller;

import model.Leopardo1;
import model.Leopardo2;
import model.Leopardo3;
import model.Leopardo4;

public class Principal2 {

	public static void main(String[] args) {
		Leopardo1 l1 = new Leopardo1("leopardo-1");
		Leopardo2 l2 = new Leopardo2("leopardo-2");
		Leopardo3 l3 = new Leopardo3("leopardo-3");
		Leopardo4 l4 = new Leopardo4("leopardo-4");
		System.out.println("Carrera: \n");
		l1.start();
		l2.start();
		l3.start();
		l4.start();

	}

}
