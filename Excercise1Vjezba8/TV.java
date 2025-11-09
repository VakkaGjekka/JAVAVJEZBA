package udg.edu.me;

public class TV extends Eproducts {
	private double screenSize;

	public TV(String productDescription, int productId, double importPrice, double screenSize) {
		super(productDescription, productId, importPrice);
		this.screenSize = screenSize;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "TV screenSize=" + screenSize + "";
		
	}
	protected double applyTypeSpecificIncrease(double price) {
        // TV +10% if screen > 65 inches
        if (screenSize > 65.0) return price * 1.10;
        return price;
    }
	
	

}
