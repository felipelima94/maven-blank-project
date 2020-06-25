package blankprocject.blankprocject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlankProcjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void teste() {
		final int num = new Teste().testeNumerico(1, 1);

		assertTrue(num == 0 ? true : false);
	}

}
