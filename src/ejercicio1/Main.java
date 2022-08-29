package ejercicio1;

import java.util.Scanner;

public class Main {

	static Long NUMERO; // Variable donde se almacena el numero cargado

	public static void main(String[] args) {

		leerNumero();

	}

	public static void leerNumero() // Metodo para cargar el numero a traves de la consola
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero:");

		try {

			NUMERO = scan.nextLong();
			scan.close();
			comprobarNumero();

		}

		catch (Exception e) {

			System.out.printf("El valor introducido es incorrecto %n%n");
			leerNumero();

		}

	}

	public static void comprobarNumero()// Metodo para comprobar si el numero es par o impar e imprimir sus
										// descendientes
	{

		if ((NUMERO % 2) == 0)// Numero par
		{
			Long numeroAux = NUMERO;

			while (numeroAux > 0) {
				numeroAux -= 2;
				System.out.println(numeroAux);
			}

		}

		else if ((NUMERO % 2) != 0)// Numero impar
		{
			Long numeroAux = NUMERO;

			while (numeroAux > 1) {
				numeroAux -= 2;
				System.out.println(numeroAux);
			}

		}

	}

}
