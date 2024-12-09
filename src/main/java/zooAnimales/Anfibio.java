package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{

	private static ArrayList<Anfibio> listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
    public String movimiento() {
        return "saltar";
    }
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio.ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio.salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
	
	public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }
	
	public static ArrayList<Anfibio> getListado() {
        return listado;
    }
	
	public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
	
	public String getColorPiel() {
        return colorPiel;
    }
	
	public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
	
	public boolean isVenenoso() {
        return venenoso;
    }
	
}
