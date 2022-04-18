package model;

public class Leopardo3 extends Thread{
	public Leopardo3(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(600);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - corri�: " + i + " mts.");
			if (i % 10 == 0) {
				try {
					Thread.sleep(1900);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " - acab� ");
	}


}
