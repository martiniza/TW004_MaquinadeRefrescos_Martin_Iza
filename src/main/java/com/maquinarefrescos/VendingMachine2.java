package com.maquinarefrescos;

import com.maquinaexceptions.SinCambiosException;
import com.maquinaexceptions.SinStockException;

public class VendingMachine2 {

	// variables

	Refresco[] misrefrescos = {
			new Refresco(20,80,"Agua"),
			new Refresco(10,120,"Zumo"),
			new Refresco(10,120,"Cola")};
	double dineroIng;

	// Estado de la máquina

	private double cambios;

	// Informe de ventas
	private double dineroRecaudado;
	private int refrescosVendidos;

	// Constructores
	

	public VendingMachine2(Refresco[] refresco, double cambiosIni) {
		super();
		this.dineroRecaudado = 0;
		this.refrescosVendidos = 0;
		this.misrefrescos = refresco;
		this.cambios = cambiosIni;
	}

	// Metodos

	public double vender(int i, double dineroIng) throws SinStockException, SinCambiosException {

		double cambioEsperado = dineroIng - misrefrescos[i].getPrecio();
		double cambioNecesario = misrefrescos[i].getPrecio()- dineroIng;

		if (misrefrescos[i].getUnidades() <= 0) {
			throw new SinStockException("Error. No hay Stock disponible"); 
			// excepción sin Stock
		} 
		
		else if (this.cambios < cambioEsperado) {
			throw new SinCambiosException("Error. No hay cambios disponibles"); 
			// excepción sin cambios
		} 
		
		else if (dineroIng <= misrefrescos[i].getPrecio()) {
			throw new SinCambiosException("Error. Falta dinero", cambioNecesario); 
			// excepción dinero insuficiente
		} else {

			--misrefrescos[i].unidadesStock; // Cambios en el Stock

			cambios -= cambioEsperado;

			++refrescosVendidos; // Cambio en estado de maquina
			dineroRecaudado += misrefrescos[i].getPrecio();

			return cambioEsperado;
		}
	}

	public String informeVentas() {
		return "La cantidad de refrescos vendida es" + refrescosVendidos + "; El dinero recaudado es "
				+ dineroRecaudado;
	}

	public String estadoMaquina(Refresco refresco) {
		return "La cantidad de refrescos restante es " + refresco.getUnidades() + "; La cantidad de cambio restante es "
				+ cambios;
	}

	public Refresco getRefresco(int i) {
		return misrefrescos[i];
	}

	public double getDineroIng() {
		return dineroIng;
	}

	public double getDineroRecaudado() {
		return dineroRecaudado;
	}

	public int getRefrescosVendidos() {
		return refrescosVendidos;
	}

	public double getCambios() {
		return cambios;
	}

	// Aquí esta la ejecución del main class
	public static void main(String[] args) {

	}

}
