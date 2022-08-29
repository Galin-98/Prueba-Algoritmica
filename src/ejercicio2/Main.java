package ejercicio2;

import java.util.Random;

public class Main {

	static Persona PERSONAS[] = new Persona[50]; // Array donde se almacen las personas cargadas

	public static void main(String[] args) {

		leerPersonas();

	}

	public static void leerPersonas() {// Metodo para almacenar personas con edades y sexos aleatorios

		Random rnd = new Random();

		for (int i = 0; i < PERSONAS.length; i++) {

			int edad = rnd.nextInt(101);// Edad aleatoria desde 0 hasta 100 años
			String sexo = "";
			int sexoRnd = rnd.nextInt(2);// Numero aleatorio para elegir sexo, (si es 0 => hombre ; si es 1 => mujer)

			switch (sexoRnd) { // Asignacion de sexo segun el numero aleatorio almacenado en sexoRnd

			case 0:
				sexo = "hombre";
				break;

			case 1:
				sexo = "mujer";
				break;

			}

			PERSONAS[i] = new Persona(sexo, edad); // Se introduce dentro del array PERSONAS un nuevo objeto
													// del tipo Persona con la edad y sexo generados anteriormente

		}

		mostrarDatos();

	}

	public static void mostrarDatos()// Metodo para mostrar los datos
	{
		// Variables del tipo de personas
		int mayoresDe18 = 0;
		int menoresDe18 = 0;
		int hombresMayoresEdad = 0;
		int mujeresMenoresEdad = 0;
		int mujeres = 0;
		double personasMayoresPorcentaje = 0.0f;
		double mujeresPorcentaje = 0.0f;

		for (Persona persona : PERSONAS) {// Bucle para recorrer todas las personas dentro del array

			if (persona.edad >= 18) {
				mayoresDe18++;
			}

			else if (persona.edad < 18) {
				menoresDe18++;
			}

			if ((persona.edad > 18) && (persona.sexo.equals("hombre"))) {
				hombresMayoresEdad++;
			}

			if ((persona.edad < 18) && (persona.sexo.equals("mujer"))) {
				mujeresMenoresEdad++;
			}

			if (persona.sexo.equals("mujer")) {
				mujeres++;
			}

		}

		personasMayoresPorcentaje = ((double) mayoresDe18 / PERSONAS.length) * 100.0f;
		mujeresPorcentaje = ((double) mujeres / PERSONAS.length) * 100.0f;

		// Mostrar los datos
		System.out.println("Personas mayores de 18: " + mayoresDe18);
		System.out.println("Personas menores de 18: " + menoresDe18);
		System.out.println("Hombres mayores de 18: " + hombresMayoresEdad);
		System.out.println("Mujeres menores de 18: " + mujeresMenoresEdad);
		System.out.println("Porcentaje de personas mayores de edad: " + personasMayoresPorcentaje + "%");
		System.out.println("Porcentaje de mujeres: " + mujeresPorcentaje + "%");

	}

}
