package ejercicio3;

import java.util.Scanner;

public class Main {

	static int HORASTRABAJADAS;// Variable donde se almacena las horas trabajadas
	static int TARIFA;// Variable donde se almacena la tarifa por hora

	public static void main(String[] args) {

		Scanner scanHoras = new Scanner(System.in);
		Scanner scanTarifas = new Scanner(System.in);

		leerHorasTrabajadas(scanHoras);
		leerTarifa(scanTarifas);
		calcularSueldo();

		scanHoras.close();
		scanTarifas.close();

	}

	public static void leerHorasTrabajadas(Scanner scan)// Metodo para obtener las horas trabajadas por consola
	{

		System.out.println("Introduce las horas trabajadas");

		try {

			HORASTRABAJADAS = scan.nextInt();

		} 
		
		catch (Exception e) {

			System.out.printf("Valor incorrecto %n%n");
			Scanner scanAux = new Scanner(System.in);
			leerHorasTrabajadas(scanAux);

		}

	}

	public static void leerTarifa(Scanner scan)// Metodo para obtener el precio de cada hora
	{
		System.out.println("Introduce la tarifa");
		
		try {

			TARIFA = scan.nextInt();

		}

		catch (Exception e) {

			System.out.printf("Valor incorrecto %n%n");
			Scanner scanAux = new Scanner(System.in);
			leerTarifa(scanAux);
		}
	}

	public static void calcularSueldo()// Metodo para calcular sueldo
	{
		if (HORASTRABAJADAS > 40)// Si hay horas extra
		{
			int horasExtra = HORASTRABAJADAS - 40;
			float sueldoHorasExtra = horasExtra * (TARIFA * 1.5f);
			float sueldoNormal = 40.0f * TARIFA;

			float sueldoFinal = sueldoHorasExtra + sueldoNormal;

			System.out.println("EL SUELDO FINAL ES: " + sueldoFinal);
		}

		else if (HORASTRABAJADAS <= 40)// Si no hay horas extra
		{
			float sueldoFinal = HORASTRABAJADAS * TARIFA;
			System.out.println("EL SUELDO FINAL ES: " + sueldoFinal);
		}
	}

}
