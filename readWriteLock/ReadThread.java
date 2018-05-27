package readWriteLock;

import java.util.Random;

public class ReadThread extends Thread {
	private final Data data;
	private static final Random random = new Random();

	public ReadThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		try {
			while (true) {
				//Thread.sleep(1000);
				char[] readbuf = data.read();
				System.out.println(Thread.currentThread().getName() + " reads " + String.valueOf(readbuf));
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
