import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome1, nome2;
		int idade1, idade2;
		double mediaIdade;

		System.out.print("QUAL NOME DA PRIMEIRA PESSOA: ");
		nome1 = sc.nextLine();
		System.out.print("QUAL IDADE DA PRIMEIRA PESSOA: ");
		idade1 = sc.nextInt();

		
		
		System.out.print("QUAL NOME DA SEGUNDA PESSOA: ");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.print("QUAL IDADE DA SEGUNDA PESSOA: ");
		idade2 = sc.nextInt();

		mediaIdade = (double) (idade1 + idade2) / 2;

		System.out.println("A idade media de: " + nome1 + " e " + nome2 + " Eh de  " + mediaIdade);

		
		sc.close();
	}

}
