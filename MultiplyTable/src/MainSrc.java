/**
 * A simple program that demonstrates how Multiplication Table works. What is a
 * Multiplication Table?: https://www.mathsisfun.com/tables.html
 * 
 */

public class MainSrc {

	public static void main(String[] args) {
		// x = row and y = column. z = product of x & y
		int x, y, z = 0;
		for (y = 1; y <= 12; y++) {
			for (x = 1; x <= 12; x++) {
				z = x * y;
				// e.g. 1 * 2 = 2
				System.out.print(z + "\t");
			}
			System.out.print("\n");
		}
	}
	// Hope you like it! :)
}
