package gestion;
import java.util.ArrayList;

public class Zoologico {

	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		this.zonas = new ArrayList<>();
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = new ArrayList<>();
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAnimales = 0;
		for (Zona zona : zonas) {
			totalAnimales += zona.cantidadAnimales();
		}
		return totalAnimales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public ArrayList<Zona> getZona(){
		return zonas;
	}
	
}
