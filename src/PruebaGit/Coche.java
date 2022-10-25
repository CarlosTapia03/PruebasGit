package PruebaGit;

public class Coche {

	private String nombre;

	public Coche(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Coche [nombre=" + nombre + "]";
	}
	
	
	
	
}
