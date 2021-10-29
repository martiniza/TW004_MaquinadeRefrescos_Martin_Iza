package com.maquinarefrescos;

public class Refresco {

	// Atributos
	public int unidadesStock;
	private double precio;
	private String estado;
	private String nombre;

	// Constructores
	public Refresco(int unidades, double precio, String nombre) {
		super();
		this.unidadesStock = unidades;
		this.precio = precio;
		this.nombre = nombre;
	}

	public int getUnidades() {
		return unidadesStock;
	}

	public double getPrecio() {
		return precio;
	}

	public String getEstado() {
		return estado;
	}

	public String getTipo() {
		return nombre;
	}

	public int Reload(int recarga) {
		if (recarga > 0) {
			unidadesStock += recarga;
		}
		return unidadesStock;
	}

	public int cambiounidad() {
		if (unidadesStock > 0) {
			--unidadesStock;

		} // Reduce en 1 la cantidad de refresco
		else {
			// Aquí tienes que dar un error}
		}
		return unidadesStock;
	}
	
	

	// Metodos

}
