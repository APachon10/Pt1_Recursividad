package BusquedaLinealRecursiva;

import java.util.Arrays;

public class BurbujasinBucle {
	public static void main(String[] args) {
		int vector [] = {2,1,9,8,20,100,1500,1000,10000,2500};
		int posicion =0;
		int posicion2 = 0;
		ordenacionBurbuja(vector, posicion,posicion2);
		System.out.println("Vector : "+Arrays.toString(vector));
	}	
	public static void ordenacionBurbuja(int [] v,int pos,int pos2) {
		int posss = v.length-1-pos;
		System.out.println("Hola: "+posss);
		if(pos == v.length-1) {
			return; 
		}else if( pos2 == v.length-1-pos){
			ordenacionBurbuja(v, pos+1, 0);
			return;
		}else if(v[pos]>v[pos+1]) {
			ordenacionBurbuja(v, pos, pos2+1);
			return;
		}
		return ;
	}
}
