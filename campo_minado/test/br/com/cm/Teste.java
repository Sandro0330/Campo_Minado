package br.com.cm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		int a = 2 + 3;
		
		assertEquals(5, a);
	}

	@Test
	void testeIgual() {
		int x = 4 + 6;
		
		assertEquals(10, x);
	}
}
