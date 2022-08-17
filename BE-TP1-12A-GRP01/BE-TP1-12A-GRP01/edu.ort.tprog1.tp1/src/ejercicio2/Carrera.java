package ejercicio2;

import java.util.ArrayList;

public class Carrera {
	private String especialidad;
	private double metros;
	private ArrayList<Atleta> participantes;

	public Carrera(String especialidad, double metros) {
		setEspecialidad(especialidad);
		setMetros(metros);
		participantes = new ArrayList<Atleta>();
	}
	
	private void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	private void setMetros(double metros) {
		this.metros = metros;
	}

	private double mejorTiempo() {
		double mejorTiempo = Double.MAX_VALUE;
		for (Atleta atleta : participantes) {
			if (atleta.getTiempo() < mejorTiempo) {
				mejorTiempo = atleta.getTiempo();
			}
		}
		return mejorTiempo;
	}

	private ArrayList<Atleta> calcularGanadores() {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>();
		double mejorTiempo = mejorTiempo();
		for (Atleta atleta : participantes) {
			if (atleta.getTiempo() == mejorTiempo) {
				ganadores.add(atleta);
			}
		}
		return ganadores;
	}
	
	public void agregarParticipantes (Atleta atleta) {
		if (atleta != null) {
			participantes.add(atleta);
		} else {
			System.out.println("Ingreso no valido");
		}
	}
	
	public void listarGanadores () {
		ArrayList<Atleta> ganadores = new ArrayList<Atleta>(calcularGanadores());
		if (ganadores.size() == 1) {
			System.out.println("*** Ganador " + "de " + especialidad + " en " + metros + " metros" + " con " + mejorTiempo() + " segundos***");
		} else {
			System.out.println("*** Ganadores " + "de " + especialidad + " en " + metros + " metros" + " con " + mejorTiempo() + " segundos***");
		}
		for (Atleta atleta : ganadores) {
			System.out.println(atleta);
		}
	}
	
	public void listarParticipantes() {
		System.out.println("***Participantes de " + especialidad + " en " + metros + " metros ***");
		for (Atleta atleta : participantes) {
			System.out.println(atleta);
		}
		System.out.println("");
	}

}
