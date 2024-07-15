package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void igualADois() {
		int a = 1 + 1;
		assertEquals(2, a);
	}

	@Test
	public void igualATres() {
		int x = 2 + 10 - 9;
		assertEquals(3, x);
	}

}