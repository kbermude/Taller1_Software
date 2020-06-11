package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase5 {

	@Test
	void test5() {
		boolean in=TriangleProblem.checkInputs(274, 12, 97);
		assertTrue(in);
	}

}
