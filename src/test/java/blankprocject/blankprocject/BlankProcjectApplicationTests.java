package blankprocject.blankprocject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class BlankProcjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void teste() {
		Teste teste = new Teste();

		Boolean num = teste.testeNumerico(2, 2);

		assertTrue(num);
	}

}
