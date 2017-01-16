import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	@Test
	public void constructor() {
		User user1 = new User("lucas");
		int id1 = user1.getID();
		User user2 = new User("bob");
		int id2 = user2.getID();
		assertNotEquals(id1, id2);
	}
}
