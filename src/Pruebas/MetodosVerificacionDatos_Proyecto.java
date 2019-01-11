package Pruebas;

import java.util.Scanner;

public class MetodosVerificacionDatos_Proyecto {
	public static void main(String[] args) {
		String dni =null; 
		dni = verificarDNI(dni);
		System.out.println(dni);
	}
	public static String verificarDNI(String palabra ) {
		Scanner scan  =new Scanner(System.in);
		String DNI = "";
		boolean salir = false;
		while(!salir) {
			DNI = scan.next();
			if(DNI.length()>9 || DNI.length()<9){
				System.out.println("Longitud de DNI incorrecta , vuelve a introducirlo por favor ");
				salir = false;
			}else if(DNI.length() == 9) {
				System.out.println("DNI introducido correctamente");
				salir=true;
			}
		}
		return DNI;
		
		
	}
}
