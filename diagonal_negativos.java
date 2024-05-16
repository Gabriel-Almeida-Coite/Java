import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, cont;

		System.out.println("QUAL A ORDEM DA MATRIZ: ");
		n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("ELEMENTO [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();

			}

		}
		System.out.println("DIAGONAL PRINCIAL: ");
		for (int i = 0; i < n; i++) {

			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		cont = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					cont = cont + 1;

				}
			}

		}
		System.out.print("QUANTIDADE NEGATIVOS: " + cont);
	}

}
