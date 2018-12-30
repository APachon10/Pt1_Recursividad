package EjercicosRecursividad_Pt2;

import java.util.Arrays;

public class CalcularProductoSuma {
	public static void main(String[] args) {
		
		CalcularProductoSuma c = new CalcularProductoSuma();

		int x[] = {1,2,3,4,5,6,7,8,9,10};
		int pos = x.length;
		System.out.println("El Resultado és: " + c.calcularProductoRecursivo(x,pos-1));
	}
	public int calcularProductoRecursivo(int [] num, int posicion ){
		int suma_Pares =0,suma_Impares=0;
		if(posicion!=0) {
			if(num[posicion]%2==0) {
				System.out.println("Suma al entrar en el if  : " +suma_Pares);
				suma_Pares = num[posicion] +calcularProductoRecursivo(num, posicion-1);
				System.out.println("Suma despues de hacer la operacion   : " +suma_Pares);
			}else {
				suma_Impares = num[posicion] + calcularProductoRecursivo(num, posicion-1);  
			}
			return suma_Pares * suma_Impares;
		}else {
			return 0;
		}
		
	}
	
}
