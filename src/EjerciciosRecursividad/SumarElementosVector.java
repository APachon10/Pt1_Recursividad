package EjerciciosRecursividad;

import java.util.Scanner;

public class SumarElementosVector {
	final static int long_vector = 5;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valores [] = new int [long_vector];
		System.out.println("Introduce "+long_vector+" valores");

		for (int i = 0; i < valores.length; i++) {
			valores[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("=======================");
		System.out.println("Valores introducidos ");
		SumarElementosVector vl = new SumarElementosVector();
		int pos = valores.length ;
		System.out.println("=======================");
		System.out.println("La suma de los numeros del vector és:"+vl.sumarElementos(valores,pos-1));
	}
	public int sumarElementos(int numeros[],int posicion) {
		if (posicion!= 0) {
			return numeros[posicion] + sumarElementos(numeros, posicion-1);
		} else {
			return numeros[posicion];		
		}

	}
}
