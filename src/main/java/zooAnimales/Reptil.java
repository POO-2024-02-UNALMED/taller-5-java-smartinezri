package zooAnimales;
import java.util.ArrayList;

public class Reptil {

	private static ArrayList<Reptil> listado = new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public void cantidadReptiles() {
		return listado.size();
	}
	
	@Override
    public String movimiento() {
        return "reptar";
    }
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
	
	public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }
	
	public static ArrayList<Reptil> getListado() {
        return listado;
    }
	
	public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
	
	public String getColorEscamas() {
        return colorEscamas;
    }
	
	public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
	
	public int getLargoCola() {
        return largoCola;
    }
	
}