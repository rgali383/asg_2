import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.RemoveToy;
import controller.ToyList;
import model.Animal;
import model.BoardGame;
import model.Figure;
import model.Puzzle;
import model.Toy;
/**
 * Tests if toyList decreases as toy objects are Removed to it
 * @author romag
 *
 */
class RemoveToyTest {
		
		@Test
		void testRemoveToy() {
			// Create a toy list with some initial toys
			ToyList toyList = new ToyList();
			toyList.add(new Figure("SN1", "Figure 1", "Brand 1", "10.0", 5, 8, 'M'));
			toyList.add(new Animal("SN2", "Animal 1", "Brand 2", "19.99", 3, 6, "Species 1", 'F'));
			toyList.add(new Puzzle("SN3", "Puzzle 1", "Brand 3", "30.99", 100, 1, 'S'));
			toyList.add(new BoardGame("SN4", "Board Game 1", "Brand 4", "20", 4, 10, 2, 6, "Type 1"));
			
			// Create a RemoveToy object and remove a toy
			RemoveToy removeToy = new RemoveToy(toyList);
			Toy toyToRemove = toyList.getList().get(1); // Remove the second toy in the list (SN2)
			removeToy.remove(toyToRemove.getSerialNum());
			
			// Check that the size of the toy list has decreased by one
			Assert.assertEquals(3, toyList.getList().size());
		}

	    

	    @Test
	    void test() {
	    	fail("Not yet implemented");
	}
}
