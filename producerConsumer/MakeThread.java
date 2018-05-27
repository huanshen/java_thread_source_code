package producerConsumer;

import java.util.Random;

public class MakeThread extends Thread{
	private final Random random;
	private final Table table;
	private static int id = 0;
	
	public MakeThread(String name, Table table, long seed) {
		super(name);
		this.table = table;
		this.random = new Random(seed);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(random.nextInt(1000));
				String cake = "[ cake NO." + nextId() + " by " + getName() + " ]";
				table.put(cake);
			} 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static synchronized int nextId() {
		return id++;
	}
	
	

}
