package src;

public class Automobil extends SystemOfCars {
	private int AmountDoors;
	private String TypeMotor;
	private String fuelType;
	
	
	
	
	
	public Automobil(String creator, int yearCreated, int kubikaza, String colour, int amountDoors, String typeMotor, String fuelType) {
		super(creator, yearCreated, kubikaza, colour);
		AmountDoors = amountDoors;
		TypeMotor = typeMotor;
		fuelType = fuelType;
	}
	





	






	public int getAmountDoors() {
		return AmountDoors;
	}






	public void setAmountDoors(int amountDoors) {
		AmountDoors = amountDoors;
	}






	public String getTypeMotor() {
		return TypeMotor;
	}






	public void setTypeMotor(String typeMotor) {
		TypeMotor = typeMotor;
	}
	@Override
	public String toString() {
		return "Automobil AmountDoors=" + AmountDoors + ", TypeMotor=" + TypeMotor + "";
	}
	public double calculateLicensePlate() {
		double cijena = 0;
		
		if (getYearCreated() <=2010) {
			return  cijena + 50;
		}
		if(getKubikaza() > 2000) {
			return  cijena + 50;
		}
	     if(fuelType.equals("dizel")) {
	    	 return cijena + 20;
	     } return cijena;
		
	}






	
	
	
	
	

	

}
