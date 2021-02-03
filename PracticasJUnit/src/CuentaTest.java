import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuentaTest {

	Cuenta c1;
	Cuenta c2;
	
	@Before
	public void setUp() throws Exception {
		c1=new Cuenta();
		c2=new Cuenta("Paco",1500);
	}

	@Test
	public void testCuenta() {
		Cuenta c0=new Cuenta();
		assertEquals(null,c0.getTitular());
		
	}

	@Test
	public void testCuentaStringDouble() {
		Cuenta cx=new Cuenta("Maria",2300);
		assertEquals("Maria",cx.getTitular());
	}

	@Test
	public void testGetTitular() {
		assertEquals("Paco",c2.getTitular());
	}

	@Test
	public void testSetTitular() {
		c1.setTitular("Jose");
		assertEquals("Jose",c1.getTitular());
	}

	@Test
	public void testGetCantidad() {
		assertEquals(1500,c2.getCantidad(),0.2);
	}

	@Test
	public void testSetCantidad() {
		c1.setCantidad(3450);
		assertEquals(3450,c1.getCantidad(),0.2);
	}

	@Test
	public void testIngresar() {
		c1.ingresar(500);
		assertEquals(500,c1.getCantidad(),0.2);
	}
	@Test
	public void testIngresar2() {
		c2.ingresar(-150);
		assertEquals(1500,c2.getCantidad(),0.2);
	}

	@Test
	public void testRetirar() {
		c2.retirar(500);
		assertEquals(1000,c2.getCantidad(),0.2);
	}
	@Test
	public void testRetirar2() {
		c2.retirar(2000);
		assertEquals(0,c2.getCantidad(),0.2);
	}


}
