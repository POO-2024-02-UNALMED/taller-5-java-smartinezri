package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{

	private static ArrayList<Ave> listado = new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public void cantidadAves() {
		
	}
	
	public void movimiento() {
		
	}
	
	public void crearHalcon() {
		
	}
	
	public void crearAguila() {
		
	}
	
}
