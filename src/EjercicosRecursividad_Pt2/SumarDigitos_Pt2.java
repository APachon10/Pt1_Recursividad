package EjercicosRecursividad_Pt2;

import java.util.Scanner;

public class SumarDigitos_Pt2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		SumarDigitos_Pt2 sd = new SumarDigitos_Pt2();
		
		System.out.print("Introduce un Numero:");
		numero = scan.nextInt();
		scan.close();
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
