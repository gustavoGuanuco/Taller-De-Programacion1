package ejercicio1;

public class Test {
	private static Grupo grupo1;

	public static void main(String[] args) {
		grupo1 = new Grupo("The best");
		grupo1.agregarIntegrante("Gustavo Guanuco");
		grupo1.agregarIntegrante("Miranda Leschinsky");
		grupo1.agregarIntegrante("Valentino Caceres");
		grupo1.agregarIntegrante("Mateo Bellomo");
		grupo1.agregarIntegrante("Yamileth Cabrera");
		grupo1.agregarIntegrante("Camila Szesko");
		grupo1.agregarIntegrante("Ramon Perez");	
		System.out.println(fueAgregado("Mariano Moreno" , grupo1));
		System.out.println(fueAgregado("Ramon Perez", grupo1));
		grupo1.mostrar();
		grupo1.removerIntegrante("Ramon Perez");
		grupo1.removerIntegrante("Ramon Perez");
		grupo1.mostrar();
		grupo1.vaciar();
		grupo1.mostrar();
	}

	private static String fueAgregado(String nombre, Grupo grupo) {
		return (grupo.buscarIntegrantePorNombre(nombre) != null)
				? "El integrante " + nombre + " fue agregado al grupo " + grupo.getNombre() + "\n"
				: nombre + " no fue agregado al grupo " + grupo.getNombre() + " con anterioridad \n";

	}

}
