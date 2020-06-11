package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase3 {

	@Test
	void test3() {
		String type="Isosceles";
		String type2=TriangleProblem.typeTriangle(5, 2, 5);
		assertEquals(type,type2);
	}

}
