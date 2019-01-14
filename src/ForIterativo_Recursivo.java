
public class ForIterativo_Recursivo {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int i=0;
		int j=0;
		System.out.println("Resultado:");
		
		System.out.println("Metodo Iterativo ");
		dobleForIterativo(a, b);
		System.out.println("Metodo Recursivo");
		dobleForRecursivo(a, b, i, j);
	}
	public static void dobleForIterativo(int n,int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("i = "+i+", j = "+j);
			}
			System.out.println("====================");
		}
	}
	public static void dobleForRecursivo(int n,int m,int i,int j ) {
		//Caso Base
		if (i>n) {
			return;
		}
		if (i<n) {
			if (j<m) {
				System.out.println("i = "+i+", j ="+j);
				System.out.println("=================");
				dobleForRecursivo(n, m, i, j+1);
				return;
			}
			if (j==m) {
				dobleForRecursivo(n, m, i+1, 0);
				return;
			}
			if (i==1 && j==1) {
				System.out.println("HOla");
			}
		}
		
	}
}
