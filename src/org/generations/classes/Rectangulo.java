package org.generations.classes;
import org.generations.main.FigurasGeometricas;

public class  Rectangulo implements FigurasGeometricas{

	private String nombre;
	private double base;
	private double altura;
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double calculaArea() {
		return (getBase()*getAltura());
	}
	
	public double calculaPerimetro() {
		return((getBase()*2)+(getAltura()*2));
	}
	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura +  "]";
	}
	
	
}
