package src;

public class Kamion extends SystemOfCars {
	private int kapacitetTereta;
	private boolean prikolica;
	
	
	public Kamion(String creator, int yearCreated, int kubikaza, String colour, int kapacitetTereta,
			boolean prikolica) {
		super(creator, yearCreated, kubikaza, colour);
		this.kapacitetTereta = kapacitetTereta;
		this.prikolica = prikolica;
	}


	public int getKapacitetTereta() {
		return kapacitetTereta;
	}


	public void setKapacitetTereta(int kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}


	public boolean isPrikolica() {
		return prikolica;
	}


	public void setPrikolica(boolean prikolica) {
		this.prikolica = prikolica;
	}


	@Override
	public String toString() {
		return "Kamion kapacitetTereta=" + kapacitetTereta + ", prikolica=" + prikolica + "";
	}
	public double calculateLicensePlate() {
		double cijena = 0;
		
		if (getYearCreated() <=2010) {
			return  cijena + 50;
		}
		if(getKubikaza() > 2000) {
			return  cijena + 50;
		}
		if(prikolica = true) {
			return cijena + 50;
		}return cijena;
	}
	
}




	
	
	
	


