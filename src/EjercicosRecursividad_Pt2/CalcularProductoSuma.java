package EjercicosRecursividad_Pt2;

import java.util.Arrays;
import java.util.Random;

public class CalcularProductoSuma {
	public static void main(String[] args) {

		CalcularProductoSuma c = new CalcularProductoSuma();

		int x[] = new int [10];
		c.rellenarVector(x);
		c.mostrarVector(x);
		
		System.out.println("==============");
		int pos= x.length;
		
		System.out.println("El Resultado és: " + c.calcularProductoRecursivo(x,pos-1));
	}
	public int calcularProductoRecursivo(int [] num, int posicion ){
		if (posicion==0) {
			return 0;
		}
		if (num[posicion]%2==0) {
			System.out.println("multiplo de 2:" + num[posicion]);
			return num[posicion]+calcularProductoRecursivo(num, posicion-1);
		}else if(num[posicion]%3==0) {
			System.out.println("multiplo de 3:" + num[posicion]);
			return num[posicion]+calcularProductoRecursivo(num, posicion-1);
		}else if(num[posicion]%3!= 0 && num[posicion]%2!=0 ) {
			System.out.println("no soy multiplo de nadie:" + num[posicion]);
			calcularProductoRecursivo(num, posicion-1);
			return num[posicion];
		}
		return num[posicion];
	}
	public  int [] rellenarVector(int[] num) {
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		return num;
	}
	public  void mostrarVector(int[] num) {
		System.out.println("Vector Aleatorio: " + Arrays.toString(num));
	}
}
