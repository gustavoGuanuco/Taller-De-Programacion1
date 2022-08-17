package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		integrantes = new ArrayList<String>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadIntegrantes() {
		return integrantes.size();
	}

	public void agregarIntegrante(String nombre) {
		String aux = buscarIntegrantePorNombre(nombre);
		if (aux == null) {
			integrantes.add(nombre);
			System.out.println("[" + nombre + "] " + "fue asignado al grupo " + "[" + this.nombre + "]");
		} else {
			System.out.println("Este integrante ya fue cargado en el listdo con anterioridad");
		}
	}

	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		return integrantes.indexOf(nombreIntegrante);
	}
	
	public String buscarIntegrantePorNombre(String nombre) {
		int indice = 0;
		String integranteBuscado = null;
		while (indice < integrantes.size() && integranteBuscado == null) {
			if (integrantes.get(indice).equalsIgnoreCase(nombre)) {
				integranteBuscado = nombre;
			} else {
				indice++;
			}
		}
		return integranteBuscado;
	}

	public void removerIntegrante(String nombre) {
		String integranteARemover = buscarIntegrantePorNombre(nombre);
		if (integranteARemover != null) {
			integrantes.remove(integranteARemover);
			System.out.println("Se removio al integrante " + integranteARemover + "\n");
		} else {
			System.out.println("Integrante " + nombre + " a remover no existe \n");
		}
	}

	private void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes es: " + getCantidadIntegrantes());
		for (String nombre : integrantes) {
			System.out.println(nombre);
		}
		System.out.println(""); //Orden visual
	}

	public void mostrar() {
		System.out.println("El nombre del grupo es: " + this.nombre);
		mostrarIntegrantes();
	}

	public void vaciar() {
		integrantes.clear();
		System.out.println("Se vacio la lista de participantes\n ");
	}

	public int obtenerPosicionInt(String nombre) {
		return obtenerPosicionIntegrante(nombre);
	}
	
	public String obtenerIntegrante(int posicion) {
		String integranteBuscado = null;
		
		if (posicion >= 1 && posicion <= integrantes.size()) {
			integranteBuscado = integrantes.get(posicion - 1);
		} else {
			System.out.println("Error en posicion pedida");
		}
		return integranteBuscado;
	}

}
