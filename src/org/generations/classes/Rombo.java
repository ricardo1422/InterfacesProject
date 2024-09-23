package org.generations.classes;

import org.generations.main.FigurasGeometricas;

public class Rombo implements FigurasGeometricas{

	private String nombre;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	
	
	public Rombo(String nombre, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lados) {
		this.lado = lados;
	}
	
	
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	public double calculaArea() {
		return ((getDiagonalMayor()*getDiagonalMenor())/2);
	}
	
	public double calculaPerimetro() {
		return (4*getLado());
	}
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
	
	
	
	
}
