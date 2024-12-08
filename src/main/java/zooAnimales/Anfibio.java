package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{

	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, ind edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public void cantidadAnfibios() {
		
	}
	
	public void movimiento() {
		
	}
	
	public void crearRana() {
		
	}
	
	public void crearSalamandra() {
		
	}
	
}
