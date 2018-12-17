package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class MultiplicarElementosArray {
	public static final int medida = 2;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Creamos el Objeto con el que llamaremos a la funcion 
		MultiplicarElementosArray mp3 = new MultiplicarElementosArray();
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
		int pos = numeros.length;
		//Printamos el Resultado del metodo Recursivo 
		System.out.println("El resultado és: "+mp3.calcularProductoArray(numeros,pos-1));
	}
	public int calcularProductoArray(int valores [],int posicion) {
		if(posicion!=0) {
			return valores[posicion]*calcularProductoArray(valores, posicion-1);
		}else {
			return valores[posicion];
		}
	}
}
