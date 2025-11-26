package src;

public class SystemOfCars {
	private String creator;
	private int yearCreated;
	private int kubikaza;
	private String colour;
	public SystemOfCars(String creator, int yearCreated, int kubikaza, String colour) {
		this.creator = creator;
		this.yearCreated = yearCreated;
		this.kubikaza = kubikaza;
		this.colour = colour;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getYearCreated() {
		return yearCreated;
	}
	public void setYearCreated(int yearCreated) {
		this.yearCreated = yearCreated;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	

	@Override
	public String toString() {
		return "SystemOfCars creator=" + creator + ", yearCreated=" + yearCreated + ", kubikaza=" + kubikaza
				+ ", colour=" + colour + "";
	}
	public double calculateLicensePlate() {
		double cijena = 0;
		if (yearCreated <=2010) {
			return  cijena + 50;
		}
		return cijena;
	}
	
	
	
	

}
