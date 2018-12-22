package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class ImprimirValores_Ex6 {
	public static void main(String[] args) {
		//Creamos la Variable que le vamos a pasar a la funcion
		int num=0;
		//Asignamos un valor a la variable con el metodo LeerValor()
		num=leerValor();
		//Creamos el OBjeto para Llamar a la funcion
		ImprimirValores_Ex6 ex6 = new ImprimirValores_Ex6();
		//Llamamos a la funcion 
		ex6.imprimirValores(num);
		
	}
	public int  imprimirValores(int n) {
		if(n >= 1 ) {
			System.out.println("Valor: "+ n);
			return 1+imprimirValores(n-1);
		}
		return 1;  
	}
	/*
	 * Funcion Para leer un Valor */
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
