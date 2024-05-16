import java.util.Locale;
import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.println("DIGITE 2 NUMEROS: ");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != y) {
			if (x < y) {

				System.out.println("CRESCENTE");
			} else {

				System.out.println("DECRECENTE");
			}
			System.out.println("DIGITE OUTROS DOIS NUMEROS:");
			x = sc.nextInt();
			y = sc.nextInt();

		}

	}

}
