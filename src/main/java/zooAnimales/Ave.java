package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{

	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public int cantidadAves() {
		return listado.size();
	}
	
	@Override
    public String movimiento() {
        return "volar";
    }
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave.halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave.aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }
	
	public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
	
	public static ArrayList<Ave> getListado() {
        return listado;
    }
	
	public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
	
	public String getColorPlumas() {
        return colorPlumas;
    }
	
}
