package EjerciciosRecursividad;

import java.util.Scanner;

public class SumarDigitos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		SumarDigitos sd = new SumarDigitos();
		
		System.out.print("Introduce un Numero:");
		numero = scan.nextInt();
		System.out.println("===============");
		System.out.println("Resultado : La suma de todos los digitos del numero "+sd.sumarDigitosNumero(numero));
	}
	public int sumarDigitosNumero(int Numero) {
		int digito = 0;
		if(Numero!=0){
			digito = Numero/10;
			return sumarDigitosNumero(digito) + Numero%10;
        }
		return 0;
	}
}
