package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class SumaParells {
	public static void main(String[] args) {
		int numero = leerValor();
		SumaParells sp = new SumaParells();
		System.out.println("Resultado: "+ sp.sumarParesRecursivo(numero));
	}
	public int sumarParesRecursivo(int n) {
		if(n==2) {
			return 2;
		}else {
			return n+sumarParesRecursivo(n-2);
		}
		
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
		//Cerramos el Scanner
		scan.close();
		//Devolvemos el Numero0
		return numero;

	}
}
