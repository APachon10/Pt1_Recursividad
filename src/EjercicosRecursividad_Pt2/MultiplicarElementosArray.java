package EjercicosRecursividad_Pt2;

import java.util.Arrays;
import java.util.Scanner;

import EjerciciosRecursividad.calcularPotencia;

public class MultiplicarElementosArray {
	public static final int medida = 2;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Creamos el Objeto con el que llamaremos a la funcion 
		calcularPotencia cp = new calcularPotencia();
		//Variables que le enviaremos al metodo
		int numeros[] = new int[medida];
		boolean verificado = false;
		//Pedimos los 2 numeros para hacer la formula 
		System.out.println("Introduce 2 Numeros");
		System.out.println("====================");
		//Verificamos que el usuario nos mete un double 
		do {
			
			if(scan.hasNextDouble()) {
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = scan.nextInt();
				}
				verificado=true;
			}else {
				System.out.println("Error!!");
				scan.next();
			}
		}while(!verificado);
		System.out.println("============");
		//Cerramos el Scanner
		scan.close();
		//Printamos el Resultado del metodo Recursivo 
		System.out.println("El resultado és: ");
	}
	public int calcularProductoArray(int valores []) {
		System.out.println("Vector: "+Arrays.toString(valores));
		return 0;
	}
}
