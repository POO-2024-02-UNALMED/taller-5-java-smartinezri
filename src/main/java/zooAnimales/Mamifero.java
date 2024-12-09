package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado = new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public void cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero.caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero.leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
	
	public void setListado(ArrayList<Mamifero> listado) {
        this.listado = listado;
    }
	
	public static ArrayList<Mamifero> getListado() {
        return listado;
    }
	
	public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
	
	public boolean isPelaje() {
        return pelaje;
    }
	
	public void setPatas(int patas) {
        this.patas = patas;
    }
	
	public int getPatas() {
        return patas;
    }
	
}
