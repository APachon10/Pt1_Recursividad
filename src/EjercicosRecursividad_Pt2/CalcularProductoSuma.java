package EjercicosRecursividad_Pt2;

import java.util.Arrays;
import java.util.Random;

public class CalcularProductoSuma {
	public static void main(String[] args) {

		CalcularProductoSuma c = new CalcularProductoSuma();

		int x[] = {1,2,3,4,5,6,7,8,9,10};
//		int x[] = new int [10];
//		c.rellenarVector(x);
//		c.mostrarVector(x);
		
		System.out.println("==============");
		int pos= 0;
		int contador1 = 0;
		int contador2 = 0;
		System.out.println("El Resultado �s: " + calcularProductoRecursivo(x,pos,contador1,contador2));
	}
	public static int calcularProductoRecursivo(int [] num, int posicion,int con_m2,int cont_m3 ){
		if (posicion>=num.length) {
			return con_m2*cont_m3;
		}
		if (num[posicion]%2==0) {
			con_m2 = con_m2 + num[posicion];
		}
		if(num[posicion]%3==0) {
			cont_m3 = cont_m3 + num[posicion];
		}
		return calcularProductoRecursivo(num, posicion+1, con_m2, cont_m3);
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
