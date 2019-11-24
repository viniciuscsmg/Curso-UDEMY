
public class Product {

	private String name;
	private double price;
	private int quantity;
	private Estoque estoque;
	
	public double totalValueInStock() {
		return price * quantity;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	@Override
	public String toString() {
		return "Nome: " + name + " - Preço: " + price + " - Quantidade: " + quantity;
	}

}
