import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.BoardGame;
import model.Toy;
/**
 * Asserting correct Toy return 
 * @author romag
 *
 */
class SearchReturnTest {
	
	 @Test
	    public void testFormatData() {
	        Toy toy = new BoardGame("1234567890", "Monopoly", "Hasbro", "19.99", 10, 8, 2, 8, "Designer");
	        String expected = "1234567890;Monopoly;Hasbro;19.99;10;8;Designer";
	        String actual = toy.formatData();
	        assertEquals(expected, actual);
	    }

	    @Test
	    public void testToString() {
	        Toy toy = new BoardGame("1234567890", "Monopoly", "Hasbro", "19.99", 10, 8, 2, 8, "Designer");
	        String expected = "Category: BoardGame, Serial Number: 1234567890, Name: Monopoly, Brand: Hasbro, Price: 19.99, Available Count: 10, Age Appropriate: 8, Designer(s): Designer";
	        String actual = toy.toString();
	        assertEquals(expected, actual);
	    }
	@Test
	void test() {
		fail("Not yet implemented");
	}
}
