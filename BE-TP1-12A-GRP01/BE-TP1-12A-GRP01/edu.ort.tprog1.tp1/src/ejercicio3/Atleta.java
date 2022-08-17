package ejercicio3;

public class Atleta {
	private String nombre;
	private double tiempo;

	public Atleta(String nombre, double tiempo) {
		setNombre(nombre);
		setTiempo(tiempo);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public double getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [nombre:  " + nombre + ", tiempo: " + tiempo + " segundos]";
	}
}
