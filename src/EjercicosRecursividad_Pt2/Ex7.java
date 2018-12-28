package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		//Objeto con el cual llamaremos  a la funcion
		Ex7 e7  = new Ex7();
		//Variable que le vamos a pasar al objeto
		int x =0;
		//Le asignamos un valor con el metodo LeerValor
		x = leerValor();
		//Llamamos al metodo Recursivo y printamos el resultado de la expresion 
		System.out.println("El resultado és: "+ e7.calcularResultadoRecursivo(x));
	}
	public int calcularResultadoRecursivo(int num) {
		if(num!=0){
			return num*2 +calcularResultadoRecursivo((num-1))*2;
		}
		return num;
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
