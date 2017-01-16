public class User {
	private String name;
	private int id;
	private static int counter = 0;
	public User(String name) {
		this.name = name;
		this.id = this.counter;
		this.counter++;
	}
	public int getID() {
		return this.id;
	}
}