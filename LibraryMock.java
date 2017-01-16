public class LibraryMock implements Library {
	public String getName() {
		return "Mock Library";
	}
	public int getMaxBooksPerUser() {
		return 1;
	}
	public void setMaxBooksPerUser(int maxBooksPerUser) {}
}