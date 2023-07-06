
public class tebal {
	public static void main(String[] args) {

		int i, j, k, n = 10;

		for (i = 1; i <= 10; i++) {

			for (k = n ; k >= 1; k--) {
				System.out.print("  ");
			}

			for (j = 1; j <= i; j++) {

				System.out.print(i + "    ");

			}
			System.out.println();
			n = n - 1;
		}
	}

}
