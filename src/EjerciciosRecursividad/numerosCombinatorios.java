package EjerciciosRecursividad;

import java.util.Scanner;

public class numerosCombinatorios {
	public static void main(String[] args) {
		//Creamos el Scanner 
				Scanner scan = new Scanner(System.in);
				//Creamos el Objeto con el que llamaremos a la variable
				numerosCombinatorios ncb = new numerosCombinatorios();
				//Variables
				int num1=0;
				int num2=0;
				boolean verificado = false;
				//Pedimos el numero y Verificamos que el usuario nos meta un integer , si no mete un entero no sale del bucle
				System.out.println("Introduce 2 Numeros"+"\n===============");
				do {
					System.out.print("Introduce un Numero: ");
					if(scan.hasNextInt()) {
						num1 = scan.nextInt();
						verificado = true;
					}else {
						System.out.println("No has introducido un Entero, vuelve a introducir el dato ");
						scan.next();
					}
				}while(!verificado);
				System.out.println("=============================");
				do {
					System.out.print("Segundo Numero: ");
					if(scan.hasNextInt()) {
						num2 = scan.nextInt();
						verificado = true;
					}else {
						System.out.println("No has introducido un Entero, vuelve a introducir el dato ");
						scan.next();
					}
				}while(!verificado);
				System.out.println("===============================");
				//Cerramos el Scanner
				scan.close();
				//Printamos el Resultado 
				System.out.println("El resultado és: "+ncb.calcularNumerosCombinatorios(num1,num2));
	}
	public int calcularNumerosCombinatorios(int a,int b) {
		//!!Caso Basico -->  n/0 = 1 , n lo substitumos por cualquier Numero y siempre sera 1 
		if(a>b) {
			return a+calcularNumerosCombinatorios(a-1, b-1);
		}else {
			return calcularNumerosCombinatorios(a- 1 , b);
		}
	}
}
