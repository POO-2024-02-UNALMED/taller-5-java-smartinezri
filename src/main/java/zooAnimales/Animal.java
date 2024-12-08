package zooAnimales;
import java.util.ArrayList;

public class Animal {

	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales += 1;
	}
	
	public void movimiento() {
		
	}
	
	public void totalPorTipo() {
		
	}
	
	public void toString() {
		
	}
	
}
