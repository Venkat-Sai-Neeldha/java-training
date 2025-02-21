package collections;
public class Product {
    private String name;
    private int stocks;

 public Product(int stocks, String name) {
	 this.stocks= stocks;
     this.name = name;
}

	public String getName() {
        return name;
    }

    public int getStockLevel() {
        return stocks;
    }

    public void setStockLevel(int stocks) {
        this.stocks = stocks;
    }

    public String toString() {
        return "Product{Stocks=" + stocks + ", name='" + name + "'}";
    }
}