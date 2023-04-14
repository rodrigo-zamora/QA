package mx.iteso.triangle;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TriangleApplicationTests {

	@Test
	void contextLoads() {
	}

	// Test main method
	@Test
	public void testMain() {
		TriangleApplication.main(new String[] {});
	}

}
