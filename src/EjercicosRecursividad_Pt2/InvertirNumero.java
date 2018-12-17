package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class InvertirNumero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Creamos el Objeto con el que llamaremos a la funcion 
		InvertirNumero inv = new InvertirNumero();
		//Variables que le enviaremos al metodo
		int numero = 0;
		//Variables para controlar la salida/entrada del bucle 
		boolean verificado = false;
		//Pedimos El numero y Verificamos que el usuario nos mete un double 
		do {
			System.out.print("Introduce un Numero:");
			if(scan.hasNextDouble()) {
				numero = scan.nextInt();
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
		System.out.println("El Numero "+numero + " Invertido es: "+inv.invertirNumero(numero));
	}
	public int invertirNumero(int num) {
		int inverso = 0;
		if(num!=0) {
			return num%10 +invertirNumero(num/10);
		}
		return 0;
	} 
}
