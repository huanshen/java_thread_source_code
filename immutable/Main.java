package immutable;

public class Main {
	public static void main(String[] args) {
		
		Person alice = new Person("Alice", "beijing");
		Person huanSky = new Person("HuanSky", "nanjing");

		new PrintPersonThread(alice).start();
		new PrintPersonThread(huanSky).start();


		//System.out.println("ss");
	}

}
