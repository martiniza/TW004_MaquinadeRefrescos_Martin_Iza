package com.maquinarefrescos;

public class VendingMachine2 {

	//variables
	/**
	 *  Hay que sustituir refresco por un array de refrescos
	 *  solo va a tener 3 refrescos: agua, zumo, cola
	 */
		// Estado de la máquina
	
	private double cambios;
	Refresco mirefresco;
	
		// Informe de ventas
	private double dineroRecaudado;
	private int refrescosVendidos;
	
	//Constructores
	
//	Refresco[] misrefrescos = {
//			new Refresco(20,80,"Agua"),
//			new Refresco(10,120,"Zumo"),
//			new Refresco(10,120,"Cola")};
//	
	//Metodos
	
	public boolean expenderRefresco(float dinero){
		Refresco agua = new Refresco(50,0.8f, "Agua" );
		++refrescosVendidos;
		return true;
		
	}
	
	//Aquí esta la ejecución del main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
		
	
		
	}

}
