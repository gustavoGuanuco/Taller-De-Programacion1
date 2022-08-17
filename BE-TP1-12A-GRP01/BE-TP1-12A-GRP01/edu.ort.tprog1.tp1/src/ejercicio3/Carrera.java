package ejercicio3;

import java.util.ArrayList;

public class Carrera {
	private String especialidad;
	private double metros;
	private ArrayList<Atleta> participantes;
	private ArrayList<Atleta> primerPuesto;
	private ArrayList<Atleta> segundoPuesto;
	private ArrayList<Atleta> tercerPuesto;
	private double t1 = Double.MAX_VALUE;
	private double t2 = Double.MAX_VALUE;
	private double t3 = Double.MAX_VALUE;

	public Carrera(String especialidad, double metros) {
		setEspecialidad(especialidad);
		setMetros(metros);
		participantes = new ArrayList<Atleta>();
		primerPuesto = new ArrayList<Atleta>();
		segundoPuesto = new ArrayList<Atleta>();
		tercerPuesto = new ArrayList<Atleta>();
	}
	
	private void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	private void setMetros(double metros) {
		this.metros = metros;
	}
	
	private void calcularPodio() {
		for (Atleta atleta : participantes) { //Calculo primer puesto
			if (atleta.getTiempo() < t1) {
				t1 = atleta.getTiempo();
			}
		}
		for (Atleta atleta : participantes) { //Calculo segundo puesto
			if (atleta.getTiempo() < t2 && atleta.getTiempo() != t1) {
				t2 = atleta.getTiempo();
			}
		}
		for (Atleta atleta : participantes) { //Calculo tercer puesto
			if (atleta.getTiempo() < t3 && atleta.getTiempo() != t1 && atleta.getTiempo() != t2) {
				t3 = atleta.getTiempo();
			}
		}
	}

	private void almacenarPodio() {
		for (Atleta atleta : participantes) {
			if (atleta.getTiempo() == t1) {
				primerPuesto.add(atleta);
			} else {
				if (atleta.getTiempo() == t2) {
					segundoPuesto.add(atleta);
				} else {
					if (atleta.getTiempo() == t3) {
						tercerPuesto.add(atleta);
					}
				}
			}
		}
	}

	public void podio() {
		calcularPodio();
		almacenarPodio();

		System.out.println("*** Resultado de " + especialidad + " de " + metros + " metros ***");

		System.out.println("*** Primer puesto en el podio con " + t1 + " segundos ***");
		for (Atleta atleta : primerPuesto) {
			System.out.println(atleta);

		}
		System.out.println("");

		System.out.println("*** Segundo puesto en el podio con " + t2 + " segundos ***");
		for (Atleta atleta : segundoPuesto) {
			System.out.println(atleta);
		}
		System.out.println("");

		System.out.println("*** Tercer puesto en el podio con " + t3 + " segundos ***");
		for (Atleta atleta : tercerPuesto) {
			System.out.println(atleta);

		}
		System.out.println("");
	}

	public void agregarParticipantes(Atleta atleta) {
		if (atleta != null) {
			participantes.add(atleta);
		} else {
			System.out.println("Ingreso no valido");
		}
	}

	public void listarParticipantes() {
		System.out.println("*** Participantes de " + especialidad + " en " + metros + " metros***");
		for (Atleta atleta : participantes) {
			System.out.println(atleta);
		}
		System.out.println("\n");
	}
}
