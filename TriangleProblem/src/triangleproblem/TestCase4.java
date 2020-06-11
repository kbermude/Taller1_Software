package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase4 {

	
	@Test
	void test4() {
		String type="Not a triangle";
		String type2=TriangleProblem.typeTriangle(6, 13, 6);
		assertEquals(type,type2);
	}
}
