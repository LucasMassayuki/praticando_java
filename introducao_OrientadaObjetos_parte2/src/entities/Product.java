package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;// retorna o preço e quantidade
	}

	public void addProducts(int quantity) {// somar mais o produtos
		this.quantity += quantity;// usando this para somar quantity da calsse Product e método addProduct
	}

	public void renoveProducts(int quantity) {// método para subtrair o produto
		this.quantity -= quantity;
	}

	public String toString() {
		return name // mostra o nome do produtos
				+ ", $ " + String.format("%.2f", price) // pra definir 2 casas decimais no price
				+ ", " + quantity // quantidades
				+ " units, Total: $ " + String.format("%.2f", totalValueInStock()); // total do valor
	}
}
