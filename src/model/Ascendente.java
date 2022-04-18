package model;

public class Ascendente extends Thread {
	
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(1500);
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Ascendente: "+i);
		}
	}
	

}
