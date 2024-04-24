package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	@BeforeEach
	public void nuevaCuenta() {
		Cuenta c = new Cuenta("ES4567098776654544333", 100);
	}
	// Creas el objeto solo una vez y ya lo puedes referenciar luego
	@Test
	void testGetSaldoIgual() {
		Cuenta c = new Cuenta("ES4567098776654544333", 100);
		float saldo = c.getSaldo();
		assertEquals(100, saldo);
	}

	@Test
	void testGetSaldo() {
		Cuenta c = new Cuenta("ES4567098776654544333", 1000);
		float saldo = c.getSaldo();
		assertNotEquals(100, saldo);
	}

	@Test
	void testSetSaldo() {
		Cuenta c = new Cuenta("ES4567098776654544333", 100);
		c.setSaldo(500);
		assertEquals(500, c.getSaldo());
	}

	@Test
	void testIngresarDinero() {
		Cuenta c = new Cuenta("ES4567098776654544333", 100);
		c.ingresarDinero(350);
		assertEquals(450, c.getSaldo());
	}

	@Test
	void testSacarDineroMenos() {
		Cuenta c = new Cuenta("ES4567098776654544333", 100);
		c.extraerDinero(50);
		assertEquals(50, c.getSaldo());
	}
}
