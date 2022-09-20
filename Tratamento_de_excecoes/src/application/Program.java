package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {//caso digite um numero fora da posição
			System.out.println("invalid position!");
		}
		catch(InputMismatchException e) {//caso digite letras na hora de digitar int position = sc.extDouble();
			System.out.println("input error");
		}
		System.out.println("End of program");
		sc.close();
	}

}
