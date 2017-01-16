import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
	@Test
	public void getLibraryName() {
		LibraryImpl library = new LibraryImpl("Birkbeck");
		String name = library.getName();
		assertEquals(name, "Birkbeck");
	}
	@Test
	public void getMaxBooksNumber() {
		LibraryImpl library = new LibraryImpl("Birkbeck");
		library.setMaxBooksPerUser(3);
		int max = library.getMaxBooksPerUser();
		assertEquals(max, 3);
	}
}
