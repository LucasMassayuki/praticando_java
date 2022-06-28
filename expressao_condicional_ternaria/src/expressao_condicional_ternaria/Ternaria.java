package expressao_condicional_ternaria;

import java.util.Scanner;

public class Ternaria {

	public static void main(String[] args) {
		
		double preco = 34.5;//forma de Expressão condicional ternária
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
	    //if(preco < 20) { forma de if-else
		//	desconto = preco * 0.1;
		//}
		//else {
		//	desconto = preco * 0.05;
		//}
		
		System.out.println(desconto);
		

	}

}
