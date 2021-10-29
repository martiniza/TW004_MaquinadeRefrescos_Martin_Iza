package com.maquinarefrescos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RefrescoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando pruebas");}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Finalizando prueba");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testrecargarefresco() {

		// declarar datos de entrada
		int cantidadrecarga = 20;
		Refresco agua = new Refresco(0, 0.5f, "Agua");

		// declarar datos esperados
		int cantidadesperada = 20;
		// Ejecutar la prueba
		int Recarga = agua.Reload(cantidadrecarga);
		// Comparación
		if (cantidadesperada != Recarga) {
			fail("Este metodo debe ser revisado, el resultado es " + Recarga);
		}
		fail("Not yet implemented");
	}

}
