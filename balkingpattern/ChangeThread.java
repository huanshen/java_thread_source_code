package balkingpattern;

import java.io.IOException;
import java.util.Random;

public class ChangeThread extends Thread{
	private Data data;
	private Random random = new Random();
	public ChangeThread(String name, Data data) {
		super(name);
		this.data = data;
	}

	@Override
	public void run() {
		try {
			for(int i=0; true; i++) {
				data.change("NO." + i);
				Thread.sleep(random.nextInt(1000));
				data.save();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
