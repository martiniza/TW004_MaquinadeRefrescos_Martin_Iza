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
	public void testVENDERSINSTOCK() {
		/**
		 * Estamos intentando vender de la maquina sin que le quede stock. 
		 */
		
		Refresco re = new Refresco(0, 80, "Agua");	     // Crear el objeto refresco
		VendingMachine ve=new VendingMachine(re, 1000);   // Crear el objeto maquina de refrescos
		
		
		//Ejecutar la venta sobre la maquina "ve", compramos con 100 cts un refresco
		
		
		double valorEsperado = -1;
		
		double valorRecibido = ve.vender(re, 100); // Ahora mismo yo espero que esto me devuelva -1
		
		if (valorRecibido != valorEsperado) {
			
			fail("Error en la prueba, deberia devolver -1");}
	}
	
	@Test
	public void testSinCAMBIOSUFICIENTEENLAMAQUINA() {
		
	Refresco re = new Refresco(10, 80, "Agua");	     // Crear el objeto refresco
	VendingMachine ve=new VendingMachine(re,10);   // Crear el objeto maquina de refrescos
	
	double espero = -2; // significa no hay cambio suficientes
	
	
	//Ejecuto la prueba
	 // inserto 100 cents para comprar el refresco de 80 cents.
	
	 double cambioEnMaquina =ve.vender(re, 100); //atributo que da los cambios en la máquina
	
	 
	//Comparación
	if (cambioEnMaquina != espero) {
		
		
		fail("Error en la prueba, debería recibir -2");}
	}
	
	@Test
	public void testDinerodinsuficiente() {
	
		
	Refresco re = new Refresco(50, 80, "Agua");	     // Crear el objeto refresco
	VendingMachine ve=new VendingMachine(re, 1000);   // Crear el objeto maquina de refrescos
	
	double valorEsperado = -3;
	//Ejecutar la venta sobre la maquina "ve", compramos con 10 cts un refresco
	
	double valorRecibido = ve.vender(re, 10); // Ahora mismo yo espero que esto me devuelva -3
	
	if (valorRecibido != valorEsperado) {
	
		fail("Error en la prueba, deberia devolver -3");}
	}

	@Test
	public void testdeEJecuciondelaventa() {
		
		Refresco agua = new Refresco(50, 80, "Agua");
		VendingMachine Maquina = new VendingMachine(agua, 3000);
		
		//Le voy a comprara una botella de agua con 200 cents
		//Me tiene que devolver 120 cents
		
		double cambioEspero = 120;
		
		double cambioRecibido = Maquina.vender(agua, 200);
		
		System.out.println(cambioRecibido);
		
		if (cambioRecibido != cambioEspero){
			
			fail("Error en la prueba, algo no ha salido bien");}
		}
	}
	

