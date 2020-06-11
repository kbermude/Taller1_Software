package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase1 {

	@Test
	void test1() {
		String type="Equilateral";
		String type2=TriangleProblem.typeTriangle(5, 5, 5);
		assertEquals(type,type2);
	}
	@Test
	void test2() {
		String type="Scalene";
		String type2=TriangleProblem.typeTriangle(5, 3, 7);
		assertEquals(type,type2);
	}
	
	
}
