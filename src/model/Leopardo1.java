package model;

public class Leopardo1 extends Thread {
	public Leopardo1(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - corrió: " + i + " mts.");
			if (i % 10 == 0) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " - acabó ");
	}

}
