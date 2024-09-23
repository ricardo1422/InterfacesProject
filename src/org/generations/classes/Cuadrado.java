package org.generations.classes;

import org.generations.main.FigurasGeometricas;

public class Cuadrado implements FigurasGeometricas{

	private String nombre;
	private double lados;
	public Cuadrado(String nombre, double lados) {
		super();
		this.nombre = nombre;
		this.lados = lados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLados() {
		return lados;
	}
	public void setLados(double lados) {
		this.lados = lados;
	}
	
	public double calculaArea() {
		return (getLados()*getLados());
	}
	
	public double calculaPerimetro() {
		return(getLados()*4);
	}
	
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lados=" + lados + "]";
	}
	
	
}
