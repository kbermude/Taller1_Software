package triangleproblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase5 {

	@Test
	void test5() {
		String type="Scalene";
		String type2=TriangleProblem.typeTriangle(274, 12, 97);
		System.out.println(type2);
		assertNotEquals("error",type,type2);
	}

}
