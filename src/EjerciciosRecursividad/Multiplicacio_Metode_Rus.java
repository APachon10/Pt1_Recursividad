package EjerciciosRecursividad;

import java.util.Scanner;

public class Multiplicacio_Metode_Rus {
	public static void main(String[] args) {
		//Scanner para lerr la consola y lo que pongamos en ella
		Scanner scan = new Scanner(System.in);
		//Objeto con el cual iniciamos el metodo o funcion 
		Multiplicacio_Metode_Rus mr = new Multiplicacio_Metode_Rus();
		//Variables que le pasaremos al metodo 
		int num1 = 0,num2=0;
		boolean verificado  =false;

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
		//Llamamos al metodo/funcion y printamos el resultado 
		System.out.println("=====================");
		System.out.println("El producto de los Numeros " +num1 + " y "+ num2 + " és:"+mr.calcularProducto(num1,num2));
	}
	public int calcularProducto(int a, int b) {
		//Creamos la variable que devolveremos al metodo Main 
		int res =1;
		
		/*System.out.println("===================================");
		System.out.println("Estamos dentro del Metodo calcular Producto ");
		System.out.print("Primer Numero: " +a +"\n============"+"\nSegundo Numero: "+b);*/
		
		if(a==1){
			return b;
		}else if(a%2!=0){
			return(b+calcularProducto(a/2 , b*2));
		}else{
			return(calcularProducto(a/2 , b*2));
		}          

	}
}
