public interface Library {
	public int getId(String username);
	public String getName();
	public void setMaxBooksPerUser(int maxBooksPerUser);
	public int getMaxBooksPerUser();
}