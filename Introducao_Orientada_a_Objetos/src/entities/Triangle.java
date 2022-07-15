package entities;//pacote da classe

public class Triangle {//<- nome da classe
	public double a;//<- "public" indica que o atributo ou método pode ser usado em outros arquivos
	public double b;//<- double a,b,c; Atributos da classe
	public double c;
	
	public double area() {//area() nome do método 
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
