mport static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MyUnitTest {

	void testStringConcat() {
		MyUnit myUnit = new MyUnit();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}