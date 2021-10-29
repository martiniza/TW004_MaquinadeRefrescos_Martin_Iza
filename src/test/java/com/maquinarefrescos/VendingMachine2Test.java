package com.maquinarefrescos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VendingMachine2Test {

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
	public void test() {
		Refresco[] misrefrescos = {
				new Refresco(20,80,"Agua"),
				new Refresco(10,120,"Zumo"),
				new Refresco(10,120,"Cola")};
		
		VendingMachine2 ve2 = new VendingMachine2(misrefrescos, 3000);
		
		
		
		fail("Not yet implemented");
	}

}
