package BusquedaLinealRecursiva;

import java.util.Scanner;

public class BusquedaLinealRecursiva_Array {
	public static void main(String[] args) {
		BusquedaLinealRecursiva_Array busqueda = new BusquedaLinealRecursiva_Array();
		int numeros [] = {1,5,3,10,2,6,7,8,9,4};
		int numero = leerValor();
		int longitud = numeros.length;
		
		System.out.println("Posicion del Array: " + busqueda.busquedaLinealRecursiva(numero,numeros,longitud-1));
	}
	public int busquedaLinealRecursiva(int n, int []  nums,int lg) {
		if(nums[lg] <0){
			return -1;
		}else if(nums[lg] == n) {
			return nums[lg];
		}
		return busquedaLinealRecursiva(n, nums, lg-1);
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
			if(scan.hasNextInt()) {
				numero = scan.nextInt();
				salir=true;
			}else {
				System.out.println("Error!");
				//Limpiamos el Scanner
				scan.nextLine();
			}
		}
		//Devolvemos el valor
		return numero;
	}
}
