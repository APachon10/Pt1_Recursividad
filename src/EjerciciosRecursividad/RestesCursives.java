package EjerciciosRecursividad;

import java.util.Scanner;

public class RestesCursives {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Dividendo =0;
		int Divisor = 0;
		System.out.print("Introduce el Dividendo: ");
		Dividendo =scan.nextInt();
		System.out.print("Introduce el Divisor:");
		Divisor =scan.nextInt();
		scan.close();
		System.out.println("Resultado");
		System.out.println("El resultado "+ restasRecursivas(Dividendo, Divisor));
		
	}
	public static int restasRecursivas(int Divd,int Divs) {
		int res=0;
		if(Divd>=Divs) {
			res = restasRecursivas(Divd-Divs,Divs)+1;
			return res;
		}
		return 0;
	}
	
	
}
