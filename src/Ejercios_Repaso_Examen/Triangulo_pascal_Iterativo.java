package Ejercios_Repaso_Examen;

public class Triangulo_pascal_Iterativo {

	public static void main(String[] args) {
		//		int x[][] = new int [1][0];
		//		int i=0;
		//		int j=0;
		//
		//		//Llamamos a la funcion
		//		TrianguloPascalRec(x,i,j);
		int nfilas = 10;
		int[] a = new int[1];
		for (int i = 1; i <= nfilas; i++) {
			int[] x = new int[i];
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == (i - 1)) {
					x[j] = 1;
				} else {
					x[j] = a[j] + a[j - 1];
				}
				System.out.print(x[j] + " ");
			}
			a = x;
			System.out.println();
		}
	}

	//	public static void TrianguloPascalRec(int[][] array,int fila,int columna) {
	//		if (fila  == array.length+1 && columna == array.length+1) {
	//			array[fila][columna] = 1;
	//			return;
	//		}
	//		if (columna == 0) {
	//			array[fila][columna]= 1;
	//			TrianguloPascalRec(array,fila,columna+1);
	//			return;
	//		}
	//		if (columna == fila) {
	//			array[fila][columna]=1;
	//			TrianguloPascalRec(array,fila+1,0);
	//			return;
	//		}
	//		array[fila][columna] = array[fila-1][columna-1]+array[fila-1][columna];
	//		TrianguloPascalRec(array, fila, columna+1);
	//	}
}	