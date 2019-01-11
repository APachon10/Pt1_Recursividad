package BusquedaLinealRecursiva;

import java.util.Scanner;

public class CercaBinariaRecursiva {
	public static void main(String[] args)  {
		System.out.println("Que valor quieres buscar? ");
		int numero = leerValor();
		//		int vector[] = {10,20,30,40,50,60,70,80,90,100};
		int vector[] = {5};
		int lim_inferior=0;
		int lim_superior=vector.length-1;
		System.out.println("El valor "+ numero + " se encuentra en la posicion "+cercaBinariaRecursiva(vector,numero,lim_inferior,lim_superior)+ " del vector ");
	}
	public static int cercaBinariaRecursiva(int v[],int num,int lim_sup,int lim_inf) {
		int medio = 0;
		System.out.println();
		if(lim_sup<lim_sup ) {
			return -1;
		}
		medio = (lim_sup + lim_inf)/2;
		if (v[medio] == num) {
			return medio;
		}else if (num < v[medio]) {
			lim_sup = medio-1;		
		}else if(num > v[medio]){
			lim_inf = medio+1;
		}	
		return cercaBinariaRecursiva(v, num, lim_sup, lim_inf);
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
