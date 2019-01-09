package EjercicosRecursividad_Pt2;

public class fibonaacimejorado {
	public static void main(String[] args) {
		int n=5;
		int fibonaaci []= new int [n];
		
		fibonaaci[0] =0;
		fibonaaci[1] = 1;
	}
	public int fibArray(int n , int [] fib) {
		/*if(n<2) {
			return 	fib(n);
		}*/
		if(fib[n-1]!=0) {
			return  fib[n-1] + fib[n-2];
		}else if(fib[n-1] ==0 && fib[n-2]!=0) {
			return fibArray(n-1, fib)+ fib[n-2];
		}
		return fibArray(n-1, fib)+fib[n-2];
	}
}
