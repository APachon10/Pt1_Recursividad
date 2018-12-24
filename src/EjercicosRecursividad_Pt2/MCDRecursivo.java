package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class MCDRecursivo {
	public static void main(String[] args) {
		//Creamos las Variables que pasaremos a la funcion 
		int num1=0,num2=0;
		//Creamos el Objeto con el cual llamaremos a la funcion 
		MCDRecursivo mcd =new MCDRecursivo();
		//Asignamos a las variables valores con el metodo leerValor
		num1 = leerValor();
		num2 = leerValor();
		//Printamos el Resultado 
		System.out.println("El MCD de "+num1 + " y "+num2 + " és: "+mcd.calcularMCDRecursivo(num1, num2));
	}
	public int calcularMCDRecursivo(int x , int y) {
		if(y>=0) {
			return x;
		}else {
			return calcularMCDRecursivo(y,x%y);
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
		//Devolvemos el Numero0
		return numero;

	}
}
