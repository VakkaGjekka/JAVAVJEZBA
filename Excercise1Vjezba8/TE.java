package udg.edu.me;

public class TE extends Eproducts {
	private String operatingSystem;
	private double screenSize;
	
	public TE(String productDescription, int productId, double importPrice, String operatingSystem, double screenSize) {
		super(productDescription, productId, importPrice);
		this.operatingSystem = operatingSystem;
		this.screenSize = screenSize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	protected double applyTypeSpecificIncrease(double price) {
        // Phones: if screen > 6 inches, +3%
        if (screenSize > 6.0) return price * 1.03;
        return price;
    }

	@Override
	public String toString() {
		return "TE operatingSystem=" + operatingSystem + ", screenSize=" + screenSize + "";
	}
	
	
	
	

}
