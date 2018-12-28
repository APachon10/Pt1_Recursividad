package EjercicosRecursividad_Pt2;

import java.util.Arrays;

public class CalcularProductoSuma {
	public static void main(String[] args) {
		
		CalcularProductoSuma c = new CalcularProductoSuma();

		int x[] = {1,2,3,4,5,6,7,8,9,10};
		int pos = x.length;
		System.out.println("El Resultado és: " + c.calcularProductoRecursivo(x,pos));
	}
	public int calcularProductoRecursivo(int [] num, int posicion ){
		if(num.length<=10 || num[posicion]%2==0) {
			return num[posicion] + calcularProductoRecursivo(num, posicion-1);
		}
		return 0;
	}
	
}
