package scanner;

import java.util.Scanner;

public class tipos_de_scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Assim consegue digitar com Scanner: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close(); //Para fechar o Scanner é necessário 
		

	}

}
