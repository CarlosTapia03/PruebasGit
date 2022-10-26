package PruebaGit;

public class Coche {

	private String nombre;
	private int puertas;

	public Coche(String nombre, int p) {
		super();
		this.nombre = nombre;
		puertas = p;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Coche [nombre=" + nombre + "puertas= " + puertas + "]";
	}
	
	
	
	
	
}
