import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;
import java.lang.*;


public class DoubleLinkedListTest {

	private DoubleLinkedList<Integer> instance;
	
	@Before
	public void init() {
		instance = new DoubleLinkedList<Integer>();
	}
	
	@Test
	public void addNullTest() {
	
		instance.add(null);
	}
	
	@Test
	public void addValidTest() {
	
		instance.add(new Integer(1));
	}
}