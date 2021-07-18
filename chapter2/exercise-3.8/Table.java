public class Table {
	public static void main(String[] args) {
		System.out.println("   a        b    Middle Point");

		System.out.print("(0, 0)   (2, 1)   ");
		System.out.println("(" + ((0 + 2) / 2.0) + ", " + ((0 + 1) / 2.0) + ")");

		System.out.print("(1, 4)   (4, 2)   ");
		System.out.println("(" + ((1 + 4) / 2.0) + ", " + ((4 + 2) / 2.0) + ")");

		System.out.print("(2, 7)   (6, 3)   ");
		System.out.println("(" + ((2 + 6) / 2.0) + ", " + ((7 + 3) / 2.0) + ")");

		System.out.print("(3, 9)   (10, 5)  ");
		System.out.println("(" + ((3 + 10) / 2.0) + ", " + ((9 + 5) / 2.0) + ")");

		System.out.print("(4, 11)  (12, 7)  ");
		System.out.println("(" + ((4 + 12) / 2.0) + ", " + ((11 + 7) / 2.0) + ")");
	}
}