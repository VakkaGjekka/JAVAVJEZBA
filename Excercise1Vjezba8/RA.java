package udg.edu.me;

public class RA extends Eproducts {
	
	private String processor;
	private String memory;
	public RA(String productDescription, int productId, double importPrice, String processor, String memory) {
		super(productDescription, productId, importPrice);
		this.processor = processor;
		this.memory = memory;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "RA processor=" + processor + ", memory=" + memory + ", " + super.toString();
		
	}
	 protected double applyTypeSpecificIncrease(double price) {
	        // Computers get +5% on already increased price
	        return price * 1.05;
	    }
	
	
	

}
