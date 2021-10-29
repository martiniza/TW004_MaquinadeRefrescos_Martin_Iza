package com.maquinarefrescos;

public class VendingMachine {

	// variables
	private Refresco refresco;
	double dineroIng;
	
	// Estado de la máquina

	private double cambios;

	// Informe de ventas
	private double dineroRecaudado;
	private int refrescosVendidos;

	// Constructores

	public VendingMachine(Refresco refresco, double cambiosIni) {
		super();
		this.dineroRecaudado = 0;
		this.refrescosVendidos = 0;
		this.refresco = refresco;
		this.cambios = cambiosIni;
	}
	
	Refresco agua = new Refresco(50, 80, "Agua");
	VendingMachine Maquina = new VendingMachine(agua, 3000);

	// Metodos

	public double vender(Refresco refresco, double dineroIng) {

		double cambioEsperado = dineroIng - refresco.getPrecio();

		if (refresco.getUnidades() <= 0) {
			return -1; 									//excepción sin Stock
		} else if (this.cambios < cambioEsperado) {
			return -2; 									//excepción sin cambios
		} else if (dineroIng <= refresco.getPrecio()) {
			return -3; 									//excepción dinero insuficiente
		} else {

			--refresco.unidadesStock;					// Cambios en el Stock

			cambios -= cambioEsperado;					// Cambio en los cambios

			++refrescosVendidos;						// Cambio en estado de maquina
			dineroRecaudado += refresco.getPrecio();

			return cambioEsperado;
		}
	}

	public String informeVentas() {
		return "La cantidad de refrescos vendida es" + refrescosVendidos +
				"; El dinero recaudado es "+ dineroRecaudado;
	}

	public String estadoMaquina(Refresco refresco) {
		return "La cantidad de refrescos restante es " + refresco.getUnidades() +
				"; La cantidad de cambio restante es " + cambios;
	}

	public Refresco getRefresco() {
		return refresco;
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
