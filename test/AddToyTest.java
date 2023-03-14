import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.ToyList;
import model.Figure;
/**
 * Tests if toyList increases as toy objects are Added to it
 * @author romag
 *
 */
class AddToyTest {
	
	@Test
    void testAddToyIncreases() {
		ToyList toyList = new ToyList();

        int originalSize = toyList.getList().size();

        // Add a new toy
        Figure toyF = new Figure("1234567890", "Action Figure", "Hasbro", "10.0", 10, 6, 'A');
        toyList.add(toyF);

        // Check if the size of the list has increased by one
        assertEquals(originalSize + 1, toyList.getList().size());
    }
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
