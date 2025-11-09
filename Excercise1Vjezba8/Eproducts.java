package udg.edu.me;

public abstract class Eproducts {
	private String productDescription;
	private int productId;
	private double importPrice;
	
	public Eproducts(String productDescription, int productId, double importPrice) {
	
		this.productDescription = productDescription;
		this.productId = productId;
		this.importPrice = importPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getImportPrice() {
		return importPrice;
	}

	public void setImportPrice(double importPrice) {
		this.importPrice = importPrice;
	}

	@Override
	public String toString() {
		return "Eproducts productDescription=" + productDescription + ", productId=" + productId + ", importPrice="
				+ importPrice + "";
	}

	public double RetailPrice() {
		double price = importPrice * 1.05;
	    return applyTypeSpecificIncrease(price);
}
	 protected abstract double applyTypeSpecificIncrease(double price);
}

