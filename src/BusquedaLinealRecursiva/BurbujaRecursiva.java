package BusquedaLinealRecursiva;

import java.util.Arrays;

public class BurbujaRecursiva {
	public static void main(String[] args) {
		int vector [] = {2,1,9,8,20,100,1500,1000,10000,2500};
		int posicion =0;
		ordenacionBurbuja(vector, posicion);
		System.out.println("Vector : "+Arrays.toString(vector));
	}
	public static int [] ordenacionBurbuja(int [] v,int pos ) {
		int valor_aux =0;
		System.out.println("Valor Array : " + v[pos]);
		System.out.println("====================");
		System.out.println("Valor aux: "+valor_aux);
		System.out.println("====================");
		if(pos == v.length-1) {
			return v; 
		}else {
			for (int j = 0; j < v.length-1; j++) {
				if(v[j] > v[j+1]) {
					 valor_aux = v[j+1];
					 v[j+1] = v[j];
					 v[j] = valor_aux;
				}
			}
			ordenacionBurbuja(v, pos+1);
		}
		

		return v;

		//		if(posicion!=0) {
		//			return valores[posicion]*calcularProductoArray(valores, posicion-1);
		//		}else {
		//			return valores[posicion];
		//		}

		//		 for(int i = 0; i < arreglo.length - 1; i++){
		//            for(int j = 0; j < arreglo.length - 1; j++){
		//                if (arreglo[j] < arreglo[j + 1]){
		//                    int tmp = arreglo[j+1];
		//                    arreglo[j+1] = arreglo[j];
		//                    arreglo[j] = tmp;
		//                }
		//            }
		//        }
	}
}
