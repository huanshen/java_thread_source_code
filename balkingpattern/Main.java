package balkingpattern;

public class Main {
	public static void main(String[] args) {
		Data data = new Data("data.txt", "(empty)");
		new ChangeThread("ChangeThread", data).start();
		new SaveThread("SaveThread", data).start();

	}

}
