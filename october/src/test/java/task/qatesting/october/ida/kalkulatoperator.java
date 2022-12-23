
package task.qatesting.october.ida;

public class kalkulatoperator {
	
	
	final static String TAMBAH = "+";
	final static String KURANG = "-";
	final static String KALI = "*";
	final static String BAGI = "/";
	//final static String KALI = "*";
	//final static String BAGI = "/";
	
	
	public static void Displayed(int x, int y, String operator, int z) {
		System.out.println(x + ""+ operator + " "+ y + " = " +z);
	}
	
	//method untuk operasi tambah 
	public static void tambah (int x, int y) {
		Displayed(x, y, TAMBAH, x+y);
	}
	
	//method untuk operasi pengurangan
	public static void pengurangan (int x, int y) {
		Displayed(x, y, KURANG, x-y);
	}
	public static void kali (int x, int y) {
		Displayed(x, y, KALI, x*y);
	}
	public static void bagi(int x, int y) {
		Displayed(x, y, BAGI, x/y);
	}


	//method untuk operasi Perkalian
	//public static void perkalian (int x, int y) {
	//	Displayed(x, y, KALI, x*y);
	//}

	//method untuk operasi pembagian 
	//public static void pembagian (int x, int y) {
	//	Displayed(x, y, BAGI, x/y);
	//}
}
