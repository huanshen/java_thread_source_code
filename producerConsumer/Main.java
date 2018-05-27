package producerConsumer;

public class Main {
	public static void main(String[] args) {
		
		Table table = new Table(3);
		new MakeThread("make-1", table, 31212).start();
		new MakeThread("make-2", table, 31012).start();
		new MakeThread("make-3", table, 31412).start();
		new EaterThread("eater-1", table, 65212).start();
		new EaterThread("eater-2", table, 31112).start();
		new EaterThread("eater-3", table, 31292).start();


	}

}
