package model;

public class Cubos extends Thread{

	@Override
	public void run() {
		int array[] = {2,7,5,4,9,3,6,8,1,10};
		float cubos;
		cubos = (float) (Math.pow(array[0], 3)+
				Math.pow(array[1] ,3)+
				Math.pow(array[2], 3)+
				Math.pow(array[3], 3)+
				Math.pow(array[4], 3)+
				Math.pow(array[5], 3)+
				Math.pow(array[6], 3)+
				Math.pow(array[7], 3)+
				Math.pow(array[8], 3)+
				Math.pow(array[9], 3));
		System.out.println("Suma de cubos: ");
		System.out.println("{2,7,5,4,9,3,6,8,1,10}-- Resultado: " + cubos);
	}
	

}
