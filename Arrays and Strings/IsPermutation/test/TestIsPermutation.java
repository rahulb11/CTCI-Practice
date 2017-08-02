import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TestIsPermutation extends TestCase {

	
	public void test() {
		IsPermutation app = new IsPermutation();
		
		String str1 = "perftesting";
		String str2 = "qatesting";
		
		boolean actual_out = app.isPermutation(str1, str2);
		
		System.out.println(actual_out);
		
		assertFalse(actual_out);
	}

}
