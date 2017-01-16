import java.util.HashMap;

public class LibraryImpl implements Library {
	private String name;
	private int maxBooksPerUser;
	private HashMap<String, Integer> userList = new HashMap<String, Integer>();
	public LibraryImpl(String name) {
		this.name = name;
	}
	public int getId(String username) {
		if (userList.containsKey(username)) {
			return userList.get(username);
		}
		int id = userList.size() + 1;
		userList.put(username, id);
		return id;
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
