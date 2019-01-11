package Pruebas;

import java.util.Scanner;

public class MetodosVerificacionDatos_Proyecto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dni =null; 
		int codigo = scan.nextInt();
		verficarCodigo(codigo);
//		dni = verificarDNI(dni);
//		System.out.println(dni);
//		System.out.println("============");
		System.out.println("tel "+ codigo);
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
	public static  int verficarCodigo(int codigo ) {
		boolean salir = false;
		System.out.println(codigo);
		while(!salir) {
			if (codigo>=1 && codigo <=100) {
				salir  =true;
			}
		}
		return codigo;
	}
}
