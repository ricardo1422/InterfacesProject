package org.generations.main;
import org.generations.classes.Cuadrado;
import org.generations.classes.Rectangulo;
import org.generations.classes.Rombo;
import org.generations.classes.Romboide;
import org.generations.classes.Trapecio;
import org.generations.classes.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo f1= new Triangulo("Berni", 20, 10, 15);
		Cuadrado f2= new Cuadrado("Cuadri", 10);
		Rectangulo f3= new Rectangulo("Recti", 5, 10);
		Rombo f4= new Rombo("Rombi", 8, 8, 16);
		Romboide f5 = new Romboide("Rombee", 10, 22);
		Trapecio f6= new Trapecio("Trapi", 7, 4, 8, 4, 5.8, 6.2, 5.5);
		
		
		imprimeFigura(f1);
		imprimeFigura(f2);
		imprimeFigura(f3);
		imprimeFigura(f4);
		imprimeFigura(f5);
		imprimeFigura(f6);

	}

	
	public static void imprimeFigura(FigurasGeometricas t) {
		System.out.println(t);
		System.out.println("+--------------------------------------------------------------+");
		System.out.println("El area de ["+t.getNombre()
				+ "] es: "+t.calculaArea());
		System.out.println("El perímetro de ["+t.getNombre()
		+ "] es: "+t.calculaPerimetro());
		System.out.println("+--------------------------------------------------------------+");
		
	}
}
