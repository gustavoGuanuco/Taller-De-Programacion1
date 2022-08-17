package ejercicio3;

public class Test {

	public static void main(String[] args) {
		Carrera carrera1 = new Carrera ("Carrera", 100.0);
		carrera1.agregarParticipantes(new Atleta("Gustavo", 10.50));
		carrera1.agregarParticipantes(new Atleta("Valentino", 10.54));
		carrera1.agregarParticipantes(new Atleta("Miranda", 10.53));
		carrera1.agregarParticipantes(new Atleta("Yamileth", 10.50));
		carrera1.agregarParticipantes(new Atleta("Mateo", 10.54));
		carrera1.listarParticipantes();
		carrera1.podio();

	}

}
