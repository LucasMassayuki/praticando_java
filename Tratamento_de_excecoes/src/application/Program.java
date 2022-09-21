package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		
	}
	public static void method1() {
		System.out.println("***METHO1 START***");
		method2();
		System.out.println("***METHO1 END***");
	}
	public static void method2() {
		System.out.println("***METHO2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {//caso digite um numero fora da posição
			System.out.println("invalid position!");
			e.printStackTrace();//imprime na tela o rastriamento de Stack
			sc.next();
		}
		catch(InputMismatchException e) {//caso digite letras na hora de digitar int position = sc.extDouble();
			System.out.println("input error");
		}
		sc.close();
		System.out.println("***METHO2 END***");
	}
}
