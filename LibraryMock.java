public class LibraryMock implements Library {
	public int getId(String username) {
		return 1;
	}
	public String getName() {
		return "Mock Library";
	}
	public int getMaxBooksPerUser() {
		return 1;
	}
	public void setMaxBooksPerUser(int maxBooksPerUser) {}
}