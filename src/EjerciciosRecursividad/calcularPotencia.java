package EjerciciosRecursividad;

import java.util.Scanner;

public class calcularPotencia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Creamos el Objeto con el que llamaremos a la funcion 
		calcularPotencia cp = new calcularPotencia();
		//Variables que le enviaremos al metodo
		double numero1 = 0;
		double numero2 = 0;
		boolean verificado = false;
		//Pedimos los 2 numeros para hacer la formula 
		System.out.println("Introduce 2 Numeros");
		System.out.println("====================");
		//Verificamos que el usuario nos mete un double 
		do {
			System.out.print("Primer Numero:");
			if(scan.hasNextDouble()) {
				numero1 = scan.nextDouble();
				verificado=true;
			}else {
				System.out.println("Error!!");
				scan.next();
			}
		}while(!verificado);
		System.out.println("============");
		do {
			System.out.print("Segundo Numero:");
			if(scan.hasNextDouble()) {
				numero2 = scan.nextDouble();
				verificado=true;
			}else {
				System.out.println("Error!!");
				scan.next();
			}
		}while(!verificado);
		System.out.println("========================");
		//Cerramos el Scanner
		scan.close();
		//Printamos el Resultado del metodo Recursivo 
		System.out.println("El resultado és: "+cp.calcularPotenciaRecursiva(numero1,numero2));
		
	}
	public double calcularPotenciaRecursiva(double a,double b) {
		if(b!=0) {
			return a*calcularPotenciaRecursiva(a, b-1);
		}
		return 1;
	}
}
