import junit.framework.TestCase;

public class TestAllUnique extends TestCase {
	public void testAllUnique() {
		AllUnique app = new AllUnique();
		
		String str_input = "Rahul";
		boolean expected_output = true;
		boolean actual_output = app.isAllUnique(str_input);
		
		System.out.println(actual_output);
		
		assertEquals(expected_output, actual_output);
	}
}
