package BusquedaLinealRecursiva;

public class TorresHanoi {
	public static void main(String[] args) {
		hanoi(3, "origen", "aux", "torre3");
	}
	public static void hanoi(int discos,String torre1,String torre2,String torre3) {
		if (discos == 1) {
			System.out.println("mover disco de torre "+ torre1 + " a torre "+ torre3);
			return;
		}
		hanoi(discos-1, torre1, torre3, torre2);
		
		hanoi(discos-1, torre2, torre3, torre1);
	}
}
