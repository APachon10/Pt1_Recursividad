package EjerciciosRecursividad;

import java.util.Scanner;

public class PotenciaNumero {
	public static void main(String[] args) {
		//Creamos el Scanner 
		Scanner scan = new Scanner(System.in);
		//Creamos el Objeto con el que llamaremos a la variable
		PotenciaNumero pv = new PotenciaNumero();
		//Variables
		int num1=0;
		int num2=0;
		boolean verificado = false;
		//Pedimos los 2 numeros 
		System.out.println("Introduce 2 numeros:");
		System.out.println("======================");
		//Verificamos que el usuario nos meta un integer , si no mete un entero no sale del bucle
		do {
			System.out.print("Primer Numero ");
			if(scan.hasNextInt()) {
				num1 = scan.nextInt();
				verificado = true;
			}else {
				System.out.println("No has introducido un Entero, vuelve a introducir el dato ");
				scan.next();
			}
		}while(!verificado);
		System.out.println("=========================");
		do {
			System.out.print("Segundo Numero ");
			if(scan.hasNextInt()) {
				num2 = scan.nextInt();
				verificado = true;
			}else {
				System.out.println("No has introducido un Entero, vuelve a introducir el dato ");
				scan.next();
			}
		}while(!verificado);
		//Cerramos el Scanner
		scan.close();
		//Printamos el Resultado 
		System.out.println("=============================");
		System.out.println("El resultado és: "+pv.calcularProducto(num1, num2));
		
	}
	public int calcularProducto(int a,int b) {
		if(b!=0) {
			return a*calcularProducto(a, b-1);
		}
		return 1;
	}
}
