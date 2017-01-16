import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	private LibraryImpl library;
	@Before
	public void librarySetUp() {
		library = new LibraryImpl("Birkbeck");
	}
	@After
	public void libraryTearDown() {
		library = null;
	}
	@Test
	public void getLibraryName() {
		String name = library.getName();
		assertEquals(name, "Birkbeck");
	}
	@Test
	public void getMaxBooksNumber() {
		library.setMaxBooksPerUser(3);
		int max = library.getMaxBooksPerUser();
		assertEquals(max, 3);
	}
	@Test
	public void getUserId() {
		int id = library.getId("lucas");
		assertEquals(id, 1);
		int verifyId = library.getId("lucas");
		assertEquals(verifyId, 1);
		int id2 = library.getId("bob");
		assertEquals(id2, 2);
	}
}
