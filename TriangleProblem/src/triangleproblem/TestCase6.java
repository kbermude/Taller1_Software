package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase6 {

	@Test
	void test6() {
		boolean in=TriangleProblem.checkInputs(30,'b',2);
		assertTrue(in);
	}
}
