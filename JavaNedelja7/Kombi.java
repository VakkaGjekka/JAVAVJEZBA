package src;

public class Kombi extends SystemOfCars {
	private int ManCapacity;
	

	public Kombi(String creator, int yearCreated, int kubikaza, String colour, int manCapacity) {
		super(creator, yearCreated, kubikaza, colour);
		ManCapacity = manCapacity;
	}


	public int getManCapacity() {
		return ManCapacity;
	}


	public void setManCapacity(int manCapacity) {
		ManCapacity = manCapacity;
	}


	@Override
	public String toString() {
		return "Kombi , ManCapacity=" + ManCapacity + "";
	}
	public double calculateLicensePlate() {
		double cijena = 0;
		
		if (getYearCreated() <=2010) {
			return  cijena + 50;
		}
		if(getKubikaza() > 2000) {
			return  cijena + 50;
		}
		if(ManCapacity > 8) {
			return cijena + 30;
		}return cijena;


	
	

	}
}

