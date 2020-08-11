
public class Referenzen {
	public static void main(String[]  args) {
		int m = 5;
		int n = 6;
		System.out.println("M=" + m + " N=" + n);
		// ändert die variablen hier nicht es macht nur was in der funktion damit
		swap(m, n);
		// ändern der variablen
		int a = m, b = n;

	    int c = a;
	    a = b;
	    b = c;
		System.out.println("M=" + m + " N=" + n);
		System.out.println("M=" + a + " N=" + b);
		
	}
	private static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}
}
