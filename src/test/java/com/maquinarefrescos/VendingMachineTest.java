package com.maquinarefrescos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachineTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSinStock() {
		/**
		 * Estamos intentando vender de la maquina sin que le quede stock. 
		 */
		
	Refresco re = new Refresco(0, 80, "Agua");	     // Crear el objeto refresco
	
	double valorEsperado = 0;
	
	double valorRecibido = re.getUnidades(); // Ahora mismo yo espero que esto me devuelva -1
	
	if (valorRecibido <= valorEsperado) {
	
		fail("Error en la prueba, deberia devolver -1");}
	}
	@Test
	public void testSinCAMBIOSUFICIENTEENLAMAQUINA() {
		/**
		 * Estamos intentando vender de la maquina sin que le quede stock. 
		 */
		
	Refresco re = new Refresco(10, 80, "Agua");	     // Crear el objeto refresco
	VendingMachine ve=new VendingMachine(re,10);   // Crear el objeto maquina de refrescos
	
	double dineroIng = 100;
	double cambioEsperado = dineroIng - re.getPrecio();
	
	double cambioEnMaquina = ve.getCambios();
	
	
	//Ejecuto la prueba
	
	ve.vender(re, dineroIng); // inserto 100 cents para comprar el refresco de 80 cents.
	
	if (cambioEnMaquina < cambioEsperado) {
	
		fail("Error en la prueba, no tienes cambios suficientes");}
	}
	@Test
	public void test3() {
		/**
		 * Estamos intentando vender de la maquina sin que le quede stock. 
		 */
		
	Refresco re = new Refresco(0, 80, "Agua");	     // Crear el objeto refresco
	//VendingMachine ve=new VendingMachine(re, 100);   // Crear el objeto maquina de refrescos
	
	
	double valorEsperado = 0;
	
	double valorRecibido = re.getUnidades(); // Ahora mismo yo espero que esto me devuelva -1
	
	if (valorRecibido <= valorEsperado) {
	
		fail("Error en la prueba, deberia devolver -3");}
	}
}
