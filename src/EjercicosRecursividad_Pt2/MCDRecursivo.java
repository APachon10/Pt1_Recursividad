package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class MCDRecursivo {
	public static void main(String[] args) {
		int num1=0,num2=0;
		
		System.out.println("Intro Numero ");
		num1 = leerValor();
		
			num2 = leerValor();
	}
	public static int leerValor() {
		//Clase Scanner para leer lo que ponemos en la consola
		Scanner scan = new Scanner(System.in);
		//Variable que vamos a retornar al metodo principal
		int numero =0;
		//Boolean para controlar cuando entra/sale del bucle
		boolean salir =false;

		//Bucle en el cual verificamos que el usuario ha metido un integer
		while(!salir) {
			//Saldremos del bucle cuando salir valga true
			//=============================================
			//Pedimos el Numero
			System.out.print("Introduce un Numero:");
			if(scan.hasNextInt()) {
				numero = scan.nextInt();
				salir=true;
			}else {
				System.out.println("Error!");
				//Limpiamos el Scanner
				scan.nextLine();
			}
			
		}
		//Devolvemos el Numero0
		return numero;

	}
}
