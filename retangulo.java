
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("BASE DO RETANGULO:");
		base = sc.nextDouble();
		
		System.out.print("ALTURA DO RETANGULO:");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.println("AREA = " + String.format("%.4f",area));
		System.out.println("PERIMETRO = " + String.format("%.4f",perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f",diagonal));
		
	}

}
