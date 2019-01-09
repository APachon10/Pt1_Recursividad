package EjerciciosRecursividad;

import java.util.Scanner;

public class FormulaWallis {
	public static void main(String[] args) {
		FormulaWallis fw = new FormulaWallis();
		int numero  = leerInt();
		fw.calcularPiRecursivo(numero);
	}
	public int calcularPiRecursivo(int n ) {
		if(n ==0) {
			return 2;
		}
		return (2*n)/(2*n-1) * (2*n)/(2*n+1) *calcularPiRecursivo(n);
	}
	public static int leerInt() {
		Scanner scan = new Scanner(System.in);
		//Variable para controlar que salimos/entramos del bucle 
		boolean salir = false;
		int numero =0;
		//Pedimos el numero y Verificamos que el usuario meta un integer
		do {
			System.out.print("Introduce un Numero: ");
			if(scan.hasNextInt()) {
				numero=scan.nextInt();
				salir=true;
			}else {
				System.out.println("Error!");
				scan.next();
			}
		}while (!salir);
		//Cerranos el Scanner
		scan.close();
		//retornamos el numero
		return numero;
	}
}
