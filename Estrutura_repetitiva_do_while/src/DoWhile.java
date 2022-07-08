import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp = 0; // quando usar o char tem que iniciar antes
		
		do{
		System.out.println("Digite a temperatura em Celsios: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5 + 32;
		System.out.printf("Equivalete em Fahenheit: %.1f%n", F);
		System.out.print("Deseja repetir? (s/n): ");
		 resp = sc.next().charAt(0);
		}while(resp != 'n');
		
		sc.close();

	}

}
