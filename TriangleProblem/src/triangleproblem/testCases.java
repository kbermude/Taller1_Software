package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCases {

	@Test
	void test1() {
		String type="Isosceles";
		assertEquals(type, TriangleProblem.typeTriangle(5, 5, 5));
	}
}
