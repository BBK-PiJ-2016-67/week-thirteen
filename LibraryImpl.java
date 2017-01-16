public class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	public LibraryImpl(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getMaxBooksPerUser() {
		return this.maxBooksPerUser;
	}
	public void setMaxBooksPerUser(int maxBooksPerUser) {
		this.maxBooksPerUser = maxBooksPerUser;
	}
}